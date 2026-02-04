class MinStack {
    int arr[];
    int minSt[];
    int pointer;
    public MinStack() {
        arr= new int[10000];
        minSt= new int[10000];
        pointer=-1;
    }
    
    public void push(int val) {
        arr[++pointer]=val;
        if(pointer==0) minSt[pointer]=val;
        else minSt[pointer]=Math.min(val,minSt[pointer-1]);
    }
    
    public void pop() {
        if(pointer>=0) pointer--;
    }
    
    public int top() {
        if(pointer>=0) return arr[pointer];
        return -1;
    }
    
    public int getMin() {
       return minSt[pointer];
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