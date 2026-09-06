class Solution {

    // Merge two sorted lists using recursion
    public ListNode mergesort(ListNode list1, ListNode list2) {

        // Base case
        if (list1 == null) {
            return list2;
        }

        if (list2 == null) {
            return list1;
        }

        if (list1.val <= list2.val) {

            list1.next = mergesort(list1.next, list2);
            return list1;

        } else {

            list2.next = mergesort(list1, list2.next);
            return list2;
        }
    }

    ListNode findmid(ListNode head) {

        ListNode slow = head;
        ListNode fast = head.next;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;
    }

    // Merge Sort
    public ListNode sortList(ListNode head) {

        // Base case
        if (head == null || head.next == null) {
            return head;
        }

   
        ListNode mid = findmid(head);

        // Divide into two lists
        ListNode lefthead = head;
        ListNode righthead = mid.next;

        mid.next = null;

        // Recursively sort both halves
        ListNode left = sortList(lefthead);
        ListNode right = sortList(righthead);

   
        return mergesort(left, right);
    }
}