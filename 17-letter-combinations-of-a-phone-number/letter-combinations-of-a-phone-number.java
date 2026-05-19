class Solution {
    Map<Character,String> map;
    public List<String> letterCombinations(String digits) {
        map= new HashMap<>();
        map.put('2',"abc");
        map.put('3',"def");
        map.put('4',"ghi");
        map.put('5',"jkl");
        map.put('6',"mno");
        map.put('7',"pqrs");
        map.put('8',"tuv");
        map.put('9',"wxyz");
        List<String> list= new ArrayList<>();
        StringBuilder sb= new StringBuilder();
        yoyo(0,list,sb,digits);
        return list;
    }
    public void yoyo(int index,List<String> list,StringBuilder sb,String digits){
        if(index==digits.length()) {
            list.add(sb.toString());
            return;
        }
       char ch=digits.charAt(index);
       String s= map.get(ch);
       for(int i=0;i<s.length();i++){
        sb.append(s.charAt(i));
        yoyo(index+1,list,sb,digits);
        sb.deleteCharAt(sb.length()-1);
       }

    }
}