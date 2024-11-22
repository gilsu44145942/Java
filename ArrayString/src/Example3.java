public class Example3 {
    public static void main(String[] args) {
        // 중복된 숫자의 갯수를 리턴하는 매서드
        int[] numbers = {1, 3, 7, 2, 4, 3, 9, 8, 3, 4};
        System.out.println(CountNumber(numbers, 3)); //3
        System.out.println(CountNumber(numbers, 4)); //2
        System.out.println(CountNumber(numbers, 10)); //-1
    }

    public static int CountNumber(int[] numbers, int target) {
        int count = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == target) {
                count = count + 1;
            }
        }
            if (count > 0) {
                return count;
            } else {
                return -1;
            }


        }
    }



