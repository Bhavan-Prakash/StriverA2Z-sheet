import java.util.ArrayList;
import java.util.Stack;

public class topological_sort {
    public static void dfs(ArrayList<ArrayList<Integer>> tree, int node, ArrayList<Integer> vis, Stack<Integer> sol){
        vis.set(node,1);

        for(int nxt : tree.get(node)){
            if(vis.get(nxt) == 0){
                dfs(tree, nxt, vis, sol);
            }
        }
        sol.push(node);
    }


    public static void main(String[] args){

    }
}
