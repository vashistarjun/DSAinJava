class Solution {
    class disJoint{
        int parent[];
        int rank[];
        disJoint(int n){
            parent= new int[n];
            rank= new int[n];
            for(int i=0;i<n;i++){
                parent[i]=i;
            }
        }
        public   int find(int x){
            if(x!=parent[x]){
                parent[x]=find(parent[x]);
            }
            return parent[x];
        }
        public  void union(int u,int v){
            int pu=find(u);
            int pv=find(v);
            if(pu==pv) return;
            else if(rank[pu]>rank[pv]){
                parent[pv]=pu;
            }
            else if(rank[pv]>rank[pu]){
                parent[pu]=pv;
            }
            else{
                parent[pu]=pv;
                rank[pv]++;
            }
        }
        public int parentCheck(){
            int count=0;
            for(int i=0;i<parent.length;i++){
                if(parent[i]==i) count++;
            }
            return count;
        }
    }
    public int makeConnected(int n, int[][] connections) {
        int count=0;
        disJoint ds= new disJoint(n); 
        for(int e[]:connections){
            int u=e[0];
            int v=e[1];
            if(ds.find(u)!=ds.find(v)){
                ds.union(u,v);
            }
            else{
                count++;
            }
        }
        int ans=ds.parentCheck();
        return (count>=ans-1) ? ans-1 : -1;

    }
}