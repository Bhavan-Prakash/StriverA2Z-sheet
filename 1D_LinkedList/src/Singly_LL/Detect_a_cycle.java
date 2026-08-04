package Singly_LL;

public class Detect_a_cycle {
    private static boolean sol(ListNode head){
        ListNode slow=head, fast = head;

        while(fast!=null && fast.next != null){
            slow = slow.next;

            fast = fast.next.next;

            if(slow == fast){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args){
        int[] arr = {1,2,3,4,5};

        System.out.println("original : ");
        ListNode head = SLLHelper.createSLL(arr);
        SLLHelper.print(head);

        System.out.println("sol is :  " + sol(head));
    }
}
