class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
        Map<Integer,Integer> map =  new HashMap<>();
        for(int i=0;i<nums.length;i++){
            nums[i]%=2;
        }
        map.put(0,1);
        int count=0;
        int preSum=0;
        for(int i=0;i<nums.length;i++){
            preSum+=nums[i];
            if(map.containsKey(preSum-k)){
                count+=map.get(preSum-k);
            }  
            map.put(preSum,map.getOrDefault(preSum,0)+1);
        }
        return count;
    }
}