class MinStack {
    long mini=Long.MAX_VALUE;
    Stack<Long> st=new Stack<>();
    public MinStack() {
    }
    
    public void push(int value) {
        if(st.isEmpty()){
            mini=value;
            st.push((long)value);
        }else{
            if(value>=mini){
                st.push((long)value);
            }else{
                long newVal=(2L*value)-mini;
                mini=value;
                st.push(newVal);
            }
        }        
    }
    
    public void pop() {
        if(st.isEmpty()){
            return;
        }
        if(st.peek()>=mini){
            st.pop();
        }else{
            mini=(2L*mini)-st.pop();
        }
        
    }
    
    public int top() {
        // return Math.max(mini,st.peek());
        long val=st.peek();
        if(val<mini) return (int)mini;
        return (int)val;
    }
    
    public int getMin() {
        return (int)mini;
        
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(value);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */

// Input
// ["MinStack","push","push","push","getMin","pop","top","getMin"]
// [[],[-2],[0],[-3],[],[],[],[]]

// Output
// [null,null,null,null,-3,null,0,-2]

// Explanation
// MinStack minStack = new MinStack();
// minStack.push(-2);
// minStack.push(0);
// minStack.push(-3);
// minStack.getMin(); // return -3
// minStack.pop();
// minStack.top();    // return 0
// minStack.getMin(); // return -2