class Solution {
    public List<List<String>> solveNQueens(int n) {
        List<List<String>> list= new ArrayList<>();
        int arr[][]= new int[n][n];
        
        solve(0,arr,list);
       return list;

    }
    public void solve(int col,int arr[][],List<List<String>> list){

        if(col==arr.length){
             List<String> l= new ArrayList<>();
             for(int i=0;i<arr.length;i++){
                StringBuilder sb= new StringBuilder();
                for(int j=0;j<arr.length;j++){
                    if(arr[i][j]==0) sb.append('.');
                    else sb.append('Q');
                }
                l.add(sb.toString());
             }
             list.add(l);
            return ;
        }
        
        for(int i=0;i<arr.length;i++){
           if (safe(i, col, arr)) {

                arr[i][col] = 1;

                solve(col + 1, arr, list);

                arr[i][col] =0;
            }
        }
       
    } 
    public boolean safe(int row,int col,int arr[][]){
        for(int i=col;i>=0;i--){
            if(arr[row][i]==1) return false;
        }
        for(int i=row,j=col;i>=0 && j>=0 ;j--,i--){
            if(arr[i][j]==1) return false;
        }
       for(int i=row,j=col;i<arr.length && j>=0;j--,i++){
            if(arr[i][j]==1) return false;
        }
      

      
        return true;
    }
}