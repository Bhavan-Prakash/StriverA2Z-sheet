import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class BFS {
    public static ArrayList<ArrayList<Integer>> tree_list(int n, int m){
        ArrayList<ArrayList<Integer>> arl = new ArrayList<>();

        for (int i = 0; i <= n; i++) {
            arl.add(new ArrayList<>());
        }

        // 1--2
        arl.get(1).add(2);
        arl.get(2).add(1);

        // 1--6
        arl.get(1).add(6);
        arl.get(6).add(1);

        // 2--3
        arl.get(2).add(3);
        arl.get(3).add(2);

        // 2--4
        arl.get(2).add(4);
        arl.get(4).add(2);

        // 6--7
        arl.get(6).add(7);
        arl.get(7).add(6);

        // 6--8
        arl.get(6).add(8);
        arl.get(8).add(6);

        // 4--5
        arl.get(4).add(5);
        arl.get(5).add(4);

        // 7--5
        arl.get(7).add(5);
        arl.get(5).add(7);

        return arl;
    }

    public static void print_list_tree(ArrayList<ArrayList<Integer>> tree){
        System.out.println("Adjustancy list is as below : ");

        for (int i = 0; i < tree.size(); i++) {
            System.out.print(i + "     ");
            System.out.print("{");
            for (int j = 0; j < tree.get(i).size(); j++) {
                System.out.print(tree.get(i).get(j) + ",");
            }
            System.out.print("}");

            System.out.println();
        }
    }

    public static ArrayList<Integer> BFS(int n, ArrayList<ArrayList<Integer>> tree){

        ArrayList<Integer> bfs = new ArrayList<>();
        boolean vis[] = new boolean[n+1];
        Queue<Integer> q = new LinkedList<>();

        vis[1] = true;
        q.add(1);
        while(!q.isEmpty()){
            int number = q.poll();
            bfs.add(number);

            for (int i : tree.get(number)) {
                if(!vis[i] ){
                    q.add(i);
                    vis[i] = true;
                }

            }
        }
        return bfs;
    }

    public static void main(String[] args){
        ArrayList<ArrayList<Integer>> inp = tree_list(8,8);

        print_list_tree(inp);

        System.out.println("BFS for the above tree is as below : ");
        ArrayList<Integer> ans = BFS(8, inp);
        for (int i : ans){
            System.out.print(i + ",");
        }
    }
}
