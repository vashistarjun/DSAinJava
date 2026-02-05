class Solution {
    public String removeKdigits(String num, int k) {
        Stack<Integer> stack= new Stack<>();
        for(int i=0;i<num.length();i++){
            int x=num.charAt(i)-'0';
            while(!stack.isEmpty() && stack.peek()>x && k>0){
                stack.pop();
                k--;
            }
            stack.push(x);
        }
           while (k > 0 && !stack.isEmpty()) {
            stack.pop();
            k--;
        }
        StringBuilder sb= new StringBuilder();
        while(!stack.isEmpty()){
            int x=stack.pop();
            sb.append(x);
        }
        int index=0;
        sb.reverse();
        while(index<sb.length() && sb.charAt(index)=='0'){
            index++;
        }
        if(index==sb.length()) return "0";
        
      String res = sb.substring(index);
    return res.length() == 0 ? "0" : res;
    }
}