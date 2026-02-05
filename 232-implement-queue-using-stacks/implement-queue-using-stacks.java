class MyQueue {
    Stack<Integer> main;
    Stack<Integer> aux;

    public MyQueue() {
         main = new Stack();
         aux = new Stack();
        
    }
    
    public void push(int x) {
        main.push(x);      
    }
    
    public int pop() {
        if(aux.isEmpty()){
            while(!main.isEmpty()){
                int x = main.peek();
                main.pop();
                aux.push(x);
            }
        }
        return aux.pop();
    }
    
    public int peek() {
        if(aux.isEmpty()){
            while(!main.isEmpty()){
            int x = main.pop();
            aux.push(x);
            }
        }
        return aux.peek();        
    }
    
    public boolean empty() {
       return main.isEmpty()&&aux.isEmpty();
        
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