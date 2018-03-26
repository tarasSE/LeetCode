package my.solutions.medium;

//Definition for singly-linked list.
class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
    }
}

public class AddTwoNumbers {
    public Object[] add(int curr1Val, int curr2Val, int overflow, ListNode resTail) {
        int tmp = curr1Val + curr2Val + overflow;
        int r = tmp % 10;
        overflow = (r == tmp) ? 0 : 1;
        resTail.next = new ListNode(r);
        resTail = resTail.next;
        return new Object[]{resTail, overflow};
    }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        if ((l1.val == 0 && l1.next == null) || (l2.val == 0 && l2.next == null)) return l1.val == 0 ? l2 : l1;

        ListNode resHead = new ListNode(0);
        ListNode resTail = resHead;
        ListNode curr1 = l1;
        ListNode curr2 = l2;
        int overflow = 0;
        boolean firstComplete = false;
        boolean secondComplete = false;

        while (!firstComplete && !secondComplete) {
            if (curr1.next == null) firstComplete = true;
            if (curr2.next == null) secondComplete = true;

            Object[] arr = add(curr1.val, curr2.val, overflow, resTail);
            resTail = (ListNode) arr[0];
            overflow = (int) arr[1];

            curr1 = curr1.next;
            curr2 = curr2.next;
        }

        if ((firstComplete && !secondComplete) || (!firstComplete)) {
            ListNode left = firstComplete ? curr2 : curr1;
            while (overflow > 0 && left != null) {
                Object[] arr = add(left.val, 0, overflow, resTail);
                resTail = (ListNode) arr[0];
                overflow = (int) arr[1];

                left = left.next;
            }

            if (left != null) {
                resTail.next = left;
            }
        }

        if (overflow > 0) {
            resTail.next = new ListNode(overflow);
        }

        return resHead.next;
    }
}
