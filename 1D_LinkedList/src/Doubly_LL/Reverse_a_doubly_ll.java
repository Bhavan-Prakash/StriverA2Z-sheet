package Doubly_LL;

public class Reverse_a_doubly_ll {

    private static ListNode sol(int[] arr, ListNode head){
        ListNode current = head;
        ListNode temp = null;

        while(current != null){
            temp = current.prev;
            current.prev = current.next;
            current.next = temp;

            current = current.prev;
        }
        if(temp!= null){
            head = temp.prev;
        }

        return head;
    }

    public static void main(String[] args){
        int[] arr = {1,2,3,4};

        ListNode head = DLLHelper.createDLL(arr);
        System.out.println("Before : ");
        DLLHelper.print(head);

        head = sol(arr,head);
        System.out.println("after : ");
        DLLHelper.print(head);
    }

}
