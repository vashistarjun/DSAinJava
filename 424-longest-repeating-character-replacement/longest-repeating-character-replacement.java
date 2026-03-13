class Solution {
    public int characterReplacement(String s, int k) {
        int freq[]= new int[26];
        int left=0;
        int right=0;
        int maxLen=Integer.MIN_VALUE;
        int maxFreq=0;
        while(right<s.length()){
            char ch=s.charAt(right);
            freq[ch-'A']++;
            if(maxFreq<freq[ch-'A']){
                maxFreq=freq[ch-'A'];
            }
            while(right-left+1-maxFreq>k){
                char c=s.charAt(left);
                freq[c-'A']--;
                left++;
            }
            maxLen=Math.max(maxLen,right-left+1);
            right++;
        }
        return maxLen;
    }
}