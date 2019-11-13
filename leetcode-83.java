class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
    }
}

class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        if (head == null)
            return head;

        ListNode curr = head.next;
        ListNode newList = new ListNode(head.val);
        ListNode newHead = newList;

        while (curr != null) {
            if (curr.val > newList.val) {
                newList.next = curr;
                newList = newList.next;
            }
            curr = curr.next;
        }
        newList.next = null;
        return newHead;
    }
}