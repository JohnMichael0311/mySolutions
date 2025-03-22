class MyQueue {
    private Stack<Integer> s1;
    private Stack<Integer> s2;
    public MyQueue() {
        s1 = new Stack<>();
        s2 = new Stack<>();
    }
    
    public void push(int x) {
        //approach 1
        // while(!s1.isEmpty()){
        //     s2.push(s1.peek());
        //     s1.pop();
        // }
        // s1.push(x);
        // while(!s2.isEmpty()){
        //     s1.push(s2.peek());
        //     s2.pop();
        // }

        // approach 2
        s1.push(x);
    }
    
    public int pop() {
    //    return s1.pop();
        if(s2.isEmpty()){
            while(!s1.isEmpty()){
            s2.push(s1.pop());
            
            }
        } 
        return s2.pop();
    }
    
    public int peek() {
        // return s1.peek();
        if(s2.isEmpty()){
            while(!s1.isEmpty()){
            s2.push(s1.pop());
           
            }
        } 
        return s2.peek();
    }
    
    public boolean empty() {
        // if(s1.size()==0) return true;
        // else return false;
        return s1.isEmpty() && s2.isEmpty();
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */