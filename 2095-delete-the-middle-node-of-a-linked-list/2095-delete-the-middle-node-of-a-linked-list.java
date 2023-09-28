/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode deleteMiddle(ListNode head) {
        if (head == null || head.next == null) {
            // Empty list or list with only one element, nothing to delete
            return null;
        }
        
        ListNode slow = head;
        ListNode fast = head;
        ListNode prev = null;
        
        // Move 'fast' two steps and 'slow' one step at a time until 'fast' reaches the end
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            prev = slow;
            slow = slow.next;
        }
        
        // Now 'slow' is at the middle node, 'prev' is before it
        // Delete the middle node by updating 'prev.next' to 'slow.next'
        prev.next = slow.next;
        
        return head;
    }
}

