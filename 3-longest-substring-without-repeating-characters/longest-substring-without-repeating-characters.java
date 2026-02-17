class Solution {
    public int lengthOfLongestSubstring(String s) {
     int freq[]= new int[256];
     int max=0;
     int left=0;
     for(int i=0;i<s.length();i++){
        char ch=s.charAt(i);
       if(freq[ch]>=1){
        while(freq[ch]>0){
            freq[s.charAt(left)]--;
            left++;
        }
       }
       
        freq[ch]++;
       
       max=Math.max(i-left+1,max);
       
     }   
     return max;
    }
}