class Solution {
    public int maxProduct(int[] nums) {
        int min=nums[0];
        int max=nums[0];
        int ans=nums[0];
         for(int i = 1; i < nums.length; i++){
            int val=nums[i];
            if(val<0){
                int temp=min;
                min=max;
                max=temp;
            }
            min=Math.min(min*val,val);
            max=Math.max(max*val,val);
            ans=Math.max(ans,max);
        }
        return ans;
    }
}