/**
 * Definition for singly-linked list. public class ListNode { int val; ListNode
 * next; ListNode(int x) { val = x; } }
 */
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummyHead = new ListNode(0);
        ListNode p = l1;
        ListNode q = l2;
        ListNode curr = dummyHead;
        int carry = 0;

        while (p != null || q != null) {
            int x = (p != null) ? p.val : 0;
            int y = (q != null) ? q.val : 0;
            int sum = x + y + carry;
            carry = sum / 10;

            curr.next = new ListNode(sum % 10);
            curr = curr.next;

            if (p != null)
                p = p.next;
            if (q != null)
                q = q.next;
        }

        // sometimes, an extra carry may remain after the summation is over
        if (carry > 0) {
            curr.next = new ListNode(carry);
        }

        // For easier implementation, we used dummyHead (otherwise we would need
        // conditionals to init head)
        // the first value of dummyHead is 0, so dummyHead.next would contain the actual
        // result
        return dummyHead.next;
    }
}