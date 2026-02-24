class Solution {
    public int numIslands(char[][] grid) {
        int n=grid.length;
        int m=grid[0].length;
        int count=0;
        boolean visited[][]= new boolean[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(!visited[i][j] && grid[i][j]=='1'){
                    dfs(i,j,visited,grid);
                    count++;
                }
            }
        }
        return count;
    }
    public void dfs(int row,int col,boolean visited[][],char grid[][]){
        
        int n=grid.length;
        int m=grid[0].length;
        if(row<0 || row>=n || col<0 || col>=m || visited[row][col] || grid[row][col]=='0' ) return ;
        visited[row][col]=true;
       dfs(row+1,col,visited,grid);
       dfs(row-1,col,visited,grid);
       dfs(row,col+1,visited,grid);
       dfs(row,col-1,visited,grid);

    }
}