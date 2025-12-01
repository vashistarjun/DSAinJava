class Solution {
    public int removeDuplicates(int[] nums) {
        int count=1;
        int i=0;
        while(i<nums.length-1){
            if(nums[i]!=nums[i+1]){
                nums[count]=nums[i+1];
                count++;
            }
            i++;
        }
        return count;
        
    }
}