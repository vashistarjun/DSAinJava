class Solution {
    public List<List<String>> solveNQueens(int n) {
        char mat[][]= new char[n][n];
        for(int i=0;i<n;i++){
            Arrays.fill(mat[i],'.');
        }
        List<List<String>> list= new ArrayList<>();
        List<String> l= new ArrayList<>();
        backtrack(0,list,n,mat);
        return list;
    }
    public void backtrack(int col,List<List<String>> list,int n,char
    mat[][]){
        if(col==n){
            List<String> l= new ArrayList<>();
            for(int i=0;i<n;i++){
             StringBuilder sb= new StringBuilder();
                for(int j=0;j<n;j++){
                   sb.append(mat[i][j]);
                }
                l.add(sb.toString());
              
            }
            list.add(l);

            return ;
        }
        for(int i=0;i<n;i++){
            if(isSafe(i,col,mat)){
                mat[i][col]='Q';
                backtrack(col+1,list,n,mat);
                 mat[i][col]='.';
            }
        }
        
    }
    public boolean isSafe(int row,int col,char mat[][]){
        // same row (left side)
    for(int j = col - 1; j >= 0; j--){
        if(mat[row][j] == 'Q') return false;
    }

    // upper-left diagonal
    for(int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--){
        if(mat[i][j] == 'Q') return false;
    }

    // lower-left diagonal
    for(int i = row + 1, j = col - 1; i < mat.length && j >= 0; i++, j--){
        if(mat[i][j] == 'Q') return false;
    }

    return true;
    }
}