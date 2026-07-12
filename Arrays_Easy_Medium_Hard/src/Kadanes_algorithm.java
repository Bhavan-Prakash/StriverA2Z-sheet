public class Kadanes_algorithm {

    public int logic(int[] arr){
        int size = arr.length;
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < size; i++) {
            for (int j = i; j <size ; j++) {
                int sum = 0;
                for (int k = i; k < j; k++) {
                    sum += arr[k];
                }
                max = Math.max(sum,max);
            }
        }

        return max;
    }

    public static void main(String[] args){
        int[] arr = {2, 3, 5, -2, 7, -4};
        Kadanes_algorithm obj = new Kadanes_algorithm();

        System.out.println("result is : " + obj.logic(arr));
    }

}
