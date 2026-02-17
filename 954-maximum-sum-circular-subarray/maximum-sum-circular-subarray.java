class Solution {
    public int maxSubarraySumCircular(int[] nums) {
        int n=nums.length;
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        int currM=0;
        int total=0;
        int currm=0;
        for(int i=0;i<n;i++){
            currM=Math.max(currM+nums[i],nums[i]);
            currm=Math.min(currm+nums[i],nums[i]);

            max=Math.max(currM,max);
            min=Math.min(currm,min);

            total+=nums[i];
        }
       total-=min;
       if(max<0) return max;
       return Math.max(max,total);
    }
}