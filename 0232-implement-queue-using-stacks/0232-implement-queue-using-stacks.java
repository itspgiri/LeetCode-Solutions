class MyQueue {
    Stack<Integer> queue = new Stack<Integer>();
    public MyQueue() {
        
    }
    
    public void push(int x) {
        Stack<Integer> temp = new Stack<Integer>();
        while(!queue.isEmpty()){
            temp.push(queue.pop());
        }
        temp.push(x);
        while(!temp.isEmpty()){
            queue.push(temp.pop());
        }
    }
    
    public int pop() {
        return queue.pop();
    }
    
    public int peek() {
        return queue.peek();
    }
    
    public boolean empty() {
        return queue.isEmpty();
    }
}