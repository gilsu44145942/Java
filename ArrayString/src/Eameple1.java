public class Eameple1 {
    public static void main(String[] args) {
        //램덤한 정수 10개를 가진 배열에서 특정 값을 찾는 매서드.
        // 그 위치의 인덱스값을 리턴하는 메서드.
        // 만약 못찾으면 -1 리턴
        int[] numbers = {37, 82, 14, 56, 91, 23, 48, 65, 8, 74};
        System.out.println(findnumber(numbers, 91)); //4
        System.out.println(findnumber(numbers, 65)); //7
        System.out.println(findnumber(numbers, 100)); //-1
//    }
//    public static int findnumber(int[]numbers,int target){
//        for(int i=0; i<numbers.length;i++){
//            if(numbers[i]==target) {
//                return i;// 찾았을 경우에는 인덱스를 리턴
//            }
//        }return -1; // 못찾았을때는 반목문이 종료된 다음 -1를 리턴.
//    }
    }
    public static int findnumber(int[]numbers,int target) {
        // for-each문 사용
        int index = 0;
        for (int data : numbers) {
            if (data == target) {
                return index;
            }
            index = index + 1;
        }
        return -1;
        }
    }




