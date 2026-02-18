class Solution {
    public List<Integer> majorityElement(int[] nums) {
        List<Integer> list= new ArrayList<>();
        int n=nums.length;
        
        int freq=1;
        Arrays.sort(nums);
        for(int i=0;i<n-1;i++){
            if(nums[i]==nums[i+1]) freq++;
            else{
                if(freq>n/3){
                    list.add(nums[i]); 
                }
                freq=1;
            }
        }
        if(freq>n/3) list.add(nums[n-1]);
        return list;
    }
}