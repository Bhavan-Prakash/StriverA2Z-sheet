package Singly_LL;

public class Reverse_a_ll {
    private static ListNode sol(ListNode head){
        ListNode temp = null;
        ListNode curr = head;

        while(curr!= null){
            ListNode next = curr.next;
            curr.next = temp;
            temp = curr;
            curr = next;
        }
        return temp;
    }

    public static void main(String[] args){
        int[] arr = {1,2,3,4,5};

        System.out.println("original : ");
        ListNode head = SLLHelper.createSLL(arr);
        SLLHelper.print(head);

        System.out.println("Reversed : ");
        head = sol(head);
        SLLHelper.print(head);
    }
}
