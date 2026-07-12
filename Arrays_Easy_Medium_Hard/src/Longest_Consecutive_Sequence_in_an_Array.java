public class Longest_Consecutive_Sequence_in_an_Array {
    public int logic(int[] arr){
        int size = arr.length;
        int result = 0;
        int count = 1;
        int temp = 0;

        for (int i = 0; i < size; i++) {
            temp = arr[i];
            count = 1;

            for (int j = 0; j < size; j++) {
                if (i != j && arr[j] == temp + 1) {
                    temp = arr[j];
                    count++;
                    j = -1;      // Restart searching from the beginning
                }
            }

            if (result < count) {
                result = count;
            }
        }

        return result;
    }

    public static void main(String[] args){
        int[] arr = {0, 3, 7, 2, 5, 8, 4, 6, 0, 1};

        Longest_Consecutive_Sequence_in_an_Array obj = new Longest_Consecutive_Sequence_in_an_Array();
        System.out.println(obj.logic(arr));
    }
}
