class Solution {
    Boolean dp[];
    public boolean wordBreak(String s, List<String> wordDict) {
        dp= new Boolean[s.length()+1];
        return helper(s,wordDict);

    }
    public boolean helper(String s,List<String> wordDict){
        if(s.length()==0) return true;
        if(dp[s.length()]!=null) return dp[s.length()];
        for(String list:wordDict){
            if(s.startsWith(list)){
                if(helper(s.substring(list.length()),wordDict)) return dp[s.length()]=true;
            }
        }
        return dp[s.length()]=false;
    }
}