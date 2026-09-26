//public class _01_matrix {
//}
//
//
//class pair{
//    int row;
//    int column;
//    int cnt;
//
//    public pair(int row, int column, int cnt){
//        this.row = row;
//        this.column = column;
//        this.cnt = cnt;
//    }
//}
//
//class Solution {
//    public int[][] updateMatrix(int[][] mat) {
//        int r = mat.length;
//        int c = mat[0].length;
//        int cnt = 0;
//
//        int[][] ans = new int[r][c];
//        boolean[][] vis = new boolean[r][c];
//        Queue<pair> qe = new LinkedList<>();
//
//        for(int i = 0; i<r; i++){
//            for(int j = 0; j<c; j++){
//                if(mat[i][j] == 0){
//                    qe.add(new pair(i,j, cnt));
//                    ans[i][j] = 0;
//                    vis[i][j] = true;
//                }
//            }
//        }
//
//        int[] d_row = {0,1,0,-1};
//        int[] d_col = {-1,0,1,0};
//
//        while(!qe.isEmpty()){
//            pair temp = qe.poll();
//
//            int r_t = temp.row;
//            int c_t = temp.column;
//            int cnt_t = temp.cnt;
//
//            for(int i = 0; i<4 ; i++){
//                int n_r = r_t + d_row[i];
//                int n_c = c_t + d_col[i];
//
//                if(n_r >= 0 && n_c >= 0 && n_r<r && n_c<c && vis[n_r][n_c] != true){
//
//                    ans[n_r][n_c] = cnt_t + 1;
//                    vis[n_r][n_c] = true;
//                    qe.add(new pair(n_r, n_c, cnt_t+1));
//                }
//            }
//        }
//
//        return ans;
//    }
//}