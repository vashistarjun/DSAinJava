class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> stack= new Stack<>();
        int n=asteroids.length;
        for(int i=0;i<n;i++){
            boolean des=false;
            while(!stack.isEmpty() && stack.peek()>0 && asteroids[i]<0){
                 if (Math.abs(stack.peek()) < Math.abs(asteroids[i])) {
                    stack.pop();          
                } 
                else if(Math.abs(stack.peek()) ==  Math.abs(asteroids[i])){
                     stack.pop(); 
                    des=true;
                    break;
                }
                else{
                    des=true;
                    break;
                }
                
            }
            if(!des) stack.push(asteroids[i]);
        }
        int arr[]=new int[stack.size()];
        for(int i=arr.length-1;i>=0;i--){
            arr[i]=stack.pop();
        }
        return arr;
    }
}