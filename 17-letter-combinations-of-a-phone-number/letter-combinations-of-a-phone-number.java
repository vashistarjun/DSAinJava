class Solution {
    Map<Character,String> map;
    public List<String> letterCombinations(String digits) {
        map=new HashMap<>();
        map.put('2',"abc");
        map.put('3',"def");
        map.put('4',"ghi");
        map.put('5',"jkl");
        map.put('6',"mno");
        map.put('7',"pqrs");
        map.put('8',"tuv");
        map.put('9',"wxyz");
        List<String> ans= new ArrayList<>();
        backtrack(0,digits,ans, new StringBuilder());
        return ans;
    }
    public void backtrack(int index,String digits,List<String> ans, StringBuilder sb){
        if(index==digits.length()){
            ans.add(sb.toString());
            return;
        }
        char ch=digits.charAt(index);
        String s=map.get(ch);
        for(int i=0;i<s.length();i++){
            sb.append(s.charAt(i));
            backtrack(index+1,digits,ans,sb);
            sb.deleteCharAt(sb.length()-1);
        }

    }
}