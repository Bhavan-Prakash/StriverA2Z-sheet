public class Longest_Subarray_with_given_sumK {
    public int logic(int[] arr, int k){
        int size = arr.length;

        int count = 0;
        int sum = 0;
        int result = 0;
        for (int i = 0; i < size; i++) {
            for (int j = i; j < size; j++) {
                sum += arr[j];
                count ++;
                if(sum == k){
                    if(count > result){
                        result = count;
                    }
                    sum = 0;
                    count = 0;
                }
            }
            sum = 0;
            count = 0;
        }
        return result;
    }

    public static void main(String[] args){
        int[] arr= {-9,-3,3,-1,6,-5};

        Longest_Subarray_with_given_sumK obj = new Longest_Subarray_with_given_sumK();
        System.out.println("Result is : " + obj.logic(arr, 0));
    }
}
