class Solution {
    Integer dp[][];
    public int lengthOfLIS(int[] nums) {
        int n=nums.length;
        dp= new Integer[n][n+1];
        return f(0,-1,nums);
    }
    public int f(int index,int prev,int nums[]){
        if(index==nums.length)return 0;
        if(dp[index][prev+1]!=null) return dp[index][prev+1];
        int npick=f(index+1,prev,nums);
        int pick=Integer.MIN_VALUE;
        if(prev==-1 || nums[prev]<nums[index]){
            pick=1+f(index+1,index,nums);
        }
        return dp[index][prev+1]=Math.max(npick,pick);
    }
}