class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int n=image.length;
        int m=image[0].length;
        int visited[][]= new int[n][m];
      int ans[][] = new int[n][m];
for (int i = 0; i < n; i++) 
    ans[i] = image[i].clone();

        ans[sr][sc]=color;
        visited[sr][sc]=1;
        int original=image[sr][sc];
        Queue<int[]> queue= new LinkedList<>();
        queue.add(new int[]{sr,sc});
        while(!queue.isEmpty()){
            int []poll=queue.poll();
            int row=poll[0];
            int col=poll[1];
            int dir[][]={{1,0},{0,1},{-1,0},{0,-1}};
            for(int d[]:dir){
            int r=d[0]+row;
            int c=d[1]+col;
            if(r>=0 && r<n && c>=0 && c<m && visited[r][c]==0 && image[r][c]==original){
                ans[r][c]=color;
                visited[r][c]=1;
                queue.add(new int[]{r,c});
            }
            }
        }
        return ans;
    }
}