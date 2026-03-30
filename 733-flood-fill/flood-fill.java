class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int n=image.length;
        int m=image[0].length;
     
        int visited[][]=new int[n][m];
        int scolor=image[sr][sc];
     
       
        dfs(sr,sc,color,scolor,image,visited);
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(visited[i][j]==1){
                    visited[i][j]=color;
                }
                else{
                    visited[i][j]=image[i][j];
                }
            }
        }
        return visited;
    }
    public void dfs(int row,int col,int color,int scolor,int image[][],int visited[][]){
        int n=image.length;
        int m=image[0].length;

        if(row<0 || row>=n || col<0 || col>=m || 
        visited[row][col]==1 || image[row][col]!=scolor) return;

         visited[row][col]=1;

         dfs(row+1,col,color,scolor,image,visited);
          dfs(row,col-1,color,scolor,image,visited);
           dfs(row-1,col,color,scolor,image,visited);
            dfs(row,col+1,color,scolor,image,visited);

    }
}