public class Two_Sum {
    public boolean logic(int[] arr, int n, int target){
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if(j != i && arr[i]+arr[j]==target){
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args){
        int[] arr = {2,6,5,8,11};
        int n = arr.length;
        int target = 14;

        Two_Sum obj = new Two_Sum();
        if (obj.logic(arr,n,target)){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
    }
}
