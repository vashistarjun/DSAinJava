class Solution {
   // Integer dp[][];
    public int minOperations(int[] nums, int x) {
        int n=nums.length;
        int total=0;
        for(int num:nums){
            total+=num;
        }
        int target=total-x;
        if(target<0) return -1;
        int max=-1;
        int sum=0;
        int left=0;
        for(int right=0;right<n;right++){
            sum+=nums[right];
            while(sum>target){
                sum-=nums[left++];
            }
            if(sum==target) max=Math.max(max,right-left+1);
        }
        return (max==-1) ? -1 : n-max;

    //     int n=nums.length;
    //     dp= new Integer[n][n];
    //     int y=f(0,n-1,nums,x);
    //     return y==Integer.MAX_VALUE ? -1 : y;
    // }
    // public int f(int i,int j,int nums[],int x){
    //     if(x==0) return 0;
    //     if(i>j) return Integer.MAX_VALUE;
    //     if(x<0) return Integer.MAX_VALUE;
    //     if(dp[i][j]!=null) return dp[i][j];
    //     int first=Integer.MAX_VALUE;
    //     int sub=f(i+1,j,nums,x-nums[i]);
    //     if(sub!=Integer.MAX_VALUE){
    //         first=1+sub;        }

    //     int last=Integer.MAX_VALUE;
    //     int sub2=f(i,j-1,nums,x-nums[j]);
    //     if(sub2!=Integer.MAX_VALUE){
    //         last=1+sub2;        }
    //         return dp[i][j]=Math.min(first,last);
    }
}