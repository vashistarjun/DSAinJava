class Solution {
    public int totalFruit(int[] fruits) {
        Map<Integer,Integer> map= new HashMap<>();
        int left=0;
        int right=0;
        int count=0;
        while(right<fruits.length){
            int val=fruits[right];
            map.put(val,map.getOrDefault(val,0)+1);
            while(map.size()>2){
                map.put(fruits[left],map.getOrDefault(fruits[left],0)-1);
                if(map.get(fruits[left])==0) map.remove(fruits[left]);
                left++;
            }
            count=Math.max(count,right-left+1);
            right++;
        }
        return count;
    }
}