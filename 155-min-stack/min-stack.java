class MinStack {
    int arr[];
    int pointer;
    public MinStack() {
        arr= new int[10000];
        pointer=-1;
    }
    
    public void push(int val) {
        arr[++pointer]=val;
    }
    
    public void pop() {
        if(pointer>=0) pointer--;
    }
    
    public int top() {
        if(pointer>=0) return arr[pointer];
        return -1;
    }
    
    public int getMin() {
        int min=arr[0];
        for(int i=0;i<=pointer;i++){
            min=Math.min(min,arr[i]);
        }
        return min;
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */