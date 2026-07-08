public class Find_The_Number_That_Appears_Once {

    public int logic(int[] arr) {
        int size = arr.length;

        for (int i = 0; i < size; i++) {
            int count = 0;

            for (int j = 0; j < size; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                }
            }

            if (count == 1) {
                return arr[i];
            }
        }

        return -1;
    }

    public static void main(String[] args){
        int[] arr= {4,1,2,1,2};

        Find_The_Number_That_Appears_Once obj = new Find_The_Number_That_Appears_Once();
        System.out.println("Result is : " + obj.logic(arr));
    }

}
