class Solution {
    public List<List<String>> partition(String s) {
        List<List<String>> list= new ArrayList<>();
        List<String> l= new ArrayList<>();
        backtrack(0,list,l,s);
        return list;
    }
    public void backtrack(int index,List<List<String>> list,List<String> l,String s){
        if(index==s.length()){
            list.add(new ArrayList<>(l));
            return;
        }
        for(int i=index;i<s.length();i++){
            if(palindrome(index,i,s)){
                l.add(s.substring(index,i+1));
                backtrack(i+1,list,l,s);
                l.remove(l.size()-1);
            }
        }
    }
    public boolean palindrome(int start,int end,String s){
        while(start<=end){
            if(s.charAt(start)!=s.charAt(end)){
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
}