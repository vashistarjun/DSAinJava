class Solution {
    public int[] rearrangeArray(int[] nums) {
        int m=nums.length;
        int arr[]= new int[m];
        int p=0;
        int n=1;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>0){
                arr[p]=nums[i];
                p+=2;
            }
            else{
                arr[n]=nums[i];
                n+=2;
            }
        }
        return arr;
    }
}