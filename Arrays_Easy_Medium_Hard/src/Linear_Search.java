public class Linear_Search {
    public int logic(int[] arr, int num){
        int size = arr.length;
        for (int i = 0; i < size; i++) {
            if(arr[i] == num){
                return i;
            }
        }

        return -1;
    }

    public static void main(String[] args){
        int[] arr = {1, 2, 3, 4, 5};
        int num = 3;
        Linear_Search obj = new Linear_Search();
        System.out.println(num + " is present at : " + obj.logic(arr,num));

    }
}
