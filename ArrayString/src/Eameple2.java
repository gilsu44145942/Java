import java.util.Arrays;

public class Eameple2 {
    public static void main(String[] args) {
        // 주어진 베열의 평균값을 계산하는 매서드
        int[] numbers = {10,20,30,40,50};
        System.out.println(calculateAverage(numbers)); //30
    }
    public static double calculateAverage(int[]numbers) {
        int sum = 0;
        for (int i = 0; i < numbers.length; i++){
            sum = sum +numbers[i]; // 배열의 데이터를 더함(arr[i])
        }
       double average = (double) sum / numbers.length;
        return average;
    }
}
