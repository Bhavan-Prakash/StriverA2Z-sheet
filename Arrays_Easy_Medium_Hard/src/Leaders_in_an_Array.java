import java.util.ArrayList;

public class Leaders_in_an_Array {

    public ArrayList<Integer> logic(int[] arr){
        int size = arr.length;
        ArrayList<Integer> sol = new ArrayList<>();
        sol.add(arr[size-1]);
        int greatest = arr[size-1];

        for (int i = size-2; i > 0 ; i--) {
            if(arr[i]>greatest){
                greatest = arr[i];
                sol.add(arr[i]);
            }
        }

        return sol;
    }

    public static void main(String[] args){
        int[] arr = {10,22,12,3,0,6};

        Leaders_in_an_Array obj = new Leaders_in_an_Array();
        ArrayList<Integer> solution = obj.logic(arr);
        for(int i = solution.size()-1; i>=0 ; i--){
            System.out.print(solution.get(i) + " ");
        }
//        System.out.println(solution);
    }

}
