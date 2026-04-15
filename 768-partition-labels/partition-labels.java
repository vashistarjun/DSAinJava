class Solution {
    public List<Integer> partitionLabels(String s) {
        List<Integer> list= new ArrayList<>();
        Map<Character,Integer> map= new HashMap<>();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            map.put(ch,i);
        }
        int left=0;
        int right=0;
        int start=0;
        while(left<s.length()){
            right=Math.max(map.get(s.charAt(left)),right);
            if(left==right){
                list.add(left-start+1);
                start=left+1;
            }
            left++;
        }
        return list;
        
    }
}
//ababcbacadefegdehijhklij
// a → 8
// b → 5
// c → 7
// d → 14
// e → 15
// f → 11
// g → 13
// h → 19
// i → 22
// j → 23
// k → 20
// l → 21