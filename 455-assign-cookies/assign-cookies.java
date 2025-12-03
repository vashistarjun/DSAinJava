class Solution {
    public int findContentChildren(int[] g, int[] s) {
        int count=0;
        Arrays.sort(g);
        Arrays.sort(s);
        int i=0;
        while(count<g.length && i<s.length){
            if(g[count]<=s[i]){
                count++;
            }
            i++;
        }
        return count;
    }
}