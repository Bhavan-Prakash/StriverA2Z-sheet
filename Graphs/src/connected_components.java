import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class connected_components {

    public static ArrayList<ArrayList<Integer>> tree_formation(int n, int m){

        ArrayList<ArrayList<Integer>> tree = new ArrayList<>();

        for (int i = 0; i <= n; i++) {
            tree.add(new ArrayList<>());
        }

        tree.get(0).add(1);
        tree.get(1).add(0);

        tree.get(0).add(2);
        tree.get(2).add(0);

        tree.get(2).add(3);
        tree.get(3).add(2);

        tree.get(4).add(5);
        tree.get(5).add(4);

        tree.get(6).add(6);

        for (int i = 0; i <= n; i++) {
            System.out.print(i + "   { ");
            for (int j = 0; j < tree.get(i).size(); j++) {
                System.out.print(tree.get(i).get(j) + ", ");
            }
            System.out.print( "}");
            System.out.println();
        }

        return tree;
    }


    public static void bfs(ArrayList<ArrayList<Integer>> tree, Queue<Integer> que, ArrayList<Integer> ans, boolean[] vis, int start){

       que.add(start);
       vis[start] = true;

        while(!que.isEmpty()){
            int temp = que.poll();
            ans.add(temp);
            for (int i : tree.get(temp)) {
                if(!vis[i]){
                    vis[i] = true;
                    que.add(i);
                }
            }

        }
    }

    public static void main(String[] args){
        ArrayList<ArrayList<Integer>> tree = tree_formation(6, 4);
        ArrayList<Integer> ans = new ArrayList<>();
        Queue<Integer> que = new LinkedList<>();
        boolean vis[] = new boolean[7+1];
        int cnt = 0;

        for (int i = 0; i <= 6; i++) {
            if(!vis[i]){
                cnt++;
                bfs(tree,que,ans,vis,i);
            }
        }
        System.out.println(cnt);


    }

}
