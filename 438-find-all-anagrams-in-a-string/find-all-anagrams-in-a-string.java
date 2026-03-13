class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> list= new ArrayList<>();
        int freq[]= new int[26];
        for(char ch:p.toCharArray()){
            freq[ch-'a']++;
        }
        int need=p.length();
        int left=0;
        int right=0;
        while(right<s.length()){
            char ch=s.charAt(right);
            if(freq[ch-'a']>0) need--;
            freq[ch-'a']--;
            right++;
            if(need==0) list.add(left);
            while(right-left==p.length()){
                char c=s.charAt(left);
                if(freq[c-'a']>=0) need++;
                freq[c-'a']++;
                left++;
            }
        }
        return list;
    }
}