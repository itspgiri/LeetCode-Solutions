/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) 
    {
        int curSum = 0;
        boolean addToNext = false;
        ListNode newNode, head, prev, next;
        newNode = head = prev = next = null;
        
        while(l1 != null || l2 != null)
        {
            curSum = 0;
            newNode = new ListNode();
            
            if(l1 != null)
            {
                curSum += l1.val;
                l1 = l1.next;
            }
            
            if(l2 != null)
            {
                curSum += l2.val;
                l2 = l2.next;
            }
            
            if(addToNext == true)
            {
                curSum++;
                addToNext = false;
            }
            
            if(curSum > 9)
            {
                addToNext = true;
                newNode.val = curSum % 10;
            }
            
            else
                newNode.val = curSum;
        
            newNode.next = head;
            head = newNode;
        }
        
        // If both lists are over but there is still a number that needs to be added
        if(addToNext == true)
        {
            newNode = new ListNode(1);
            newNode.next = head;
            head = newNode;
        }
        
        while(head != null)     // reverse the list
        {
            next = head.next;
            head.next = prev;
            prev = head;
            head = next;
        }
        
        return prev;
    }
}