class Solution {
    public void nextPermutation(int[] nums) {
        int n=nums.length;
        int idx=-1;
        for(int i=nums.length-1;i>=1;i--){
            if(nums[i]>nums[i-1]){
                idx=i-1;
                break;
            }
        }
        if(idx==-1){
            reverse(0,n-1,nums);
            return;
        }
        for(int i=n-1;i>=0;i--){
            if(nums[i]>nums[idx]){
                int temp=nums[i];
                nums[i]=nums[idx];
                nums[idx]=temp;
                break;
            }
        }
        reverse(idx+1,n-1,nums);

    }
    public void reverse(int start,int end,int nums[]){
        while(start<end){
            int temp=nums[start];
            nums[start]=nums[end];
            nums[end]=temp;
            start++;
            end--;
        }

    }
}