Method 2:
```
public class Solution {
public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
ListNode l1 = headA;
ListNode l2 = headB;
while(l1!=l2){
l1=l1.next;
l2=l2.next;
if(l1 == l2)
return l1;
if(l1 == null)
l1 = headB;
if(l2 == null)
l2 = headA;
}
return l1;
}
}
```
​
Method 3: (Compressed Method 2)
```
public class Solution {
public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
ListNode nodeA = headA;
ListNode nodeB = headB;
while(nodeA!=nodeB){
nodeA = nodeA==null ? headB:nodeA.next;
nodeB = nodeB==null ? headA:nodeB.next;
}
return nodeA;
}
}
```