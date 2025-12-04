class Solution {
    public int[][] merge(int[][] intervals) {
     Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));
     int n=intervals.length; 
     List<int[]> list= new ArrayList<>();
     int start=intervals[0][0];
     int end=intervals[0][1];
     for(int i=0;i<intervals.length;i++){
        int currStart=intervals[i][0];
        int currEnd=intervals[i][1];
        if(end>=currStart){
            end=Math.max(end,currEnd);
        }
        else{
            list.add(new int[]{start,end});
            start=currStart;
            end=currEnd;
        }
     }
     list.add(new int[]{start,end});
     return list.toArray(new int[list.size()][]);
     
       
    }
}