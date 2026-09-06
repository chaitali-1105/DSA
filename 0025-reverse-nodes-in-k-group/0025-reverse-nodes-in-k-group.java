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

    public ListNode get(ListNode temp,int k){
        k=k-1;
        while(temp!=null && k>0){
            k--;
            temp=temp.next;
        }
        return temp;
    }
    ListNode reverse(ListNode head){
        ListNode curr=head;
        ListNode prev1=null;

        while(curr!=null){
            ListNode next1=curr.next;
            curr.next=prev1;
            prev1=curr;
            curr=next1;
        }
        return prev1;
    }
    public ListNode reverseKGroup(ListNode head, int k) {
      ListNode temp=head;
      ListNode prev= null;

      while(temp!=null){
        ListNode knode=get(temp,k);

        if(knode==null){
            if(prev!=null){
                prev.next=temp;
            }
            break;
        }

        ListNode next=knode.next;
        knode.next=null;
        reverse(temp);

        if(temp==head){
            head=knode;
        }
        else{
            prev.next=knode;
        }
        prev=temp;
        temp=next;
      }
      return head;
    }
}