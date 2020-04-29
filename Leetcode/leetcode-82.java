class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        if (head == null)
            return null;

        ListNode dummy = new ListNode(head.val == 0 ? 1 : 0); // to ensure different head values
        dummy.next = head;

        ListNode pre = dummy;
        ListNode curr = head;
        ListNode first = dummy;

        while (curr != null && curr.next != null) {
            if (pre.val != curr.val && curr.val != curr.next.val) {
                // unique found
                first.next = curr;
                first = first.next;
            }

            pre = curr;
            curr = curr.next;
        }

        // the last node needs to be dealt independently
        // because in while loop curr.next != null, this condition will skip the last
        // node
        if (pre.val != curr.val) {
            first.next = curr;
            first = first.next;
        }

        first.next = null; // remove any subsequent duplicates

        return dummy.next;
    }
}