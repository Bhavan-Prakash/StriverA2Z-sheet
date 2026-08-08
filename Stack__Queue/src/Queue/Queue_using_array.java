package Queue;

class impl_queue{
    int start, end= -1;
    int curr = 0;
    int[] queue = new int[3];

    public void push(int n) {
        if (curr == queue.length) {
            System.out.println("Queue filled!!");
            return;
        }

        if (start == -1 && end == -1) {
            start = 0;
            end = 0;
        } else {
            end = (end + 1) % queue.length;
        }

        queue[end] = n;
        curr++;

        System.out.println("Now queue is:");

        for (int i = 0; i < curr; i++) {
            System.out.println(queue[(start + i) % queue.length] + " ");
        }
    }

    public void pop(){
        if(curr == -1){
            System.out.println("queue is empty !!");
        }

        int el = queue[start];

        if(curr == 1){
            start = end = -1;
        }

        start = (start +1)%queue.length;
        curr = curr-1;
        System.out.println(el + " deleted");
    }

    public void top(){
        if(curr == -1){
            System.out.println("queue is empty !!");
        }

        System.out.println(queue[start]);
    }

    public void size(){
        if(curr == -1){
            System.out.println("queue is empty !!");
        }
        System.out.println(curr+1 + " is size");
    }
}

public class Queue_using_array {
    public static void main(String[] args){
        impl_queue que = new impl_queue();

        que.push(10);
        que.push(20);
        que.push(30);
        que.pop();
        que.push(40);
        que.top();
        que.size();
    }
}
