public class Solution {

public ListNode detectCycle(ListNode head) {
    while(head!=null&&head.next!=null){
        head.val = 76200;
        if(head.next.val==76200){
            return head.next;
        }
        head = head.next;
    }
    return null;
}
}