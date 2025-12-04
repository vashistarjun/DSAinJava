class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Set<List<Integer>> set= new HashSet<>();
       
        for(int i=0;i<nums.length;i++){
            int target=-nums[i];
             Map<Integer,Integer> map = new HashMap<>();
      
        for(int j=i+1;j<nums.length;j++){
            int need=target-nums[j];
            if(map.containsKey(need)){
                  List<Integer> list= new ArrayList<>();
                list.add(nums[i]);
                list.add(nums[j]);
                list.add(need);
                Collections.sort(list);
                set.add(list);
            }
            map.put(nums[j],j);
        }
        }
        return new ArrayList<>(set);
    }
}