public class count_subarray_sum_equals_k {

    public int logic(int[] arr, int k) {

        int size = arr.length;
//        int temp = 0;
//        int result_temp = 0;
//
//        int result = 0;
//
//        for (int i = 1; i < size; i++) {
//            for (int j = i-1; j < size; j++) {
//                if(result_temp == 0){
//                    result_temp +=2;
//                }else{
//                    result_temp++;
//                }
//                if(i!=j) {
//                    temp += arr[j] + arr[i];
//
//                }
//                if(result != 0 && result_temp<result){
//                    result = result_temp;
//                }
//                if(temp == k || j == size-1){
//                    result = result_temp;
//                    result_temp = 0;
//                    temp = 0;
//                    break;
//                }
//            }
//        }

        int count = 0;

        for (int i = 0; i < size; i++) {
            int sum = 0;

            for (int j = i; j < size; j++) {
                sum += arr[j];

                if (sum == k)
                    count++;
            }


        }
        return count;
    }


    public static void main(String[] args){
        int[] arr = {1,2,3};

        count_subarray_sum_equals_k obj = new count_subarray_sum_equals_k();

        System.out.println("Result is : " + obj.logic(arr, 3));
    }
}
