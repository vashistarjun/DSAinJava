class Solution {
    Integer dp[][];
    public int longestCommonSubsequence(String text1, String text2) {
        int n=text1.length();
        int m=text2.length();
        dp= new Integer[n][m];
        return f( 0, 0, text1,text2);
    }
    public int f(int i,int j,String text1,String text2){
        if(i==text1.length() || j==text2.length()){
            return 0;
        }
        if(dp[i][j]!=null) return dp[i][j];
        if(text1.charAt(i)==text2.charAt(j)){
            return 1+f(i+1,j+1,text1,text2);
        }
        else {
            return dp[i][j]=Math.max(f(i+1,j,text1,text2),f(i,j+1,text1,text2));
        }
    }
}