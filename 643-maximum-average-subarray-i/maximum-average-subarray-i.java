class Solution {
    public double findMaxAverage(int[] nums, int k) {
        double ans=0.0;
        double max = Double.NEGATIVE_INFINITY; // 🔥 FIX 1
        for(int i=0;i<nums.length;i++){
            ans+=nums[i];
            if(i>=k-1){
                ans/=k;
                max=Math.max(ans,max);
                ans*=k;
                ans-=nums[i-k+1];
            }
        }
        return max;
    }
}