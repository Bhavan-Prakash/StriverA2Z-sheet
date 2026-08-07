package Singly_LL;

public class Sort_a_Linked_List {

    private static ListNode sol (ListNode head){
        ListNode slow = head, fast = head.next, temp = head;

        while(fast != null){
            if(slow.data > fast.data){
                int tempd = fast.data;
                fast.data = slow.data;
                slow.data = tempd;

                slow = temp;
                fast = temp.next;
            }
            slow = slow.next;
            fast = fast.next;
        }
        return temp;
    }

    public static void main(String[] args){
        int[] arr = {40,20,60,10,50,30};

        ListNode head = SLLHelper.createSLL(arr);
        System.out.println("original: ");
        SLLHelper.print(head);

        head = sol(head);
        System.out.println("sol : ");
        SLLHelper.print(head);

    }

}
