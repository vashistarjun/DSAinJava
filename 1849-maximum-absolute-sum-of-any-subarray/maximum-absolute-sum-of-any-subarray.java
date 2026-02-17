class Solution {

    public int maxAbsoluteSum(int[] nums) {
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        int currM=0;
        int currm=0;
        for(int i=0;i<nums.length;i++){
            currM+=nums[i];
            max=Math.max(max,currM);
            if(currM<0){
                currM=0;
            }
            currm+=nums[i];
            min=Math.min(min,currm);
            if(currm>0){
                currm=0;
            }

        }
        return Math.max(max,Math.abs(min));
    }
}