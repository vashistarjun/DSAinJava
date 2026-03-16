class Solution {
    public int largestIsland(int[][] grid) {
        int n=grid.length;
        int m=grid[0].length;
        int val=1;
        int max=0;
        int id[][]= new int[n][m];
        int size[]= new int[n*m+10];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(id[i][j]==0 && grid[i][j]==1){
                    size[val]=dfs(i,j,grid,id,val);
                    val++;
                }
            }
        }

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(id[i][j]==0)
                {
                    Set<Integer> set= new HashSet<>();
                    if(i-1>=0 && id[i-1][j]!=0) set.add(id[i-1][j]);
                    if(i+1<n  && id[i+1][j]!=0) set.add(id[i+1][j]);
                    if(j-1>=0 && id[i][j-1]!=0) set.add(id[i][j-1]);
                    if(j+1<m  && id[i][j+1]!=0) set.add(id[i][j+1]);


                    int total=1;
                    for(int x:set){
                        total+=size[x];
                    }
                    max=Math.max(max,total);
                }
            }
        }
        return max== 0 ? n*m : max;
    }
    public int dfs(int row,int col,int grid[][],int id[][],int val){
         int n=grid.length;
        int m=grid[0].length;
        if(row<0 || row>=n || col<0 || col>=m || id[row][col]!=0 || grid[row][col]==0) return 0;
        int count=1;
        id[row][col]=val;
        count+=dfs(row+1,col,grid,id,val);
        count+=dfs(row,col+1,grid,id,val);
        count+=dfs(row,col-1,grid,id,val);
        count+=dfs(row-1,col,grid,id,val);
        return count;

    }
}