class Solution {
    class Triple{
        int row;
        int col;
        int distance;
        Triple(int row,int col,int distance){
            this.row=row;
            this.col=col;
            this.distance=distance;
        }
    }
    public int minimumEffortPath(int[][] heights) {
        int n=heights.length;
        int m=heights[0].length;
        int dis[][] = new int[n][m];
    for (int i = 0; i < n; i++) {
        Arrays.fill(dis[i], Integer.MAX_VALUE);
        }
        dis[0][0]=0;
        //int diff=0;
        PriorityQueue<Triple> pq= new PriorityQueue<>((a,b)->(a.distance-b.distance));
        pq.add(new Triple(0,0,0));
        int dir[][]={{-1,0},{0,-1},{1,0},{0,1}};
        while(!pq.isEmpty()){
            Triple poll=pq.remove();
            int row=poll.row;
            int col=poll.col;
            int distance=poll.distance;
            if(row==n-1 && col==m-1) return distance;
                for(int d[]:dir){
                    int r=row+d[0];
                    int c=col+d[1];
                    if(r>=0 && r<n && c>=0 && c<m){
                        int efforts=Math.max(Math.abs(heights[r][c]-heights[row][col]),distance);
                        if(efforts<dis[r][c]){
                            dis[r][c]=efforts;
                            pq.add(new Triple(r,c,efforts));
                        }
                    }

                }
        }
        return -1;
    }
}