import java.util.ArrayList;

public class noofprovince {

    public static ArrayList<ArrayList<Integer>> tree_formation(int n, int m){

        ArrayList<ArrayList<Integer>> tree = new ArrayList<>();

        for (int i = 0; i <= n; i++) {
            tree.add(new ArrayList<>());
        }

        tree.get(1).add(2);
        tree.get(2).add(1);

        tree.get(1).add(3);
        tree.get(3).add(1);

        tree.get(3).add(4);
        tree.get(4).add(3);

        tree.get(5).add(6);
        tree.get(6).add(5);

        for (int i = 0; i <= n; i++ ){
            System.out.print( i + "  { ");
            for (int j = 0; j <tree.get(i).size() ; j++) {
                System.out.print(tree.get(i).get(j) + ", ");
            }
            System.out.print(" }");
            System.out.println();
        }
        return tree;
    }


    public static void sol(ArrayList<ArrayList<Integer>> ajc_matrix, int v, boolean[] vis, ArrayList<Integer> ans){

        vis[v] = true;
        ans.add(v);

        for(int n : ajc_matrix.get(v)){
            if(!vis[n]){

                sol(ajc_matrix, n, vis, ans);
            }
        }
    }

    public static void main(String[] args){
        boolean[] vis = new boolean[6+1];
        ArrayList<Integer> ans = new ArrayList<>();
        int cnt = 0;

        ArrayList<ArrayList<Integer>> aj = tree_formation(6,4);

        for (int i = 1; i <= 6 ; i++) {
            if(!vis[i]){
                cnt++;
                sol(aj, i, vis, ans);
            }
        }

        System.out.println(cnt);



    }



}
