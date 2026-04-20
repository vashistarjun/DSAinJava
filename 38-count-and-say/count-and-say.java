class Solution {
    public String countAndSay(int n) {
        StringBuilder sb= new StringBuilder();
        if(n==0) return "";
        if(n==1) return "1";
        sb.append('1');
        int j=1;
        while(j<n){
            int count=1;
            StringBuilder s= new StringBuilder();
            for(int i=1;i<sb.length();i++){
                char ch=sb.charAt(i);
                if(sb.charAt(i-1)==sb.charAt(i)) count++;
                else{
                    s.append(count);
                    s.append(sb.charAt(i-1));
                    count=1;
                }
            }
            
            s.append(count);
            s.append(sb.charAt(sb.length()-1));
            sb.setLength(0);
            sb.append(s);
            j++;
        }
        return sb.toString();
       
    }
}