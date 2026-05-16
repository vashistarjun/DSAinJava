class Solution {
    public int[] concatWithReverse(int[] nums) {
        int n=nums.length;
        int arr[]= new int[2*n];
        int i=0;
        int j=0;
        int k=nums.length-1;
        while(j<arr.length){
            if(i>=nums.length){
                arr[j]=nums[k];
                k--;
            }
            else{
                arr[j]=nums[i];
            }
        
        i++;
        j++;
    }
    return arr;
    }
}