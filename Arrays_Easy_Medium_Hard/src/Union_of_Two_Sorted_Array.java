import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Union_of_Two_Sorted_Array {
    public List<Integer> logic(int[] arr1, int[] arr2, int size_1, int size_2){
        Set<Integer> set = new HashSet<>();

        for(int num : arr1){
            set.add(num);
        }

        for(int num : arr2){
            set.add(num);
        }

        return new ArrayList<>(set);
    }

    public static void main(String[] args){
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {2,3,4,4,5,6,3,6};
        int size_1 = arr1.length;
        int size_2 = arr2.length;
        Union_of_Two_Sorted_Array obj = new Union_of_Two_Sorted_Array();
        System.out.println("solution is : ");
        List<Integer> soln = obj.logic(arr1, arr2, size_1,size_2);

        for (int num : soln){
            System.out.print(num + " ");
        }


    }
}
