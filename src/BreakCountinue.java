public class BreakCountinue {
    public static void main(String[] args) {
        // break 문
        for (int i = 0; i < 10; i++) {
            if (i == 5) {
                break;
            }
            System.out.println(i);
        }
        System.out.println();
        // 이중 For문에서 바깥 for문까지 한번에 탈출하려면...
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 5; j++) {
                if (j == 2) {
                    // 바깥 for문을 거짓으로 만들도록 i값을 크게 변경
                    i = 100; // 100은 의미없음. 매우 큰 수로 세팅 (가독성)
                    break;
                }
                System.out.println("i=" + i + ",j=" + j);
            }
            System.out.println();
        }
        //continue
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 5; j++) {
                if (j == 2) {
                    continue;
                }
                System.out.println("i=" + i + ",j=" + j);
            }
        }
    }
}


