public class Stock_Buy_And_Sell {

    public int logic(int[] arr){
        int size = arr.length;

        int buy = 0;
        int sell = 0;
        int buy_index = 0;

        for (int i = 0; i < size; i++) {
            buy = arr[i];
            for (int j = 0; j < size; j++) {
                if (i != j && buy > arr[j]) {
                    buy_index = j;
                    buy = arr[j];
                }
                if(j>buy_index && sell<arr[j]){
                    sell = arr[j];
                }
            }

        }
        return sell-buy;
    }

    public static void main(String[] args){
        int[] arr = {7,1,5,3,6,4};

        Stock_Buy_And_Sell obj = new Stock_Buy_And_Sell();
        System.out.println("soln is : " + obj.logic(arr));
    }

}
