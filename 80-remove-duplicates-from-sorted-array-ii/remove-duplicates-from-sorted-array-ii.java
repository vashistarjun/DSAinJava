class Solution {
    public int removeDuplicates(int[] nums) {
       int n=nums.length;
       int k=0;
       int i=1;
       int count=1;
       while(i<n){
        if(nums[i]==nums[k]){
           if(count<2){
            k++;
             nums[k]=nums[i];

            count++;
           }
           i++;
        }
        else{
            k++;
            nums[k]=nums[i];
            i++;
            count=1;
        }
      
}
return k+1;
}
}
