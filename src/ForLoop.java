public class ForLoop {
    public static void main(String[] args) {
        // 일반형 (10회 반복)
        for (int i = 0; i < 10; i++) {
            //System.out.println(i);
            System.out.print(i + " ");//개행하지 않는 print 매서드 사용.
        }
        System.out.println("끝");
        // 감소형(10회 반복)
        for (int i = 10; i > 0; i--) {
            System.out.print(i + " ");
        }
        System.out.println("끝");
        //증감식의 변화 (2씩 증가하기)
        for (int i = 0; i < 10; i = i + 2) {
            System.out.print(i + " ");
        }
        System.out.println("끝");
        //iterator(반복자)가 여러개인경우
        for (int i = 0, j = 0; i < 10; i++, j++) {
            System.out.print(i + "," + j + " ");
        }
        System.out.println("끝");

        //무한루프 : 조건식이 없거나 조건식이 거짓이 될 수 없는 경우,
        //루프는 무한히 계속된다!
        int count = 0;
        for (int i = 0;; i++) { //조건식이 없음
            System.out.println(i);
            count = i;
            if (count > 1000000) {
                break;
            }
        }
//        for ( ; ; ){
//            //무한루프
//        }
//        for (int i=0; i>=0; i++){ //조건식이 거짓이 될 수 없음
//            System.out.print(i);
//       }
        System.out.println("끝");
    }
}



