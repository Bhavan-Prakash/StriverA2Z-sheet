package Singly_LL;


public class Segregate_even_and_odd_nodes_in_LinkedList {
    private static ListNode sol(ListNode head){
        ListNode even = head.next, odd_head = head, odd = head, even_head = head.next;

        ListNode temp = head.next.next;
        int cnt = 3;

        while(temp != null){
            if(cnt % 2 == 0){
                even.next = temp;
                even = even.next;
            }else{
                odd.next = temp;
                odd = odd.next;
            }
            cnt++;
            temp = temp.next;

        }

        odd.next = null;
        even.next = odd_head;
        return even_head;
    }

    public static void main(String[] args){
        int[] arr = {1,3,4,5,6};

        System.out.println("original : ");
        ListNode head = SLLHelper.createSLL(arr);
        SLLHelper.print(head);

        head = sol(head);
        System.out.println("after ");
        SLLHelper.print(head);
    }
}
