import java.util.ArrayList;
import java.util.List;

public class Merge_Sort {
    public void merge(int[] arr, int low, int mid, int high){
        List<Integer> lst = new ArrayList<>();

        int left = low;
        int right = mid+1;

        while(left<=mid && right<=high){
            if(arr[left]<arr[right]){
                lst.add(arr[left++]);
            }else{
                lst.add(arr[right++]);
            }
        }

        while (left <= mid){
            lst.add(arr[left++]);
        }

        while(right <= high){
            lst.add(arr[right++]);
        }

        for (int i = low; i <= high; i++) {
            arr[i] = lst.get(i-low);
        }
    }

    public void merge_sort(int[] arr, int low, int high){

        if( low >= high){
            return;
        }
        int mid = (low+high)/2;
        merge_sort(arr, low,mid);
        merge_sort(arr,mid+1,high);
        merge(arr, low, mid, high);


    }

    public static void main(String[] args){
        int[] arr = {4,3,6,2,8,8,3,2};

        Merge_Sort mg = new Merge_Sort();
        mg.merge_sort(arr,0, arr.length-1 );
        for (int num : arr)
            System.out.print(num + " ");
        System.out.println();
    }
}
