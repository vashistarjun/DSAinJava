class Solution {
    public int numIdenticalPairs(int[] nums) {
        int ans=0;
        Map<Integer,Integer> map = new HashMap<>();
        for(int n:nums){
            if(map.containsKey(n)){
                ans+=map.get(n);
            }
            map.put(n,map.getOrDefault(n,0)+1);
        }
        return ans;
    }
}