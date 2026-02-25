class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> list= new ArrayList<>();
        for(int i=0;i<=s.length()-p.length();i++){
            if(check(s.substring(i,i+p.length()),p)){
                list.add(i);
            }
        }
        return list;
    }
    public boolean check(String s,String p){
        if(s.length()!=p.length()) return false;
       int freqs[]= new int[26];
       int freqp[]= new int[26];
       for(int i=0;i<p.length();i++){
        char ch=s.charAt(i);
        char ch2=p.charAt(i);
        freqs[ch-'a']++;
        freqp[ch2-'a']++;
       }
       for(int i=0;i<26;i++){
        if(freqs[i]!=freqp[i]) return false;
       }
        return true;
    }
}