class Solution {
    public String reorganizeString(String s) {
        int freq[]= new int[26];
        char maxchar='a';
        int max=0;
        for(char ch:s.toCharArray()){
            freq[ch-'a']++;
            if(max<freq[ch-'a']){
                max=freq[ch-'a'];
                maxchar=ch;
            }
        }
        if(max > (s.length() + 1) / 2) return "";
       int i=0;
        char arr[]= new char[s.length()];
        while(freq[maxchar-'a']>0){
            arr[i]=maxchar;
            i+=2;
            freq[maxchar-'a']--;
        }
       
        for(int j=0;j<26;j++){
            while(freq[j]>0){
                if(i>=s.length()) i=1;
                arr[i]=(char) (j+'a');
                i+=2;
                freq[j]--;
            }
        }
        return new String(arr);
    }
}