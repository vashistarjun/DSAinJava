class Solution {
    Boolean dp[];
    public boolean wordBreak(String s, List<String> wordDict) {
        dp= new Boolean[s.length()+1];
        return check(s,wordDict);
    }
    public boolean check(String s,List<String> wordDict){
        if(s.length()==0) return true;
        if(dp[s.length()]!=null) return dp[s.length()];
        for(String word:wordDict){
            if(s.startsWith(word)){
                if(check(s.substring(word.length()),wordDict)) return dp[s.length()]=true;
            }
        }
        return dp[s.length()]=false;
    }
}