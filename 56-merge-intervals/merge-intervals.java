class Solution {
    public int[][] merge(int[][] intervals) {
        List<int[]> list= new ArrayList<>();
        Arrays.sort(intervals,(a,b)->Integer.compare(a[0],b[0]));
        int e=intervals[0][1];
        int s=intervals[0][0];
        for(int i=0;i<intervals.length;i++){
            int cs=intervals[i][0];
            int ce=intervals[i][1];
            if(e>=cs){
                e=Math.max(e,ce);
            }
            else{
                list.add(new int[]{s,e});
                s=cs;
                e=ce;
            }
        }
        list.add(new int[]{s,e});
        int n=intervals.length;
        int arr[][]= new int[list.size()][2];
        int a=0;
        for(int []l:list){
            arr[a][0]=l[0];
            arr[a++][1]=l[1];
        }
        return arr;
    }
}