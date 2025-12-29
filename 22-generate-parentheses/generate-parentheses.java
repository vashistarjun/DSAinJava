class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> list = new ArrayList<>(); 
        StringBuilder sb = new StringBuilder();
        helper(0, list, 0, n, sb);
        return list;
    }

    public void helper(int open, List<String> list, int close,int max, StringBuilder sb) {
        if(sb.length()==2*max){
            list.add(sb.toString());

            return;
        }
        if(open<max){
            helper(open+1,list,close,max,sb.append('('));
              sb.deleteCharAt(sb.length()-1);
        }
        if(open>close){
            helper(open,list,close+1,max,sb.append(')'));
              sb.deleteCharAt(sb.length()-1);
        }
    }
           
    
}