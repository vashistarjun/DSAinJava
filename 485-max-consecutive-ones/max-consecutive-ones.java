class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int left=0;
        int right=0;
        int max=0;
        while(right<nums.length){
            if(nums[right]==0){
                max=Math.max(right-left,max);
                left=right+1;
            }
            right++;

        }
         max = Math.max(max, right - left);
        return max;
    }
}