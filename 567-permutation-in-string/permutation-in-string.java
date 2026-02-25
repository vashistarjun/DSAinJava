class Solution {
    public boolean checkInclusion(String s, String p) {
        boolean flag=false;
         for(int i=0;i<=p.length()-s.length();i++){
            if(check(p.substring(i,i+s.length()),s)){
               flag=true;
                break;
            }
        }
        return flag;
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
