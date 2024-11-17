class MyStack {
    Queue<Integer> q1;
    Queue<Integer> q2;

    public MyStack() {
        q1 = new LinkedList<>();
        q2 = new LinkedList<>();  
        
    }
    
    public void push(int x) {
        // TC:O(n)
        // 1.Move all the data elements from q1 to q2
        while(!q1.isEmpty()){
            q2.add(q1.peek());
            q1.poll();
        }

        // 2.Insert the new Data in q1
        q1.add(x);

        // 3.Move back all the data elements from q2 toq1
        while(!q2.isEmpty()){
            q1.add(q2.peek());
            q2.poll();
        }
        
    }
    
    public int pop() {
        if(q1.isEmpty()) return -1;

        int ele = q1.peek();
        q1.poll();
        return ele; 

    }
    
    public int top() {
        return q1.peek();
        
    }
    
    public boolean empty() {
        return q1.isEmpty();
        
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */