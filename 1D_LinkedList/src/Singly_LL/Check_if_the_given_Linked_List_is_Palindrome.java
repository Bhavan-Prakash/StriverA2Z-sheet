package Singly_LL;

public class Check_if_the_given_Linked_List_is_Palindrome {
    private static ListNode reverse(ListNode head){

        ListNode curr = head;
        ListNode prev = null;
        while(curr != null){
            ListNode temp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = temp;
        }

        return prev;
    }

    private static boolean palindrome(ListNode head){
        ListNode slow = head, fast = head, temp = head;

        while( fast != null && slow != null && fast.next != null && fast.next.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }

        ListNode temp2 = reverse(slow.next);

        while(temp2 != null){
            if(temp.data != temp2.data){
                return false;
            }
            temp = temp.next;
            temp2 = temp2.next;
        }

        ListNode org = reverse(slow.next);

        return true;

    }

    public static void main(String[] args){
        int[] arr = {1,2,3,2,1,5};

        System.out.println("original : ");
        ListNode head = SLLHelper.createSLL(arr);
        SLLHelper.print(head);


        boolean ans = palindrome(head);
        System.out.println("sol : " + ans);
    }
}
