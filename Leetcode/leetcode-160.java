public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if (headA == null || headB == null)
            return null;

        ListNode tailA = getTail(headA);
        ListNode tailB = getTail(headB);

        if (tailA != tailB)
            return null;

        int sizeA = getListSize(headA);
        int sizeB = getListSize(headB);

        ListNode shortList = sizeA < sizeB ? headA : headB;
        ListNode longList = sizeA < sizeB ? headB : headA;

        int difference = Math.abs(sizeA - sizeB);

        while (difference-- > 0)
            longList = longList.next;

        while (shortList.next != null) {
            if (shortList == longList)
                break;
            shortList = shortList.next;
            longList = longList.next;
        }

        return shortList;
    }

    private ListNode getTail(ListNode node) {
        ListNode temp = node;
        while (temp.next != null) {
            temp = temp.next;
        }
        return temp;
    }

    private int getListSize(ListNode node) {
        ListNode temp = node;
        int count = 0;
        while (temp.next != null) {
            temp = temp.next;
            count++;
        }
        return count;
    }
}