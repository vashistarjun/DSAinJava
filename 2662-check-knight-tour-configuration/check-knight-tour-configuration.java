class Solution {
    class pair{
        int row;
        int col;
        int count;
        pair(int row,int col,int count){
            this.row=row;
            this.col=col;
            this.count=count;
        }
    }
    public boolean checkValidGrid(int[][] grid) {
        int n=grid.length;
      
        if(grid[0][0]!=0) return false;
        Queue<pair> queue= new LinkedList<>();
        queue.add(new pair(0,0,0));
        
        int count=0;
        int dir[][]={{1,2},{1,-2},{-1,2},{-1,-2},{2,1},{2,-1},{-2,1},{-2,-1}};
        while(!queue.isEmpty()){
            pair poll= queue.poll();
            int row=poll.row;
            int col=poll.col;
            count=poll.count;
            if(count==n*n-1) return true;
            boolean found=false;
            for(int d[]:dir){
                int r=row+d[0];
                int c=col+d[1];
                if(r>=0 && r<n && c>=0 && c<n && grid[r][c]==count+1){
                    queue.add(new pair(r,c,count+1));
                    found=true;
                }
               
            }
            if(!found) return false;
        }
        return false;


    }
}