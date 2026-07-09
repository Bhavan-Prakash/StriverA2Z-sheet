public class Majoruty_Element_I {
    public int logic(int[] arr){
        int size = arr.length;

        int count = 0;
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if(arr[i] == arr[j]){
                    count++;
                }
            }
            if(count>size/2){
                return arr[i];
            }
            count = 0;
        }
        return -1;
    }

    public static void main(String[] args){
        int[] arr = {1,1,1,2,1,2};

        Majoruty_Element_I obj = new Majoruty_Element_I();
        System.out.println(obj.logic(arr));
    }
}
