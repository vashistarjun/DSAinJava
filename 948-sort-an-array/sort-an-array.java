class Solution {
    public int[] sortArray(int[] nums) {
        mergeSort(nums,0,nums.length-1);
        return nums;
    }
    public void mergeSort(int arr[],int start,int end){
        if(start<end){
            int middle=start+(end-start)/2;
            mergeSort(arr,start,middle);
            mergeSort(arr,middle+1,end);
            merge(arr,start,middle,end);
        }
    }
    public void merge(int arr[],int start,int mid,int end){
        int n1=mid-start+1;
        int n2=end-mid;
        int left[]= new int[n1];
        for(int i=0;i<n1;i++){
            left[i]=arr[start+i];
        }
        int right[]= new int[n2];
        for(int i=0;i<n2;i++){
            right[i]=arr[mid+1+i];
        }
        int i=0;
        int j=0;
        int k=start;
        while(i<n1 || j<n2){
            if(j==n2 || i<n1 && left[i]<right[j]){
                arr[k++]=left[i++];
            }
            else{
                arr[k++]=right[j++];
            }
        }
    }
}