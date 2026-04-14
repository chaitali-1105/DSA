/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        HashSet<ListNode> set= new HashSet<>();
        while(headA!=null){
            set.add(headA);
            headA=headA.next;
        }
        while(headB!=null){
            if(set.contains(headB)){
                return headB;
            }
            headB=headB.next;
        }
        return null;
    }
}

//class Solution {
//     public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
//         ListNode l1 = headA;
//         ListNode l2 = headB;

//         while (l1 != l2) {
//             l1 = (l1 != null) ? l1.next : headB;
//             l2 = (l2 != null) ? l2.next : headA;
//         }

//         return l1;
//     }
// }