class Solution {
    Boolean dp[][];
    public boolean checkValidString(String s) {
        dp= new Boolean[s.length()+1][s.length()+1];
        return f(0,s,0);
    }
    public boolean f(int index,String s,int count){
        if(index==s.length()){
            if(count==0) return true;
            else return false;
        }
        if(count<0) return false;
        if(dp[index][count]!=null){
            return dp[index][count];
        }
        if(s.charAt(index)=='(')
            return dp[index][count]=f(index+1,s,count+1);
        
        else if(s.charAt(index)==')') return dp[index][count]=f(index+1,s,count-1);
        else{
            boolean a=f(index+1,s,count);
            boolean b=f(index+1,s,count+1);
            boolean c=f(index+1,s,count-1);
            return dp[index][count]=(a||(b||c));
        }
    }
}