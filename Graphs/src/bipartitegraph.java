//public class bipartitegraph {
//}
//
////1 = yellow, 0=red
//
//class Solution {
//
//    public static boolean dfs(int[][] graph, int v, ArrayList<Integer> clr_, int clr) {
//        if (graph == null) {
//            return false;
//        }
//
//        clr_.set(v, clr);   // get() cannot be used for assignment
//
//        for (int nxt : graph[v]) {
//
//            if (clr_.get(nxt) == -1 && clr_.get(v) == 1) {
//                if(!dfs(graph, nxt, clr_, 0)){
//                    return false;
//                }
//            } else if (clr_.get(nxt) == -1 && clr_.get(v) == 0) {
//                if(!dfs(graph, nxt, clr_, 1)){
//                    return false;
//                }
//            } else if (clr_.get(nxt) != -1) {
//                if (clr_.get(v) == clr_.get(nxt)) {
//                    return false;
//                }
//            }
//        }
//
//        return true;
//    }
//
//    public boolean isBipartite(int[][] graph) {
//        ArrayList<Integer> clr_ = new ArrayList<>();
//
//        for (int v = 0; v < graph.length; v++) {
//            clr_.add(-1);
//        }
//
//        for(int i=0; i<graph.length; i++){
//            if(clr_.get(i)==-1){
//                if(!dfs(graph, i, clr_, 0)){
//                    return false;
//                }
//            }
//        }
//
//        return true;
//    }
//}