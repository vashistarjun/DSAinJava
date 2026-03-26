class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set= new HashSet<>();
        for(int num:nums) set.add(num);
        int count=0;
        int max=0;
        for(int n:set){
            if(!set.contains(n-1)){
                count=0;
                int curr=n;
                while(set.contains(curr)) {
                    count++;
                    curr=curr+1;
                }
                max=Math.max(max,count);
            }
            
        }
        return max;
    }
}