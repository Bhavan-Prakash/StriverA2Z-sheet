package Doubly_LL;

public class Insert_node_before_head_in_Doubly_Linked_List{
    public static ListNode Solution(ListNode head, int data){
        ListNode temp = new ListNode(data);

        temp.next = head;
        if(head != null){
            head.prev = temp;
        }
        return temp;
    }

    public static void main(String[] args){
        int[] arr = {1,2,3};

        ListNode head = DLLHelper.createDLL(arr);
        System.out.println("Before : ");
        DLLHelper.print(head);

        head = Solution(head, 3);
        System.out.println("After : ");
        DLLHelper.print(head);



    }
}