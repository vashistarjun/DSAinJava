class Solution {
    public int lengthOfLongestSubstring(String s) {
        LinkedHashSet<Character> set= new LinkedHashSet<>();
        int max=0;
        int left=0;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(!set.contains(ch)){
                set.add(ch);
            }
            else{
                max=Math.max(max,set.size());
                while (set.contains(ch)) {
                  
                    set.remove(s.charAt(left++));  // remove first inserted
                }
                set.add(ch);
            }
        }
        max=Math.max(max,set.size());
        return max;

    }
}