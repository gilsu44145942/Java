import java.util.Arrays;

public class BubbleSortExample {
    static void bubbleSort(int[] arr) {
        int n = arr.length;
        int temp = 0;
        for(int i=0; i < n; i++){
            for(int j=0; j < (n-i-1); j++){
                if(arr[j] > arr[j+1]){
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }

//    static void bubbleSort(int[] arr) {
//        int n = arr.length;
//        int temp = 0;
//        for(int i=n-1; i > 0; i--){
//            for(int j=n-1; j > (n-i-1); j--){
//                if(arr[j] < arr[j-1]){
//                    temp = arr[j];
//                    arr[j] = arr[j-1];
//                    arr[j-1] = temp;
//                }
//            }
//            System.out.println(Arrays.toString(arr));
//        }
//    }

    public static void main(String[] args) {
        int[] arr ={3,60,35,2,45,320,5};
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}