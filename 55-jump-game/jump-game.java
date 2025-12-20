class Solution {
    Boolean dp[];
    public boolean canJump(int[] nums) {
        dp= new Boolean[nums.length];
        return f(0,nums);
    }
    public boolean f(int index,int []nums){
        if(index>=nums.length-1) return true;
        boolean temp=false;
        if(dp[index]!=null) return dp[index];
        for(int i=1;i<=nums[index];i++){
            temp=f(index+i,nums);
            if(temp) return dp[index]=true;
        }
        return dp[index]=temp;
    }
}