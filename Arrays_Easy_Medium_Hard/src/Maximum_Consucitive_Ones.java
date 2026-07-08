public class Maximum_Consucitive_Ones {

    public int logic(int[] arr){
        int size = arr.length;

        int result = 0;
        int initial_count = 0;

        for (int i = 0; i < size; i++) {
            if(arr[i] != 0){
                initial_count ++;
            }else{
                if(initial_count>result){
                    result = initial_count;
                }
                initial_count = 0;
            }
        }
        return result;
    }

    public static void main(String[] args){
        int[] arr= {0,1,0,1,1,0};

        Maximum_Consucitive_Ones obj = new Maximum_Consucitive_Ones();
        System.out.println("Result is : " + obj.logic(arr));
    }

}
