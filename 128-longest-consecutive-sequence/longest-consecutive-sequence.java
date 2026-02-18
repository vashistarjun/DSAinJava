class Solution {
    public int longestConsecutive(int[] nums) {
        Arrays.sort(nums);
        int n=nums.length;
    if(n==0) return 0;
        int count=1;
        int max=1;
        for(int i=0;i<n-1;i++){
            if(nums[i]+1==nums[i+1]){
                count++;
            }
            else if(nums[i]==nums[i+1]) {
                continue;
            }

            else{
                count=1;
            }
            max=Math.max(max,count);
        }
        max=Math.max(max,count);
        return max;
    }
}