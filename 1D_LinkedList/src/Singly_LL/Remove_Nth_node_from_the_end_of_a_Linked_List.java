package Singly_LL;

public class Remove_Nth_node_from_the_end_of_a_Linked_List {

    private static ListNode sol(ListNode head, int n){
        ListNode slow = head;
        ListNode fast = head;
        for (int i = 0; i < n; i++) {
            fast = fast.next;
        }

        while(fast.next != null){
            slow = slow.next;
            fast = fast.next;
        }

        slow.next = slow.next.next;

        return head;
    }

    public static void main(String[] args){
        int[] arr = {1,2,3,4,5};

        ListNode head = SLLHelper.createSLL(arr);
        System.out.println("original: ");
        SLLHelper.print(head);

        head = sol(head, 2);

        System.out.println("sol : ");
        SLLHelper.print(head);

    }
}
