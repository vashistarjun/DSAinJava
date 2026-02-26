class Solution {
    int idx;
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
       
        int ceil=findCeil(arr,x);
        
        LinkedList<Integer> list= new LinkedList<>();
        int i=idx-1;
        int j=idx;;
        while(k>0){
            if (i < 0) {
                list.addLast(arr[j++]);
            }
            else if (j >= arr.length) {
                list.addFirst(arr[i--]);
            }
           else  if(Math.abs(x-arr[i]) > Math.abs(x-arr[j])){
                list.addLast(arr[j]);
                
                j++;
            }
            else         {
               list.addFirst(arr[i]);
               i--;  
              
            }
            k--;
        }
       // Collections.sort(list);
        return list;
    }
   public int findCeil(int[] arr, int target) {
    int left = 0, right = arr.length - 1;
    int ans = -1;
    idx=arr.length;
    while (left <= right) {
        int mid = left + (right - left) / 2;

        if (arr[mid] >= target) {
            ans = arr[mid];  
            idx=mid;  
            right = mid - 1;     
        } else {
            left = mid + 1;
        }
    }
    return ans;
}
}