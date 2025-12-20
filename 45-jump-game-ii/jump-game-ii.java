class Solution {
    Integer dp[];
    public int jump(int[] nums) {
        dp= new Integer[nums.length];
        return f(0,nums);
    }
    public int f(int index,int nums[]){
        if(index>=nums.length-1) return 0;
        int jump=(int)1e8;
        if(dp[index]!=null) return dp[index];
        for(int i=1;i<=nums[index];i++){
            jump=Math.min(jump,1+f(index+i,nums));
        }
        return dp[index]=jump;
    }
}