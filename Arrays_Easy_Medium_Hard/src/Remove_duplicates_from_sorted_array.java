import java.util.HashSet;
import java.util.Set;

public class Remove_duplicates_from_sorted_array {

  public int[] logic(int[] arr){
      int size = arr.length;
      Set<Integer> sets = new HashSet<>();
      int index = 0;
      for(int num: arr){
          if(!sets.contains(num)){
              sets.add(num);
              arr[index] = num;
              index++;
          }
      }
      return arr;
  }

  public static void main(String[] args){
      int[] arr = {1,1,2,3,4,4,5};

      System.out.println("initial array : ");
      for(int num : arr){
          System.out.print(num + " ");
      }
      System.out.println();

      Remove_duplicates_from_sorted_array obj = new Remove_duplicates_from_sorted_array();

      int[] soln = obj.logic(arr);

      System.out.println("Answered Array : ");
      for(int num : soln){
          System.out.print(num + " ");
      }

  }
}
