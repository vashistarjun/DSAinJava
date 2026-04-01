class Solution {

    class Disjoint {
        int[] parent;
        int[] rank;

        Disjoint(int n) {
            parent = new int[n];
            rank = new int[n];
            for (int i = 0; i < n; i++) parent[i] = i;
        }

        int find(int x) {
            if (parent[x] != x) {
                parent[x] = find(parent[x]);
            }
            return parent[x];
        }

        void union(int u, int v) {
            int pu = find(u);
            int pv = find(v);

            if (pu == pv) return;

            if (rank[pu] > rank[pv]) {
                parent[pv] = pu;
            } else if (rank[pv] > rank[pu]) {
                parent[pu] = pv;
            } else {
                parent[pv] = pu;
                rank[pu]++;
            }
        }
    }

    public int minCostConnectPoints(int[][] points) {
        int n = points.length;

        // 🔹 Step 1: Build all edges
        List<int[]> edges = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                int dist = Math.abs(points[i][0] - points[j][0]) +
                           Math.abs(points[i][1] - points[j][1]);
                edges.add(new int[]{i, j, dist});
            }
        }

        // 🔹 Step 2: Sort edges by weight
        Collections.sort(edges, (a, b) -> a[2] - b[2]);

        // 🔹 Step 3: DSU
        Disjoint ds = new Disjoint(n);

        int cost = 0;
        int edgesUsed = 0;

        for (int[] edge : edges) {
            int u = edge[0];
            int v = edge[1];
            int w = edge[2];

            if (ds.find(u) != ds.find(v)) {
                ds.union(u, v);
                cost += w;
                edgesUsed++;

                if (edgesUsed == n - 1) break; // MST complete
            }
        }

        return cost;
    }
}