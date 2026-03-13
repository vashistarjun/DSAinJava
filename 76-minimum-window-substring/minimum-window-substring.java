class Solution {
    public String minWindow(String s, String t) {
        Map<Character,Integer> map= new HashMap<>();
        for(char ch:t.toCharArray()){
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        int left=0;
        int right=0;
        int minlen=(int)1e8;
        int start=-1;
        int need=0;
        while(right<s.length()){
            char ch=s.charAt(right);
            if(map.containsKey(ch)){
                if(map.get(ch)>0){
                    need++;
                }
                map.put(ch,map.get(ch)-1);
            }
            right++;
            while(need==t.length()){
                if(minlen>right-left){
                    minlen=right-left;
                    start=left;
                }
                char c=s.charAt(left);
                if(map.containsKey(c)){
                    map.put(c,map.get(c)+1);
                    if(map.get(c)>0){
                        need--;
                    }
                }
                left++;
            }
        }
        return minlen==(int)1e8 ? "" : s.substring(start,start+minlen);
    }
}