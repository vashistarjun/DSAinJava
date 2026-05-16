class Solution {
    public int[] countWordOccurrences(String[] chunks, String[] queries) {
        StringBuilder sb= new StringBuilder();
        for(int i=0;i<chunks.length;i++) sb.append(chunks[i]);
        int i=0;
        String s=sb.toString();
        int n=s.length();
        Map<String,Integer> map= new HashMap<>();
        while(i<n){
            if(!isLetter(s.charAt(i))){
                i++;
                continue;
            }
            StringBuilder word=new StringBuilder();
            while(i<n){
                if(isLetter(s.charAt(i))){
                    word.append(s.charAt(i));
                    i++;
                }
                else if(s.charAt(i)=='-'){
                    boolean left=word.length()>0;
                    boolean right=(i+1<n && isLetter(s.charAt(i+1)));
                    if(left && right){
                        word.append('-');
                        i++;
                    }
                    else{
                        break;
                    }
                }
                else{
                    break;
                }
            }
            String a= word.toString();
            map.put(a,map.getOrDefault(a,0)+1);
            i++;
        }
        int ans[]= new int[queries.length];
        for(int j=0;j<ans.length;j++){
            ans[j]=map.getOrDefault(queries[j],0);
        }
        return ans;

    }
    public boolean isLetter( char ch){
        return ch>='a' && ch<='z';
    }
}