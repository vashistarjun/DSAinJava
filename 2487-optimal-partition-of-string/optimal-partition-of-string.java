class Solution {
    public int partitionString(String s) {
        int left = 0;
        int right = 0;
        Set<Character> set = new HashSet<>();
        int count = 0;

      while(right<s.length()){
        char ch=s.charAt(right);
        if(set.contains(ch)){
            count++;
            set.clear();
        }
        set.add(s.charAt(right));
        right++;
      }
      return count+1;
    }
}