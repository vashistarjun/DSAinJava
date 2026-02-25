class Solution {
    public double findMaxAverage(int[] nums, int k) {
        double ans=0.0;
        double max=Double.NEGATIVE_INFINITY;
        int n=nums.length;
       // if(k==1 && nums.length==1) return nums[0];
        int left=0;
        for(int i=0;i<n;i++){
            ans+=nums[i];
            if(i>=k-1){
                ans/=k;
                max=Math.max(ans,max);
                ans*=k;
                ans-=nums[left++];
            }
        }
        return max;
    }
}