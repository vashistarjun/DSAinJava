class Solution {
    public List<List<String>> solveNQueens(int n) {
        List<List<String>> list= new ArrayList<>();
        char board[][]= new char[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                board[i][j]='.';
            }
        }
        solve(0,board,list);
        return list;

    }
    public void solve(int col,char board[][],List<List<String>> list){
        int n=board.length;
       if(col==board.length){
        List<String> l= new ArrayList<>();
        for(int i=0;i<n;i++){
            StringBuilder sb= new StringBuilder();
            for(int j=0;j<n;j++){
                sb.append(board[i][j]);
            }
            l.add(sb.toString());
        }
        list.add(new ArrayList<>(l));
        return ;
       }
       
    
            for(int i=0;i<n;i++){
                if(board[i][col]=='.'){
                    if(isSafe(i,col,board)){
                    board[i][col]='Q';
                    solve(col+1,board,list);
                    board[i][col]='.';
      }
      }
 
    }
    }
    public boolean isSafe(int row,int col,char board[][]){
        for(int i=col;i>=0;i--){
            if(board[row][i]=='Q') return false;
        }
        for(int i=row,j=col;i<board.length && j>=0;i++,j--){
            if(board[i][j]=='Q') return false;
        }
        for(int i=row,j=col;i>=0 && j>=0;i--,j--){
            if(board[i][j]=='Q') return false;
        }
        return true;
    }  
}