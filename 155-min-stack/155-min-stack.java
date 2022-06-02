class MinStack {

private ListNode node;
public MinStack() {
node = null;
}

public void push(int val) {
    ListNode curr = new ListNode();
    curr.val = val;
	if (node == null)
		curr.minVal = val;
	else
	{
		curr.minVal = Math.min(node.minVal, val);
		curr.next = node;
	}

	node = curr;
    
}

public void pop() {
    node = node.next;
    
}

public int top() {
    return node.val;
    
}

public int getMin() {
    return node.minVal;
    
}
}

public class ListNode
{
public int val;
public int minVal;
public ListNode next;
}

/**

Your MinStack object will be instantiated and called as such:
MinStack obj = new MinStack();
obj.push(val);
obj.pop();
int param_3 = obj.top();
int param_4 = obj.getMin();
*/