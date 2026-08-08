package Stack;

class Node{
    int data;
    Node next;

    public Node(int n){
        this.data = n;
    }

    public Node(int n, Node nxt){
        this.data = n;
        this.next = nxt;
    }
}

class print_{
    public static void print(Node head) {

        while (head != null) {
            System.out.print(head.data + " ");
            head = head.next;
        }

        System.out.println();
    }
}

class impl_stack{
    int top = -1;
    Node top_node = null;

    int size = 0;

    public void push(int n){
        Node obj = new Node(n);
        obj.next = top_node;
        top_node = obj;
        top = top_node.data;
        size = size +1;
        print_.print(top_node);
    }

    public void pop(){
        Node temp = top_node;
        int rmv = temp.data;
        top_node = top_node.next;
        temp.next = null;
        size = size-1;
        top = top_node.data;
        System.out.println("removed : " + rmv);
    }

    public void size(){
        System.out.println(size);
    }

    public void top(){
        System.out.println(top);
    }
}

public class Stack_using_LL {

    public static void main(String[] args){
        impl_stack stck = new impl_stack();

        stck.push(10);
        stck.push(20);
        stck.push(30);
        stck.push(40);
        stck.pop();
        stck.pop();
        stck.top();
        stck.size();

    }

}
