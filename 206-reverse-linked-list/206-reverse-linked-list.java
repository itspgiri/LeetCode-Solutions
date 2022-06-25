class Solution {
    public ListNode reverseList(ListNode head) {        
        if(head == null) 
            return head;
        ListNode prev = null;
        ListNode first = head;
        ListNode second = first.next;
        
        while (first != null){
            first.next = prev;
            prev = first;
            first = second;
            if(second != null) second = second.next;
        }
        return prev;
    }
}