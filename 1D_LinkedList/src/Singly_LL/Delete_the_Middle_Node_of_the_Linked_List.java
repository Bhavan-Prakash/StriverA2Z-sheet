package Singly_LL;

public class Delete_the_Middle_Node_of_the_Linked_List {

    private static ListNode sol(ListNode head){
        ListNode slow = head, fast = head;

        while(fast.next.next!=null && fast.next.next.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }

        slow.next = slow.next.next;

        return head;

    }

    public static void main(String[] args){
        int[] arr = {1,2,3,4};

        ListNode head = SLLHelper.createSLL(arr);
        System.out.println("original: ");
        SLLHelper.print(head);

        head = sol(head);
        System.out.println("sol : ");
        SLLHelper.print(head);

    }

}
