class Solution {
    public List<Integer> eventualSafeNodes(int[][] graph) {
        int n=graph.length;
        int indegree[]= new int[n];
        List<List<Integer>> adj= new ArrayList<>();
        for(int i=0;i<n;i++) adj.add(new ArrayList<>());
            for(int u=0;u<n;u++){
            for(int v:graph[u]){
                adj.get(v).add(u);
                indegree[u]++;
            }
        }
        List<Integer> list= new ArrayList<>();
        Queue<Integer> queue= new LinkedList<>();
        for(int i=0;i<n;i++){
            if(indegree[i]==0) queue.add(i);
        }
        while(!queue.isEmpty()){
            int curr=queue.poll();
            list.add(curr);
            for(int nei:adj.get(curr)){
                indegree[nei]--;
                if(indegree[nei]==0) queue.add(nei);
            }
        }
        Collections.sort(list);
        return list;
    }
}