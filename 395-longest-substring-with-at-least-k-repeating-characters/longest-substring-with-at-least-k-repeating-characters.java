class Solution {
    public int longestSubstring(String s, int k) {
        return helper(0,s.length(),s,k);
    }
    public int helper(int start,int end,String s,int k){
        if(end-start<k) return 0;
        int freq[]= new int[26];
        for(int i=start;i<end;i++){
    freq[s.charAt(i)-'a']++;
}
        for(int i=start;i<end;i++){
            if(freq[s.charAt(i)-'a']<k){
                int left=helper(start,i,s,k);
                int right=helper(i+1,end,s,k);

                return Math.max(left,right);
            }
        }
        return end-start;
    }
}