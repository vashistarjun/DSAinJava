class Solution {
    public int numEnclaves(int[][] grid) {
        int n=grid.length;
        int m=grid[0].length;
        int visited[][]= new int[n][m];
        Queue<int[]> queue= new LinkedList<>();
        for(int i=0;i<n;i++) if(grid[i][0]==1) queue.add(new int[]{i,0});
        for(int i=0;i<m;i++) if(grid[0][i]==1) queue.add(new int[]{0,i});
        for(int i=0;i<n;i++) if(grid[i][m-1]==1) queue.add(new int[]{i,m-1});
        for(int i=0;i<m;i++) if(grid[n-1][i]==1) queue.add(new int[]{n-1,i});
        int dir[][]={{1,0},{0,1},{-1,0},{0,-1}};
        while(!queue.isEmpty()){
            int []poll=queue.poll();
            int row=poll[0];
            int col=poll[1];
            visited[row][col]=1;
            for(int d[]:dir){
                int r=row+d[0];
                int c=col+d[1];
                if(r>=0 && r<n && c>=0 && c<m && visited[r][c]==0 && grid[r][c]==1){
                    visited[r][c]=1;
                    queue.add(new int[]{r,c});
                }
            }
        }
        int count=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(visited[i][j]==0 && grid[i][j]==1) count++;
            }
        }
        return count;
    }
}