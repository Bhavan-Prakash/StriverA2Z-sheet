package Singly_LL;

public class Sort_a_Linked_List_of_0s_1s_and_2s_by_changing_links {
    private static ListNode sol(ListNode head){
        ListNode zeros = new ListNode(0);
        ListNode ones = new ListNode(1);
        ListNode twos = new ListNode(2);

        ListNode zerosTail = zeros;
        ListNode onesTail = ones;
        ListNode twosTail = twos;


        ListNode temp = head;

        while(temp!=null){
            if(temp.data == 1){
                onesTail.next = temp;
                onesTail = onesTail.next;
            } else if (temp.data == 0) {
                zerosTail.next = temp;
                zerosTail = zerosTail.next;
            }else{
                twosTail.next = temp;
                twosTail = twosTail.next;
            }
            temp = temp.next;
        }

        twosTail.next = null;

        zerosTail.next = ones.next; // because 1st 0,1,2 are dummy nodes so we have to skip the first nodes
        onesTail.next = twos.next;

        return zeros.next;
    }

    public static void main(String[] args){
        int[] arr = {1,2,0,1,0,2};

        System.out.println("original : ");
        ListNode head = SLLHelper.createSLL(arr);
        SLLHelper.print(head);

        System.out.println("After : ");
        head = sol(head);
        SLLHelper.print(head);
    }
}
