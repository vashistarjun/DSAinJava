class Solution {
    public int lengthOfLongestSubstring(String s) {
        int left=0;
        Set<Character> set= new HashSet<>();
        int max=0;
        int n=s.length();
        for(int i=0;i<n;i++){
            char ch=s.charAt(i);
            while(set.contains(ch)){
                set.remove(s.charAt(left++));
            }
            set.add(ch);
            max=Math.max(max,i-left+1);
        }
        return max;
    }
}