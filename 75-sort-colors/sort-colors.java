class Solution {
    public void sortColors(int[] nums) {
       int mid=0;
       int left=0;
       int right=nums.length-1;
       while(mid<=right){
        if(nums[mid]==2){
            int temp=nums[mid];
            nums[mid]=nums[right];
            nums[right]=temp;
            right--;
        }
        else if(nums[mid]==1){
           
            mid++;
        }
        else{
            int temp=nums[mid];
            nums[mid]=nums[left];
            nums[left]=temp;
            left++;
            mid++;

        }
       }
        
    }
}