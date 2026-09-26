public class surrounded_Regions {
}

class Solution {

    class pair{
        int row;
        int column;

        public pair(int row, int column){
            this.row = row;
            this.column = column;
        }
    }
    public void solve(char[][] board) {
        int r = board.length;
        int c = board[0].length;

        Queue<pair> qe = new LinkedList<>();
        boolean[][] vis = new boolean[r][c];

        for(int i = 0; i<r; i++){
            if(board[i][0] == 'O'){
                qe.add(new pair(i,0));
                vis[i][0] = true;
            }

            if(board[i][c-1] == 'O'){
                qe.add(new pair(i,c-1));
                vis[i][c-1] = true;

            }
        }

        for(int j = 1; j<c-1 ; j++){
            if(board[0][j] == 'O'){
                qe.add(new pair(0,j));
                vis[0][j] = true;

            }

            if(board[r-1][j] == 'O'){
                qe.add(new pair(r-1, j));
                vis[r-1][j] = true;

            }
        }

        int[] d_r = {1,0,-1,0};
        int[] d_c = {0,-1,0,1};

        while(!qe.isEmpty()){
            pair temp = qe.poll();

            for(int i = 0; i<4; i++){
                int n_r = temp.row + d_r[i];
                int n_c = temp.column + d_c[i];

                if(n_r >= 0 && n_c >= 0 && n_r < r && n_c < c && !vis[n_r][n_c] && board[n_r][n_c] == 'O'){

                    qe.add(new pair(n_r, n_c));
                    vis[n_r][n_c] = true;
                }
            }
        }

        // Convert surrounded O's to X
        for(int i = 0; i < r; i++) {
            for(int j = 0; j < c; j++) {

                if(board[i][j] == 'O' && !vis[i][j]) {
                    board[i][j] = 'X';
                }
            }
        }

    }
}