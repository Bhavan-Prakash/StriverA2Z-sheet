package Doubly_LL;

public class Insert_at_end_of_Doubly_Linked_List {

    private static ListNode solution(ListNode head, int data){
        ListNode mover = head;
        ListNode temp = new ListNode(data);

        while(mover != null){
            if(mover.next == null){
                mover.next = temp;
                temp.prev = mover;
                break;
            }
            mover = mover.next;
        }
        return head;
    }

    public static void main(String[] args){
        int[] arr = {1,2,3,4};

        ListNode head = DLLHelper.createDLL(arr);
        System.out.println("Before");
        DLLHelper.print(head);

        head = solution(head, 6);
        System.out.println("After");
        DLLHelper.print(head);
    }

}
