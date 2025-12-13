class Solution {
    public String reorganizeString(String s) {
        Map<Character,Integer> map= new HashMap<>();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        PriorityQueue<Character> pq= new PriorityQueue<>((a,b)->map.get(b)-map.get(a));
        pq.addAll(map.keySet());
        if(map.get(pq.peek())> (s.length()+1)/2) return "";
        
        char result[]=new char[s.length()];
        int i=0;
        while(!pq.isEmpty()){
            char ch=pq.poll();
           for(int j=0;j<map.get(ch);j++){
            if(i>=s.length()) i=1;
            result[i]=ch;
            i+=2;
           }
        }
         return new String(result);


    }
}