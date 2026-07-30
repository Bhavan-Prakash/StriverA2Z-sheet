package Singly_LL;

class Node{
    int data;
    Node ptr;

    Node(int data1, Node ptr1){
        this.data = data1;
        this.ptr = ptr1;
    }

    Node(int data1){
        this.data = data1;
        this.ptr = null;
    }
}


public class Introduction {

    private static Node convert_arr2node(int[] arr){
        Node head = new Node(arr[0]);
        Node mover = head;

        for (int i = 1; i < arr.length; i++) {
            Node temp = new Node(arr[i]);
            mover.ptr = temp;
            mover = temp;
        }
        return head;
    }

    public static void main(String[] args){
        int[] arr = {3,4,5,2,3};
//        Node y = new Node(arr[2]);
//        System.out.println(y.ptr);
        Node head = convert_arr2node(arr);
        Node temp = head;
        int length = 0;
        while(temp != null){
            System.out.print(temp.data + " ");
            temp = temp.ptr;
            length++;
        }
        System.out.println("\n");
        System.out.println(length);

    }

}
