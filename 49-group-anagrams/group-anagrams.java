class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> ans= new ArrayList<>();
       Map<String,List<String>> map= new HashMap<>();
       for(String s:strs){
       char[] arr = s.toCharArray();
            Arrays.sort(arr);
        String str=new String(arr);
            if(map.containsKey(str)){
               map.get(str).add(s);
            }
            else{
                map.put(str,new ArrayList<>());
                map.get(str).add(s);
            }
       }
       for(String key:map.keySet()){
        List<String> list= new ArrayList<>(map.get(key));
        ans.add(list);
       }
       return ans;
    }
}