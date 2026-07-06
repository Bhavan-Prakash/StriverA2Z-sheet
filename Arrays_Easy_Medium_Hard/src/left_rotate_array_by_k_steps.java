import java.util.ArrayList;

public class left_rotate_array_by_k_steps {

    public int[] logic(int[] arr, int k){
        int size = arr.length;
        int k_copy = k;
        ArrayList<Integer> soln = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < k; j++) {
                soln.add(arr[j]);
            }
            arr[i] = arr[i-k_copy];
        }
        int j = 0;
        for (int i = size-k_copy; i < size; i++) {
            arr[i] = soln.get(j);
            j++;
        }
    return arr;
    }

    public static void main(String[] args){
        int[] arr = {7,5,4,3,6};

        left_rotate_array_by_k_steps  obj = new left_rotate_array_by_k_steps ();


        int[] result =  obj.logic(arr, 2);

        System.out.println("the answer is : " );
        for (int num : result){
            System.out.print(num + " ");
        }
    }
}
