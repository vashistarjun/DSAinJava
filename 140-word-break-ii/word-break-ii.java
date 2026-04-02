class Solution {

    public List<String> wordBreak(String s, List<String> wordDict) {
        List<String> list= new ArrayList<>();
        List<String> path= new ArrayList<>();
        backtrack(s,wordDict,list,path);
        return list;
    }
    public void backtrack(String s,List<String> wordList,List<String> list,List<String> path){
        if(s.length()==0){     //ans mil gya
        String a=String.join(" ",path);
        list.add(a);
            return;
        }
        for(String word:wordList){
            if(s.startsWith(word)){
                path.add(word);
                backtrack(s.substring(word.length()),wordList,list,path);
                path.remove(path.size()-1);
            }
        }
    }
}