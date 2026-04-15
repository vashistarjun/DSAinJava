class Solution {
    Integer dp[];
    public int rob(int[] nums) {
        int n=nums.length;
        dp = new Integer[n];
        return f(0,nums);
    }
    public int f(int index,int nums[]){
        if(index>=nums.length) return 0;
        if(dp[index]!=null) return dp[index];
        int take=nums[index]+f(index+2,nums);
        int ntake=f(index+1,nums);
        return dp[index]=Math.max(take,ntake);
    }
}