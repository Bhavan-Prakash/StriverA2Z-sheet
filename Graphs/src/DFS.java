import java.util.ArrayList;

public class DFS {
    public static ArrayList<ArrayList<Integer>> tree_list(int n, int m){
        ArrayList<ArrayList<Integer>> arl = new ArrayList<>();

        for (int i = 0; i <= n; i++) {
            arl.add(new ArrayList<>());
        }

        // 1--2
        arl.get(1).add(2);
        arl.get(2).add(1);

        // 1--3
        arl.get(1).add(3);
        arl.get(3).add(1);

        // 2--5
        arl.get(2).add(5);
        arl.get(5).add(2);

        // 2--6
        arl.get(2).add(6);
        arl.get(6).add(2);

        // 3--4
        arl.get(3).add(4);
        arl.get(4).add(3);

        // 3--7
        arl.get(3).add(7);
        arl.get(7).add(3);

        // 7--8
        arl.get(7).add(8);
        arl.get(8).add(7);

        // 4--8
        arl.get(4).add(8);
        arl.get(8).add(4);

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

    public static void DFS(int v, ArrayList<Integer> dfs, boolean[] vis, ArrayList<ArrayList<Integer>> adj){
        vis[v] = true;
        dfs.add(v);

        for(int n : adj.get(v)){
            if(!vis[n]){
                DFS(n, dfs, vis, adj);
            }
        }
    }



    public static void main(String[] args){
        ArrayList<ArrayList<Integer>> inp = tree_list(8,8);

        print_list_tree(inp);

        boolean vis[] = new boolean[8+1];
        ArrayList<Integer> dfs = new ArrayList<>();

        DFS(1, dfs, vis, inp);

        for(int x : dfs){
            System.out.print(x + " ");
        }

    }
}
