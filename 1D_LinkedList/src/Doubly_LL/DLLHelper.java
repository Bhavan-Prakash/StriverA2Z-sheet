package Doubly_LL;

public class DLLHelper {

    public static ListNode createDLL(int[] arr) {

        if (arr.length == 0)
            return null;

        ListNode head = new ListNode(arr[0]);
        ListNode mover = head;

        for (int i = 1; i < arr.length; i++) {
            ListNode temp = new ListNode(arr[i]);
            mover.next = temp;
            temp.prev = mover;
            mover = temp;
        }

        return head;
    }

    public static void print(ListNode head) {

        while (head != null) {
            System.out.print(head.data + " ");
            head = head.next;
        }

        System.out.println();
    }
}