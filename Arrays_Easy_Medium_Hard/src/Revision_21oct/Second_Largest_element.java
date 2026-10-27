//package Revision_21oct;
//
//public class Second_Largest_element {
//    public static int solution(int[] arr){
//        int largest = arr[0];
//        int slargest = -1;
//
//        for (int i = 0; i < arr.length; i++) {
//            if(arr[i] < largest && arr[i] > slargest){
//                slargest = arr[i];
//
//            } else if (arr[i] > largest) {
//                int temp = largest;
//                largest = arr[i];
//                slargest = temp;
//            }
//        }
//
//        if(slargest == -1) return -1;
//
//        return slargest;
//    }
//
//    public static void main(String[] args){
//        int[] arr = {8,9,7,10,5};
//
//        System.out.println("solution is : " + solution(arr));
//    }
//}
