public class bubble_sort {
    public static void main(String[] args) {
        int[] arr = {10, 14, 5, 20, 3, 2, 1};

        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {

                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        for (int x : arr) {
            System.out.print(x + " ");
        }
    }
}