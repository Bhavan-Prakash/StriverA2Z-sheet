package Singly_LL;

public class Sort_LL {

    private static ListNode sort(ListNode head){
        ListNode temp = head, temp2 = head;


        while (temp != null && temp.next != null) {

            if (temp.data > temp.next.data) {

                int tempo = temp.next.data;
                temp.next.data = temp.data;
                temp.data = tempo;

                temp = temp2;
            } else {
                temp = temp.next;
            }
        }
        return head;
    }

    public static void main(String[] args){
        int[] arr = {3,4,2,1,5};

        System.out.println("original : ");
        ListNode head = SLLHelper.createSLL(arr);
        SLLHelper.print(head);

        System.out.println("After : ");
        head = sort(head);
        SLLHelper.print(head);
    }

}
