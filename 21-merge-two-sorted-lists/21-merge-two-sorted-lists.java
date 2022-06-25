class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode node = new ListNode();
        ListNode head = node;
        
        if (list1 == null || list2 == null) {
            return list1 != null ? list1 : list2;
        }   
        
        while (list1 != null && list2 != null) {
            if (list1.val < list2.val) {
                node.next = list1;
                list1 = list1.next;
            }
            else {
                node.next = list2;
                list2 = list2.next;
            }
            node = node.next;
        }
        
        node.next = list1 != null ? list1 : list2;
        return head.next;   
    }
}