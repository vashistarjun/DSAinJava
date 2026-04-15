class Solution {
    public int carFleet(int target, int[] position, int[] speed) {
        int n=speed.length;
        double ratio[][]= new double[n][3];
        for(int i=0;i<n;i++){
            ratio[i][0]=speed[i];
            ratio[i][1]=position[i];
            ratio[i][2]=(double)(target-position[i])/speed[i];
        }
        Arrays.sort(ratio,(a,b)->Double.compare(b[1],a[1]));
        double maxTime=ratio[0][2];
        int fleet=1;
        for(int i=1;i<n;i++){
            if(maxTime<ratio[i][2]){
                fleet++;
                maxTime=ratio[i][2];
            }
        }
        return fleet;
    }
}
//d=st
//t=d/s