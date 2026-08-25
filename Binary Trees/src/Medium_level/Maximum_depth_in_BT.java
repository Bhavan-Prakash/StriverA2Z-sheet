package Medium_level;

import java.lang.reflect.Array;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class Maximum_depth_in_BT {
    public static void main(String[] args){
        Tree root = new Tree(1);

        root.left = new Tree(2);
        root.left.left = new Tree(3);

        root.right = new Tree(4);
        root.right.left = new Tree(5);
        root.right.right = new Tree(6);

        Queue<Tree> qt = new LinkedList<>();
        ArrayList<Integer> temp = new ArrayList<>();
        int answer = 0;

        qt.add(root);

        while (!qt.isEmpty()){

            int size = qt.size();

            for (int i = 0; i < size; i++) {
                Tree current = qt.poll();
                temp.add(current.data);

                if(current.left !=null){
                    qt.add(current.left);
                }
                if(current.right != null){
                    qt.add(current.right);
                }
            }

            answer++;
        }

        System.out.println("max depth is " + answer);
    }
}
