class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
       int closestSum = nums[0] + nums[1] + nums[2];
       int n= nums.length;
       for(int i=0;i<n;i++){
        int left=i+1;
        int right=n-1;
       
        while(left<right){
             int sum=nums[i]+nums[left]+nums[right];
            if(Math.abs(closestSum-target)>Math.abs(sum-target)) closestSum=sum;
            if(sum>target){
                right--;
            }
            else if(sum<target) left++;
            else return sum;
        }
       }
       return closestSum;
    }
}