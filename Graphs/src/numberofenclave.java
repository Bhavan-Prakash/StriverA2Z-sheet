public class numberofenclave {
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
    public int numEnclaves(int[][] grid) {
        int r = grid.length;
        int c = grid[0].length;

        int[][] vis = new int[r][c];

        Queue<pair> qe = new LinkedList<>();

        for(int i = 0; i<r; i++){
            for(int j = 0; j<c; j++){
                if(i ==0 || j==0 || i==r-1 || j == c-1){
                    if(grid[i][j] == 1){
                        vis[i][j] = 1;
                        qe.add(new pair(i,j));
                    }else{
                        vis[i][j] = 0;
                    }
                }

            }
        }

        int[] mov_r = {-1, 0, 1, 0};
        int[] mov_c = {0,1,0,-1};
        int ans = 0;

        while(!qe.isEmpty()){
            pair temp = qe.poll();

            for(int i = 0; i<4; i++){
                int nr = temp.row + mov_r[i];
                int nc = temp.column + mov_c[i];

                if(nr >= 0 && nr < r && nc >= 0 && nc < c && grid[nr][nc] == 1 && vis[nr][nc] == 0){
                    vis[nr][nc] = 1;
                    qe.add(new pair(nr, nc));
                }
            }
        }

        for(int i = 0; i<r; i++){
            for(int j = 0; j<c; j++){
                if(grid[i][j] != vis[i][j]){
                    ans++;
                }

            }
        }

        return ans;
    }
}