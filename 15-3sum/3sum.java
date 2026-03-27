class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        int n = nums.length;
        Set<List<Integer>> list = new HashSet<>();
        for (int i = 0; i < n; i++) {
            int target = -nums[i];
            HashMap<Integer,Integer> map= new HashMap<>();
            for(int j=i+1;j<n;j++){
                int need=target-nums[j];
                if(map.containsKey(need)){
                    List<Integer> l= new ArrayList<>();
                    l.add(nums[i]);
                    l.add(nums[j]);
                    l.add(need);
                    Collections.sort(l);
                    list.add(l);
                }
                map.put(nums[j],j);
            }
        }
        return new ArrayList<>(list);
    }
}