class Solution {
    List<List<Integer>> ans;
    public List<List<Integer>> generate(int n) {
        ans= new ArrayList<>();
        
        for(int i=1;i<=n;i++){
            List<Integer> a= new ArrayList<>();
            a=f(i);
            ans.add(a);
        }
        return ans;

        
    }
    public List<Integer> f(int row){
        List<Integer> list= new ArrayList<>();
        int val=1;
        list.add(val);
        for(int col=1;col<row;col++){
            val*=(row-col);
            val/=col;
            list.add(val);
        }
        return list;
    }
}