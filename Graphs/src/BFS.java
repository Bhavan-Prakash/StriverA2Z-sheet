import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class BFS {
    public static void main(String[] args){
        ArrayList<ArrayList<Integer>> arl = new ArrayList<>();

        // no of node is n and edges is e

        int n = 9, m = 9;
        for (int i = 0; i <= n ; i++)
            arl.add(new ArrayList<Integer>());

        // 1--2
        arl.get(1).add(2);
        arl.get(2).add(1);

        // 1--6
        arl.get(1).add(6);
        arl.get(6).add(1);

        //2--3
        arl.get(2).add(3);
        arl.get(3).add(2);

        //2--4
        arl.get(2).add(4);
        arl.get(4).add(2);

        //6--7
        arl.get(6).add(7);
        arl.get(7).add(6);

        //6--9
        arl.get(6).add(9);
        arl.get(9).add(6);

        //4--5
        arl.get(4).add(5);
        arl.get(5).add(4);

        //7--8
        arl.get(7).add(8);
        arl.get(8).add(7);

        //5--8
        arl.get(5).add(8);
        arl.get(8).add(5);

        System.out.println("adjustjancy list is as below : ");

        for (int i = 1; i <= n ; i++) {
            for (int j = 0; j < arl.get(i).size(); j++) {
                System.out.print(arl.get(i).get(j) + " ");
            }
            System.out.println();
        }

        int[] arr = new int[n+1];
        Queue<Integer> qu = new LinkedList<>();
        int starting_index = 1;
        qu.add(starting_index)

        for (int i = 0; i <=n ; i++) {
            arr[qu.poll()] = 1;

            for (int j = 0; j < ; j++) {

            }
        }


    }
}
