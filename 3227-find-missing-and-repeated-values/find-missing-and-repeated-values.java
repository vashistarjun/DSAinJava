class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int arr[]= new int[2];
        int n=grid[0].length;
        int nums[]= new int[n*n];
        int a=0;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                nums[a++]=grid[i][j];
            }
        }
        Arrays.sort(nums);
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]==nums[i+1]){
                arr[0]=nums[i];
                break;
            }
        }
        int e=1;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==e){
                e++;
            }
        }
        arr[1]=e;
        return arr;

    }
}