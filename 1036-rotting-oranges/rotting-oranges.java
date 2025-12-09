class Solution {
    class Pair{
        int row;
        int level;
        int col;
        Pair(int level,int row,int col){
            this.row=row;
            this.level=level;
            this.col=col;
        }
    }
    public int orangesRotting(int[][] grid) {
          int countFresh=0;
          int rotten=0;
          for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]==1) {
                countFresh++;
                }
                if(grid[i][j]==2) rotten++;
            }
          }
          int n=grid.length;
          int m=grid[0].length;
          Queue<Pair> queue= new LinkedList<>();
           int visited[][]= new int[n][m];
          for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]==2){
                    queue.add(new Pair(0,i,j));
                    visited[i][j]=1;
                }
            }
          }
          int level=0;
          
          while(!queue.isEmpty()){
            Pair poll=queue.poll();
            int r=poll.row;
            int c=poll.col;
             level=poll.level;
             int dir[][]={{1,0},{0,1},{-1,0},{0,-1}};
             for(int d[]:dir){
                int row=r+d[0];
                int col=c+d[1];
                if(row>=0 && row<n && col<m && col>=0  && grid[row][col]==1 && visited[row][col]==0){
                    queue.add(new Pair(level+1,row,col));
                    visited[row][col]=1;
                }
             }
          }
          int count=0;
          for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(visited[i][j]==1){
                    count++;
                }
            }
          }  
          return (countFresh+rotten==count) ? level: -1;


    }
}