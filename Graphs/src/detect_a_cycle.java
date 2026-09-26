import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class detect_a_cycle {
    public static boolean sol(ArrayList<ArrayList<Integer>> tree, int v){
        Queue<int[]> qe = new LinkedList<>();
        boolean[] vis = new boolean[v];
        qe.add(new int[]{tree.get(0).get(0),-1});

        while(!qe.isEmpty()){
            int[] temp = qe.poll();
            int node = temp[0];
            int parent = temp[1];

            for(int next : tree.get(node)){
                if(!vis[next]){
                    vis[next] = true;
                } else if (parent != next) {
                    return true;
                }
            }
        }

        return false;
    }

    public static void main(String[] args){

    }
}
