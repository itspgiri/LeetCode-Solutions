## Overview
​
> **UpVote only if you find it useful or of any help. Thank you for reading.**
​
![enter image description here](https://assets.leetcode.com/users/images/a97782a6-0745-445d-8a1f-b89f5260944f_1651774937.5452518.jpeg)
​
**Question**
Implement a last-in-first-out (LIFO) stack using only two queues. The implemented stack should support all the functions of a normal stack (`push`, `top`, `pop`, and `empty`).
​
**Useful Resources**
​
- [Implement Stack using Queues - Leetcode 225 - Python - YouTube](https://www.youtube.com/watch?v=rW4vm0-DLYc)
​
**Approaches**
​
1. Using One Queue
​
## One Queue
​
​
class MyStack {
Queue <Integer> q = new LinkedList<>();
public void push(int x) { // Pushes element x on top of the stack
q.add(x);
for(int i = 1; i < q.size(); i ++)
q.add(q.poll());
}
public int pop() {   //Removes the element on the top of the stack and returns it.
return q.poll();
}
public int top() {    // Returns the element on the top of the stack.
return q.peek();
}
public boolean empty() {  //Returns true if the stack is empty, false otherwise.
return q.isEmpty();
}
}
​