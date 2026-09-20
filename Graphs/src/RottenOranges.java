import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

class pair{
    int row;
    int column;
    int time;

    public pair(int row, int column, int time){
        this.row = row;
        this.column = column;
        this.time = time;
    }
}

public class RottenOranges {

    public static int solution(int[][] input){
        int n = input.length;
        int t = 1;
        int m = input[0].length;
        Queue<pair> qe = new LinkedList<>();
        int[][] bfs = new int[n][m];
        boolean[][] vis = new boolean[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if(input[i][j] == 2){
                    qe.add(new pair(i,j,t));
                    bfs[i][j] = 2;
                    vis[i][j] = true;
                } else if (input[i][j] == 1) {
                    bfs[i][j] = 1;
                }else{
                    bfs[i][j] = 0;
                    vis[i][j] = true;
                }

            }
        }

        int[] rep_n = {1,0,-1,0};
        int[] rep_m = {0,-1,0,1};

        while (!qe.isEmpty()){
            pair temp = qe.poll();

            for (int i = 0; i < 4; i++) {
                if (
                        temp.row + rep_n[i] >= 0 &&
                                temp.row + rep_n[i] < n &&
                                temp.column + rep_m[i] >= 0 &&
                                temp.column + rep_m[i] < m &&
                                !vis[temp.row + rep_n[i]][temp.column + rep_m[i]] &&
                                input[temp.row + rep_n[i]][temp.column + rep_m[i]] == 1
                ){
                    t+=1;
                    bfs[temp.row+rep_n[i]][temp.column+rep_m[i]] = 2;
                    vis[temp.row+rep_n[i]][temp.column+rep_m[i]] = true;
                    qe.add(new pair(temp.row+rep_n[i],temp.column+rep_m[i], t));
                }
            }

        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (bfs[i][j] == 1 || !vis[i][j]){
                    return -1;
                }
            }
        }

        return t;

    }

    public static void main(String[] args){
        int[][] input ={
                {2,1,1},
                {0,2,2},
                {2,0,1}
        };

        System.out.println("solution is : " + solution(input));

    }

}
