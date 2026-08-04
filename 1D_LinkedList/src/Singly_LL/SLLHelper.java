package Singly_LL;

public class SLLHelper {

    // Array -> Singly Linked List
    public static ListNode createSLL(int[] arr) {

        if (arr == null || arr.length == 0)
            return null;

        ListNode head = new ListNode(arr[0]);
        ListNode mover = head;

        for (int i = 1; i < arr.length; i++) {

            ListNode temp = new ListNode(arr[i]);
            mover.next = temp;
            mover = temp;
        }

        return head;
    }

    // Print List
    public static void print(ListNode head) {

        while (head != null) {
            System.out.print(head.data + " ");
            head = head.next;
        }

        System.out.println();
    }

    // Length of List
    public static int length(ListNode head) {

        int count = 0;

        while (head != null) {
            count++;
            head = head.next;
        }

        return count;
    }

    // Return Tail
    public static ListNode getTail(ListNode head) {

        if (head == null)
            return null;

        while (head.next != null) {
            head = head.next;
        }

        return head;
    }
}