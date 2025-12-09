class Solution {
    public int[][] updateMatrix(int[][] mat) {
        int n=mat.length;
        int m=mat[0].length;
        int ans[][]= new int[n][m];
        int visited[][]= new int[n][m];
        Queue<int[]> queue= new LinkedList<>();
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(mat[i][j]==0){
                    queue.add( new int[]{i,j,0});
                    visited[i][j]=1;
                }
            }
        }
        int dir[][]={{1,0},{0,1},{-1,0},{0,-1}};
        while(!queue.isEmpty()){
            int []poll= queue.poll();
            int r=poll[0];
            int c=poll[1];
            int dist=poll[2];
            for(int d[]:dir){
                int row=d[0]+r;
                int col=d[1]+c;
                if(row>=0 && row<n && col>=0 && col<m && visited[row][col]==0 && mat[row][col]==1){
                    visited[row][col]=1;
                    ans[row][col]=dist+1;
                    queue.add(new int[]{row,col,dist+1});
                }
            }
        }
        return ans;
    }
}