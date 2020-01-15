import java.util.*;

/**
 * Definition for singly-linked list. public class ListNode { int val; ListNode
 * next; ListNode(int x) { val = x; } }
 */
class Solution {
    public ListNode mergeKLists(ListNode[] lists) {
        ArrayList<Integer> values = new ArrayList<>();

        // collect the node values in plain array
        for (int i = 0; i < lists.length; i++) {
            ListNode l = lists[i];
            while (l != null) {
                values.add(l.val);
                l = l.next;
            }
        }

        // sort the arraylist
        Collections.sort(values);

        // make a new node list by iterating sorted values
        ListNode newList = new ListNode(0);
        ListNode header = newList;
        for (int i = 0; i < values.size(); i++) {
            newList.next = new ListNode(values.get(i));
            newList = newList.next;
        }

        return header.next;
    }
}