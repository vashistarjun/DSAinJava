class Solution {
    public String getPermutation(int n, int k) {
        List<String> list= new ArrayList<>();
        int visited[]= new int[n+1];
        backtrack(1,n,list,new StringBuilder(),visited);
        return list.get(k-1);

    }
    public void backtrack(int start,int n,List<String> list,
    StringBuilder sb,int visited[]){
        if(sb.length()==n){
            list.add(sb.toString());
            return;
        }
        for(int i=1;i<=n;i++){
            if(visited[i]==0){
                visited[i]=1;
                sb.append(i);
                backtrack(i,n,list,sb,visited);
                visited[i]=0;
                sb.deleteCharAt(sb.length()-1);
            }
        }
    }
}