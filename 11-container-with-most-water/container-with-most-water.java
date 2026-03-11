class Solution {
    public int maxArea(int[] height) {
        int max=0;
        int left=0;
        int right=height.length-1;
        while(left<right){
            int dist=right-left;
            int small=Math.min(height[left],height[right]);
            int n=dist*small;
            max=Math.max(max,n);
            if(small==height[left]) left++;
            else right--;
        }
        return max;
    }
}