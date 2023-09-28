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
        int length = 0;
        ListNode current = new ListNode(head.val, head.next);
        while(current.next != null) {
            length++;
            current = current.next;
        }
        current = head;
        if(length < 1) 
            return null;
    
        if(length % 2 == 0) {
            for(int i = 0; i < length/2 - 1; i++) {
                current = current.next;
            }
        }
        else {
            for(int i = 0; i < length/2; i++) {
                current = current.next;
            }
        }
        current.next = current.next.next;
        return head;
    }
}