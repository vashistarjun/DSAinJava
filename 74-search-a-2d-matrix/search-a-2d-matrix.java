class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int n=matrix.length;
        int m=matrix[0].length;
        int col=m-1;
        int row=0;
        while(col>=0 && row<n){
            if(matrix[row][col]==target){
                return true;
            }
            if(matrix[row][col]>target){
                col--;
            }
            else{
                row++;
            }
        }
        return false;
    }
}