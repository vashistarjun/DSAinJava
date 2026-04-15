class Solution {
    public List<String> findItinerary(List<List<String>> tickets) {
        LinkedList<String> list= new LinkedList<>();
        Map<String,ArrayList<String>> map= new HashMap<>();
        for(List<String> l:tickets){
            String s=l.get(0);
            String s2=l.get(1);
            map.putIfAbsent(s,new ArrayList<>());
            map.get(s).add(s2);
            
        }
        for(String key : map.keySet()){
            Collections.sort(map.get(key));
        } 
        
       dfs(map,list,"JFK");
       return list;
       
    }
    public void dfs(Map<String,ArrayList<String>> map,List<String> list,String s){
           
        List<String> l= map.get(s);
        while(l!=null && !l.isEmpty()){
            String next=l.get(0);
           
            l.remove(0);
            dfs(map,list,next);
        }
        list.addFirst(s);
        }
    }
