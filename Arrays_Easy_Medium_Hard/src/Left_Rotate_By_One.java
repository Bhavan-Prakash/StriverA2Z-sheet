public class Left_Rotate_By_One {

    public int[] arr(int[] arr){
        int size = arr.length;

        int first = arr[0];
        for (int i = 1; i < size; i++) {
                arr[i-1] = arr[i];
        }
        arr[size-1] = first;
        return arr;
    }

    public static void main(String[] args){
        int[] arr = {7,5,4,3,6};

        Left_Rotate_By_One obj = new Left_Rotate_By_One();


        int[] result =  obj.arr(arr);

        System.out.println("the answer is : " );
        for (int num : result){
            System.out.print(num + " ");
        }
    }

}
