class Solution {
    public int minSwaps(String s) {
        int current=0;
        int max=0;
        for(char ch:s.toCharArray()){
            if(ch=='[') current++;
            else current--;
            if(current<0){
                max=Math.max(max,-current);
            }
        }
        return (max+1)/2;
    }
}