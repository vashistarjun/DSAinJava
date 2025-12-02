class Solution {
    public int[] runningSum(int[] nums) {
        int arr[]= new int[nums.length];
        int sum=nums[0];
        int j=0;
        arr[j]=sum;
        for(int i=1;i<nums.length;i++){
            arr[i]=arr[j++]+nums[i];
        }
        return arr;
    }
}