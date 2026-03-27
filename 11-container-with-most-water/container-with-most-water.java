class Solution {
    public int maxArea(int[] height) {
        int max=0;
        int left=0;
        int right=height.length-1;
        while(left<right){
            int min=Math.min(height[left],height[right]);
            int d=(right-left)*min;
            max=Math.max(max,d);
            if(min==height[left]) left++;
            else right--;
        }
        return max;
    }
}