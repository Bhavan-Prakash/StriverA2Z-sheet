import java.util.Arrays;

public class Find_The_missing_Number {
    public int logic(int[] arr){
        Arrays.sort(arr);

        int size = arr.length;

        for (int i = 0; i < size; i++) {
            if(arr[i] != i+1){
                return i+1;
            }
        }
        return -1;
    }
     public static void main(String[] args){
        int[] arr = {1,2,3,5};

        Find_The_missing_Number obj = new Find_The_missing_Number();
         System.out.println(obj.logic(arr));

     }
}
