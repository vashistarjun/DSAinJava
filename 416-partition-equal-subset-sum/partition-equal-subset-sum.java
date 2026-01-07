class Solution {
    Boolean dp[][];
    public boolean canPartition(int[] nums) {
        int n=nums.length;
        int totalSum=0;
        for(int num:nums){
            totalSum+=num;
        }
        if(totalSum%2!=0) return false;
        int target=totalSum/2;
        dp= new Boolean[n+1][target+1];
        return check(0,target,nums);
    }
    public boolean check(int index,int target,int nums[]){
        if(target==0) return true;
        if(index==nums.length){
            if(target==0) return true;
            else return false;
        }

        if(target<0) return false;
        if(dp[index][target]!=null) return dp[index][target];
        boolean ntake=check(index+1,target,nums);
        boolean take=check(index+1,target-nums[index],nums);
        return dp[index][target]=ntake || take;
    }
}