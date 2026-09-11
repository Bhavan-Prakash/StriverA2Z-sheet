import java.util.ArrayList;

public class graph_formation_initial_learning {

    public static void main(String[] args){
        ArrayList<ArrayList<Integer>> arl = new ArrayList<>();

        //lets us assume no of nodes be n and edges be m

        int n = 5, m=6;

        for (int i = 0; i <= n; i++)
            arl.add(new ArrayList<>());

        // 1--2
        arl.get(1).add(2);
        arl.get(2).add(1);

        // 1--5
        arl.get(1).add(5);
        arl.get(5).add(1);

        //5--3
        arl.get(5).add(3);
        arl.get(3).add(5);

        //5--4
        arl.get(5).add(4);
        arl.get(4).add(5);

        //4--3
        arl.get(4).add(3);
        arl.get(3).add(4);

        //3--2
        arl.get(3).add(2);
        arl.get(2).add(3);

        //for printing
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < arl.get(i).size() ; j++) {
                System.out.print(arl.get(i).get(j) + " ");
            }
            System.out.println();
        }
    }
}
