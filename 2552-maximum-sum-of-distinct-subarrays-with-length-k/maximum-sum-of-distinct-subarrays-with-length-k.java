class Solution {
    public long maximumSubarraySum(int[] nums, int k) {
        long ans=0;
        long max=0;
        int left=0;
        LinkedHashMap<Integer,Integer> map= new LinkedHashMap<>();
        for(int i=0;i<nums.length;i++){

            if(!map.containsKey(nums[i])){
                map.put(nums[i],1);
                 ans+=nums[i];
            }
            else{
                while(map.containsKey(nums[i])){
                    map.remove(nums[left]);
                    ans-=nums[left++];
                }
                map.put(nums[i],1);
                ans+=nums[i];
            }
            if(map.size()==k){
                max=Math.max(max,ans);
            }
            else if(map.size()>k){
                map.remove(nums[left]);
                ans-=nums[left++];
                  max=Math.max(max,ans);
            }
        }
            return max;
    }
}