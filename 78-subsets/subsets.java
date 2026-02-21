class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> list= new ArrayList<>();
        List<Integer> l= new ArrayList<>();
        backtrack(0,nums,list,l);
        return list;
        }
        public void backtrack(int index,int nums[],List<List<Integer>> list,List<Integer> l){
            list.add(new ArrayList<>(l));
            for(int i=index;i<nums.length;i++){
                l.add(nums[i]);
                backtrack(i+1,nums,list,l);
                l.remove(l.size()-1);
            }
        }

}