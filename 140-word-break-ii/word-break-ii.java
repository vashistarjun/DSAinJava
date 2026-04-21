class Solution {
    public List<String> wordBreak(String s, List<String> wordDict) {
         List<String> ans= new ArrayList<>();
         List<String> path= new ArrayList<>();
         backtrack(s,wordDict,ans,path);
         return ans;
    }
    public void backtrack(String s,List<String> wordDict,List<String> ans,
    List<String> path){
        if(s.length()==0){
            StringBuilder sb= new StringBuilder();
            for(int i=0;i<path.size();i++){
                String str=path.get(i);
                sb.append(str);
               if(i!=path.size()-1) sb.append(" ");
            }
            ans.add(sb.toString());
            return;
        }
        for(String str:wordDict){
            if(s.startsWith(str)){
                path.add(str);
                backtrack(s.substring(str.length()),wordDict,ans,path);
                path.remove(path.size()-1);
            }
        }
    }
}