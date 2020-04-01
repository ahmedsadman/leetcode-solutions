import java.util.*;

// Using HashSet
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if (headA == null || headB == null)
            return null;

        Set<ListNode> nodes = new HashSet<>();

        ListNode currentA = headA;
        while (currentA != null) {
            nodes.add(currentA);
            currentA = currentA.next;
        }

        ListNode currentB = headB;
        while (currentB != null) {
            if (nodes.contains(currentB))
                return currentB;
            currentB = currentB.next;
        }

        return null;
    }
}