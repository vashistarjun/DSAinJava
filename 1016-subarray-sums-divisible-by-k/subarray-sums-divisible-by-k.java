class Solution {
    public int subarraysDivByK(int[] nums, int k) {
        int count=0;
        Map<Integer,Integer> map= new HashMap<>();
        map.put(0,1);
        int prefix=0;
        for(int num:nums){
            prefix+=num;
            int r=prefix%k;
            if(r<0) r+=k;
            if(map.containsKey(r)){
                count+=map.get(r);
            }
            map.put(r,map.getOrDefault(r,0)+1);
        }
        return count;
    }
}