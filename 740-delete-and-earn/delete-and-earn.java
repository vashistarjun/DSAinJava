class Solution {
    Integer dp[];
    public int deleteAndEarn(int[] nums) {
       int max=nums[0];
      
      for(int a:nums) max=Math.max(a,max);
       dp= new Integer[max+2];
      int arr[]= new int[max+1];
      for(int i=0;i<nums.length;i++){
        arr[nums[i]]+=nums[i];
      }
        return f(0,arr);
    }
    public int f(int index,int arr[]){
        if(index>=arr.length){
            return 0;
        }
        if(dp[index]!=null) return dp[index];
        int take=arr[index]+f(index+2,arr);
        int ntake=f(index+1,arr);
        return dp[index]=Math.max(take,ntake);
    }
}