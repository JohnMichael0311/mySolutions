// class Pair {
//     int x, y;
//     Pair(int x, int y) {
//         this.x = x;
//         this.y = y;
//     }
// }
class MinStack {

    private Stack<Long> st;
    private long mini;
    public MinStack() {
        st = new Stack<>();
        mini = Integer.MAX_VALUE;
    }
    
    public void push(int val) {
        // if(st.isEmpty()){
        //     st.push(new Pair(val, val));
        // }else {
        //     st.push(new Pair(val , Math.min(val, st.peek().y)));
        // }
        // Approach 2
        if(st.isEmpty()){
            mini = val;
            st.push((long)val);
        } 
        else if(val >= mini) {
            st.push((long)val);
        }
        else {
            st.push((2L *val) - mini);
            mini = val;
        }
    }
    
    public void pop() {
        long x = st.pop();
        if(x<mini){
            mini = (2*mini) - x;
        }
        
    }
    
    public int top() {
        long y = st.peek();
        if(mini<y) return (int)y;
        else return (int)mini;
    }
    
    public int getMin() {
        return (int)mini;
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