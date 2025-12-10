class Solution {
    public boolean isBipartite(int[][] graph) {
        int n=graph.length;
        int visited[]= new int[n];
        int color[]=new int[n];
        for(int i=0;i<n;i++){
            if(visited[i]==0){
                if(!dfs(i,visited,color,graph,1)) return false;
            }
        }
        return true;
    }
    public boolean dfs(int i,int visited[],int color[],int graph[][],int c){
        visited[i]=1;
        color[i]=c;
        for(int nei:graph[i]){
            if(visited[nei]==0){
                if(!dfs(nei,visited,color,graph,-c)) return false;
            }
            else{
                if(color[nei]==c) return false; 
            }
        }
        return true;
    }
}