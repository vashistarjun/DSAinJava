class Solution {
    public long maximumSubarraySum(int[] nums, int k) {
        long max = 0;
        long sum = 0;
        LinkedHashSet<Integer> set = new LinkedHashSet<>();
        int left = 0;

        for (int i = 0; i < nums.length; i++) {
            if (!set.contains(nums[i])) {
                sum += nums[i];
                set.add(nums[i]);
            } else {
                while (set.contains(nums[i])) {
                    set.remove(nums[left]);
                    sum -= nums[left++];
                }
                set.add(nums[i]);
                sum += nums[i];
            }

            if (set.size() == k) {
                max = Math.max(sum, max);
            }
            else if(set.size()>k){
                set.remove(nums[left]);
                sum-=nums[left++];
                  max = Math.max(sum, max);
            }
        }

        return max;
    }
}