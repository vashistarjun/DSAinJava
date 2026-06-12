class Solution {
    public int numOfUnplacedFruits(int[] fruits, int[] baskets) {
        int count=0;
        int visited[]= new int[fruits.length];
        for(int i=0;i<fruits.length;i++){
            boolean placed=false;
            for(int j=0;j<baskets.length;j++){
                if(fruits[i]<=baskets[j] && visited[j]==0) {
                    placed=true;
                    visited[j]=1;
                    break;
                }
            }
            if(placed) count++;
        }
        return fruits.length-count;
    }
}