package Doubly_LL;

public class Delete_Last_Node_of_a_Doubly_Linked_List {
    private static ListNode soln(int[] arr, ListNode head){
        ListNode temp = head;

        while(temp != null){
            if(temp.next.next == null){
                temp.next.prev = null;
                temp.next = null;
            }
            temp = temp.next;
        }
        return head;
    }

    public static void main(String[] args){
        int[] arr = {1,2,3,4};

        ListNode head = DLLHelper.createDLL(arr);
        System.out.println("Before : ");
        DLLHelper.print(head);

        head = soln(arr, head);
        System.out.println("After : ");
        DLLHelper.print(head);
    }
}
