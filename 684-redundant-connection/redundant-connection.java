class Solution {
    class disjoint{
        int parent[];
        int rank[];
        disjoint(int n){
            parent= new int[n+1];
            rank= new int[n+1];
            for(int i=1;i<n+1;i++) parent[i]=i;

        }
        public int find(int x){
            if(parent[x]!=x){
                parent[x]=find(parent[x]);
            }
            return parent[x];
        }
        public void  union(int x,int y){
            int pv=find(x);
            int pu=find(y);
           
            if(rank[pu]>rank[pv]){
                parent[pv]=pu;
            }
             else if(rank[pu]<rank[pv]){
                parent[pu]=pv;
            }
            else{
                parent[pu]=pv;
                rank[pv]++;
            }

        } 
    }
    public int[] findRedundantConnection(int[][] edges) {
        disjoint ds= new disjoint(edges.length);
        for(int e[]:edges){
            int u=e[0];
            int v=e[1];
            if(ds.find(v)!=ds.find(u)){
                ds.union(v,u);
            }
            else{
                return new int[]{u,v};
            }
        }
        return new int[]{-1,-1};
    }
}