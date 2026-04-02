class Solution {
    public List<String> removeInvalidParentheses(String s) {
        Set<String> list= new HashSet<>();
        int left=0;
        int right=0;
        for(char ch: s.toCharArray()){
            if(ch=='(') left++;
            else if(ch==')'){
                if(left>0) left--;
                else right++;
            }
        }
        StringBuilder sb= new StringBuilder();
        backtrack(0,left,right,0,s,list,sb);
        return new ArrayList<>(list);
    }
    public void backtrack(int index,int left,int right,int open,String s,
    Set<String> list,StringBuilder sb){
    if(index==s.length()){
        if(left==0 && right==0 && open==0){
            list.add(sb.toString());
        }
        return;
    }
    char ch=s.charAt(index);
    if(ch=='(' && left>0){
        backtrack(index+1,left-1,right,open,s,list,sb);
    } 
    if(ch==')' && right>0){
        backtrack(index+1,left,right-1,open,s,list,sb);
    }
    sb.append(ch);
    if(ch!='(' && ch!=')'){
        backtrack(index+1,left,right,open,s,list,sb);
    }
    else if(ch=='('){
         backtrack(index+1,left,right,open+1,s,list,sb);
    }
    else if(ch==')' && open>0) {
         backtrack(index+1,left,right,open-1,s,list,sb);
    }
    sb.deleteCharAt(sb.length()-1);

}
}