import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

class Tree{
    Tree right;
    Tree left;
    int data;

    Tree(int value){
        data = value;
        left = null;
        right = null;
    }
}


public class Level_order_traversal {
    public static void main(String[] args){
        // Creating the tree
        Tree root = new Tree(1);

        root.left = new Tree(2);
        root.right = new Tree(3);

        root.left.left = new Tree(4);
        root.left.right = new Tree(5);

        root.right.right = new Tree(7);

        Queue<Tree> qe = new LinkedList<>();
        ArrayList<Integer> answer = new ArrayList<>();

        qe.add(root);

        while (!qe.isEmpty()){
            Tree current = qe.poll();

            answer.add(current.data);

            if(current.left != null){
                qe.add(current.left);
            }

            if(current.right != null){
                qe.add(current.right);
            }
        }

        for (int x : answer){
            System.out.print(x + " ");
        }
    }
}
