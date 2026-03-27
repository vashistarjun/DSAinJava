class Solution {
    public int missingNumber(int[] nums) {
        int n=nums.length;
        for(int i=0;i<n;i++){
            if(nums[i]!=i && nums[i]<n){
                int correct=nums[i];
                int temp=nums[i];
                nums[i]=nums[correct];
                nums[correct]=temp;
                i--;
            }
        }
        for(int i=0;i<n;i++){
            if(nums[i]!=i) return i;
        }
        return n;
    }
}