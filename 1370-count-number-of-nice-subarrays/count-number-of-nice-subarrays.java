class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
        return f(nums,k)-f(nums,k-1);
    }
    public int f(int []nums,int k){
        int oddCount=0;
        int count=0;
        int left=0;
      int n=nums.length;
        for(int right=0;right<n;right++){
                if(nums[right]%2!=0) oddCount++;
                while(oddCount>k){
                    if(nums[left]%2!=0) oddCount--;
                    left++;
                }
                count+=right-left+1;
        }
        return count;
    }
    
}