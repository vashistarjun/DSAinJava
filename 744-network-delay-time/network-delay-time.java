class Solution {
    class pair{
        int node;
        int delay;
        pair(int node,int delay){
            this.node=node;
            this.delay=delay;
        }
    }
    public int networkDelayTime(int[][] times, int n, int k) {
       
        PriorityQueue<pair> pq= new PriorityQueue<>((a,b)->a.delay-b.delay);
        List<List<pair>> adj= new ArrayList<>();
        for(int i=0;i<=n;i++){
            adj.add(new ArrayList<>());
        }
        for(int e[]:times){
            int u=e[0];
            int v=e[1];
            int d=e[2];
            adj.get(u).add(new pair(v,d));
        }
        int dist[]= new int[n+1];
        Arrays.fill(dist,Integer.MAX_VALUE);
        dist[k]=0;
        pq.add(new pair(k,0));
        while(!pq.isEmpty()){
            pair poll= pq.poll();
            int node=poll.node;
            int delay=poll.delay;
            if(delay > dist[node]) continue;
            
            for(pair nei:adj.get(node)){
                int next=nei.node;
                int d=nei.delay;
                if(dist[next]>d+delay){
                    dist[next]=d+delay;
                    pq.add(new pair(next,d+delay));
                }
            }
        }
         int ans = 0;
        for(int i=1; i<=n; i++){
            if(dist[i] == Integer.MAX_VALUE) return -1; // unreachable node
            ans = Math.max(ans, dist[i]);
        }
        
        return ans;
    }
}