public class MainArg {
    public static void main(String[] args) {
        // 메인 매서드의 매개변수를 활용하는 방법
        //(인텔리제이) 오른쪽 위에 ...버튼 클릭
        //Run whit parameters 클릭
        // program arguments 창에 배개변수를 차례로 입력
        // 예시) hello 100 true 3.14
        // 입력시 ' '(스페이스)로 나눌 수 있음
        // Run 버튼 클릭
        System.out.println(args.length); //4
        System.out.println(args[0]); //hello
        System.out.println(args[1]); //100
        System.out.println(args[2]); //ture
        System.out.println(args[3]); //3.14
    }
}
