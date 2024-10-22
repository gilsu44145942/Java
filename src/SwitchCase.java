import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {
        int a = 2;
        switch(a) {
            case 1:
                System.out.println("A");
                break; //"break"는 중괄호를 깬다는 의미.
            case 2:
                System.out.println("B");
                break;
            case 3:
                System.out.println("C");
                break;
            default:
                System.out.println("D");


        }
        Scanner scanner= new Scanner(System.in);
        System.out.println("요일을 입혁해주세요:");
        String day= scanner.nextLine();
        switch (day){
        case "월":
            System.out.println("오늘은 월요일입니다.");
            break;
        case "화":
            System.out.println("오늘은 화요일입니다.");
            break;
        case "수":
            System.out.println("오늘은 수요일입니다.");
            break;
            case "목":
            System.out.println("오늘은 목요일입니다.");
            break;
        case "금":
            System.out.println("오늘은 금요일입니다.");
            break;
            case "토":
                System.out.println("오늘은 휴일입니다.");
                break;
            case "일":
                System.out.println("오늘은 휴일입니다.");
                break;
            default:
                System.out.println("올바른 요일을 입력해주세요.");
                break;
        }
        scanner.close();// 스캐너 객체를 메모리에서 삭제시킴.


    }
}
