class Solution {
    public int majorityElement(int[] nums) {
        int count=0;
        int ans=0;
        for(int x: nums){
            if(count==0){
                ans=x;
            }
            if(x== ans){
                count++;
            }
            else{
                count--;
            }
        }
        return ans;
    }
}