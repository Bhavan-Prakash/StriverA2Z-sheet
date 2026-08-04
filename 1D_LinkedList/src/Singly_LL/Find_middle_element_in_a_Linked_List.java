package Singly_LL;

public class Find_middle_element_in_a_Linked_List {
    private static int sol(ListNode head){
        ListNode slow = head, fast = head;

        while(fast != null && fast.next != null && slow != null){
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow.data;
    }

    public static void main(String[] args){
        int[] arr = {1,2,3,4,5,6};

        ListNode head = SLLHelper.createSLL(arr);
        System.out.println("original ll : ");
        SLLHelper.print(head);

        System.out.println("Sol is : ");
        System.out.print(sol(head));
    }
}
