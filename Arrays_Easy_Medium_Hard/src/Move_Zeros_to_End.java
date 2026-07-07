import java.util.ArrayList;
import java.util.List;

public class Move_Zeros_to_End {
    public int[] logic(int[] arr){
        int size = arr.length;
        List<Integer> lst = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            if(arr[i] != 0){
                lst.add(arr[i]);
            }
        }

        for (int j = 0; j < size; j++) {
            if(lst.size()<j+1){
                arr[j] = 0;
            }else{
                arr[j] = lst.get(j);
            }
        }
        return arr;
    }

    public static void main(String[] args){
        int[] arr = {1,2,0,1,0,4,0};

        Move_Zeros_to_End obj = new Move_Zeros_to_End();
        int[] soln = obj.logic(arr);

        for (int num : soln){
            System.out.print(num + " ");
        }

    }
}
