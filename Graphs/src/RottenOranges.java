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

    public static void rotten(int[][] input){
        int n = input.length;
        int m = input[0].length;

        Queue<pair> qe = new LinkedList<>();

        int[][] vis = new int[n][m];

        for (int i = 0; i < n ; i++) {
            for (int j = 0; j < m; j++) {
                if(input[i][j] == 2){
                    qe.add(new pair(i,j,1));
                    vis[i][j] = 2;
                }else{
                    vis[i][j] = 1;
                }
            }
        }

        int[] drow = {-1,0,1,0};
        int[] dcol = {0,1,0,-1};


        while (!qe.isEmpty()){
            pair temp = qe.poll();

            if()

        }
    }

}
