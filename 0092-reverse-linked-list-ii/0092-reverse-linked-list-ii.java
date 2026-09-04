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
    public ListNode reverseBetween(ListNode head, int left, int right) {
    ListNode dummy = new ListNode(0);
    dummy.next = head;

    ListNode prev = dummy;
    ListNode curr = head;

    // Move to left position
    for (int i = 1; i < left; i++) {
        prev = prev.next;
        curr = curr.next;
    }

    ListNode start = curr;
    ListNode temp = null;

    // Reverse the sublist
    for (int i = 0; i <= right - left; i++) {
        ListNode next = curr.next;

        curr.next = temp;
        temp = curr;
        curr = next;
    }

    // Join the list
    prev.next = temp;
    start.next = curr;

    return dummy.next;
}
}
