public class Upper_Bound {
    public int logic(int[] arr, int size, int x) {

        int low = 0;
        int high = size - 1;
        int result = size;

        while (low <= high) {
            int mid = (low + high) / 2;

            if (arr[mid] > x) {
                result = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        int[] arr = {3,5,8,9,15,19};

        Upper_Bound obj = new Upper_Bound();
        int result = obj.logic(arr, arr.length, 9);
        System.out.println(result);

    }

}