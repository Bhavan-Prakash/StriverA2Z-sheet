package Revision_21oct;

public class spiral_matrix_54 {
}

class Solution {

    public List<Integer> spiralOrder(int[][] matrix) {
        int top = 0;
        int left = 0;
        int right = matrix[0].length-1;
        int bottom = matrix.length-1;
        List<Integer> sol = new ArrayList<Integer>();

        while(top <= bottom && left <= right){
            //1. left to right
            for(int i = left; i<=right; i++){
                sol.add(matrix[top][i]);
            }
            top++;

            //2. top to bottom
            for(int i = top; i<= bottom; i++){
                sol.add(matrix[i][right]);
            }
            right--;

            //3. right to left
            if(top <= bottom){
                for(int i = right; i>= left; i--){
                    sol.add(matrix[bottom][i]);
                }
                bottom--;
            }

            //4. bottom to top
            if(left <= right){
                for(int i = bottom; i>= top; i--){
                    sol.add(matrix[i][left]);
                }
                left++;
            }

        }
        return sol;

    }
}