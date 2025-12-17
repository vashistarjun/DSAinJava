class Solution {

    class pair {
        int node;
        int wt;

        pair(int node, int wt) {
            this.node = node;
            this.wt = wt;
        }
    }

    public int findTheCity(int n, int[][] edges, int distanceThreshold) {
        List<List<pair>> adj = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            adj.add(new ArrayList<>());
        }
        for (int e[] : edges) {
            int u = e[0];
            int v = e[1];
            int w = e[2];
            adj.get(u).add(new pair(v, w));
            adj.get(v).add(new pair(u, w));
        }
        int count = 0;
        int min = (int) (1e8);
        int ans = 0;
        for (int src = 0; src < n; src++) {
            int dist[] = new int[n];
            Arrays.fill(dist, (int) (1e8));
            dist[src] = 0;
            PriorityQueue<pair> pq = new PriorityQueue<>((a, b) -> a.wt - b.wt);
            pq.add(new pair(src, 0));
            while (!pq.isEmpty()) {
                pair poll = pq.poll();
                int node = poll.node;
                int dis = poll.wt;
                if (dis > dist[node])
                    continue;

                for (pair nei : adj.get(node)) {
                    if (dist[nei.node] > nei.wt + dis) {
                        dist[nei.node] = nei.wt + dis;
                        pq.add(new pair(nei.node, nei.wt + dis));
                    }
                }
            }
            int c = 0;
            for (int i = 0; i < dist.length; i++) {
                if (dist[i] <= distanceThreshold) {
                    c++;
                }
            }
            if (c < min || (c == min && src > ans)) {
                min = c;
                ans = src;
            }

            //dist=[3,4,7]
        }

        return ans;

    }
}