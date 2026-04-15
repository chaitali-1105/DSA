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
    public static int lengthOfLinkedList(ListNode temp)
    {
        int count = 0 ;
        while(temp != null)
        {
            temp = temp.next ;
            count++ ;
        }
        return count ;
    }
    public ListNode rotateRight(ListNode head, int k) {
        if(head==null || head.next==null || k==0){
            return head;
        }
        ListNode temp=head;
        int n=lengthOfLinkedList(temp);
        k=k%n;
        if(k==0) return head;
    
        int remaining=n-k;

        while(remaining>1 && temp!=null){
            
            temp=temp.next;
            remaining--;
        }
        ListNode nexthead=temp.next;
        temp.next=null;

        ListNode temp2=nexthead;
        while(temp2.next!=null){
            temp2=temp2.next;
        }
        temp2.next=head;
        return nexthead;
    }
}