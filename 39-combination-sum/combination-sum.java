class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
         List<List<Integer>> list= new ArrayList<>();
        List<Integer> l= new ArrayList<>();
        backtrack(0,candidates,target,list,l);
        return list;
    }
    public void backtrack(int index,int candidates[],int target,List<List<Integer>> list,List<Integer> l){
        if(target==0){
            list.add(new ArrayList<>(l));
            return;
        }
        if(target<0) return ;
        for(int i=index;i<candidates.length;i++){
            l.add(candidates[i]);
            backtrack(i,candidates,target-candidates[i],list,l);
            l.remove(l.size()-1);
        }
    }
}