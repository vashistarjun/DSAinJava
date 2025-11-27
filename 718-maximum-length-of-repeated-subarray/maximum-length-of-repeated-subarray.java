class Solution {
    public int findLength(int[] nums1, int[] nums2) {
       // return f(0,0,nums1,nums2);
       int n=nums1.length;
       int m=nums2.length;
       int max=0;
       int dp[][]= new int[n+1][m+1];
    //    for(int i=0;i<n;i++){
    //     dp[i][m-1]=0;
    //     dp[n][i]=0;
    //    }
       for(int i=n-1;i>=0;i--){
        for(int j=m-1;j>=0;j--){
            if(nums1[i]==nums2[j]){
                dp[i][j]=1+dp[i+1][j+1];
                max=Math.max(dp[i][j],max);
            }
            else{
                dp[i][j]=0;
            }
        }
       }
       return max;
    }
    public int f(int i,int j,int nums1[],int nums2[]){
        if(i==nums1.length || j==nums2.length) return 0;
        if(nums1[i]==nums2[j]) return 1+f(i+1,j+1,nums1,nums2);
        else {
            return Math.max(f(i+1,j,nums1,nums2),f(i,j+1,nums1,nums2));
        }
    }

}