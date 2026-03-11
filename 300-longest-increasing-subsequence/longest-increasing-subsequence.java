class Solution {
    Integer dp[][];
    public int lengthOfLIS(int[] nums) {
        dp= new Integer[nums.length+1][nums.length+1];
        return f(-1,-0,nums);
    }
    public int f(int prev,int index,int []nums){
        if(index==nums.length) return 0;
        if(dp[prev+1][index]!=null) return dp[prev+1][index];
        int n=Integer.MIN_VALUE;

        if(prev==-1 || nums[prev]<nums[index]){
             n=1+f(index,index+1,nums);
        }
            int take=f(prev,index+1,nums);
            return dp[prev+1][index]=Math.max(n,take);
    }
}