class Solution {
    public int characterReplacement(String s, int k) {
        int left=0;
        int freq[]= new int[26];
        int max=0;
        int len=0;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            freq[ch-'A']++;
            max=Math.max(max,freq[ch-'A']);
            while(i-left+1-max>k){
                freq[s.charAt(left++)-'A']--;
            }
            len=Math.max(len,i-left+1);
        }
        return len;
    }
}