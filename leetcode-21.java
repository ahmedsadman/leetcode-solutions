/**
 * Definition for singly-linked list. public class ListNode { int val; ListNode
 * next; ListNode(int x) { val = x; } }
 */
class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode newList = new ListNode(0);
        ListNode header = newList;

        // merge till both arrays have values
        while (l1 != null && l2 != null) {
            if (l1.val <= l2.val) {
                newList.next = l1;
                l1 = l1.next;
            } else {
                newList.next = l2;
                l2 = l2.next;
            }

            newList = newList.next;
        }

        // if either of the lists is not empty, append at the end
        if (l1 != null) {
            newList.next = l1;
            newList = newList.next;
        }

        if (l2 != null) {
            newList.next = l2;
            newList = newList.next;
        }

        return header.next;
    }
}
