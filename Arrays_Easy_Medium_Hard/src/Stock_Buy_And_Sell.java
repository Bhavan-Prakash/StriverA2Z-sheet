public class Stock_Buy_And_Sell {

    public int logic(int[] arr){
        int size = arr.length;
        int sell = 0;
        int buy = arr[0];
        int count = 0;

        for (int i = 0; i<size; i++){
            for (int j = 0; j < size; j++) {
                if(j!=i && buy>arr[j]){
                    buy = arr[j];
                }
            }
        }


        return -1;
    }

}
