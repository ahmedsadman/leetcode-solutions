/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode middleNode(ListNode head) {
        ListNode temp = head;
        int length = 0;
        int middle_point;
        
        // get the length
        while (temp != null) {
            length++;
            temp = temp.next;
        }
        
        int counter = 0;
        while (counter != length / 2) {
            head = head.next;
            counter++;
        }
        
        return head;
    }
}