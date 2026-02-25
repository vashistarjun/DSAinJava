class Solution {
    public String longestCommonPrefix(String[] strs) {
      if(strs.length<1)  return "";
      StringBuilder sb= new StringBuilder();
        sb.append(strs[0]);
        for(String str:strs){
            int min=Math.min(sb.length(),str.length());
            int i=0;
            while(i<min){
                if(sb.charAt(i)==str.charAt(i)){
                    i++;
                }
                else {
                    break;
                }
            }
            sb.setLength(i);
        }
      return sb.toString();

    }
}