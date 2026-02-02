class Solution {
    public int findDuplicate(int[] nums) {
       int s=nums[0];
       int f=nums[0];
        do{
            s=nums[s];
            f=nums[nums[f]];
        }
        while(f!=s);
         f=nums[0];
        while(f!=s){
            s=nums[s];
            f=nums[f];
        }
        return f;
    }
}