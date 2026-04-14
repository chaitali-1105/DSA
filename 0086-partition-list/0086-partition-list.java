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
    public ListNode partition(ListNode head, int x) {
        ListNode less=new ListNode(-1);
        ListNode great=new ListNode(-1);

        ListNode lesstail=less;
        ListNode greattail=great;

    while(head!=null){
        if(head.val<x){
            lesstail.next=head;
            lesstail=head;
        }
        else{
            greattail.next=head;
            greattail=head;
        }
        head=head.next;
    }
    greattail.next=null;
    lesstail.next=great.next;
        return less.next;
    }
   
}