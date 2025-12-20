class Solution {
    public boolean lemonadeChange(int[] bills) {
        int count5=0;
        int count10=0;
        int count20=0;
        for(int i=0;i<bills.length;i++){
            if(bills[i]==5) count5++;
            else if(bills[i]==10){
                if(count5==0) return false;
                else{
                    count5--;
                    count10++;
                }
            }
            else{
                count20++;
                if(count10>0){
                    if(count5>0){
                        count5--;
                        count10--;
                    }
                    else{
                        return false;
                    }
                }
                else{
                    if(count5>2){
                        count5-=3;
                    }
                    else{
                        return false;
                    }
                }
            }
        }
        return true;
    }
}