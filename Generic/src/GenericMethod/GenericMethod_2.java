package GenericMethod;


class AAA{
    public <T>void method(T t){
        //System.out.println(t.length()); // 오류 (String의 내부 메서드)

        // "T는 Object클래스의 자식이다" 라는 명제는 참
        // 그러므로 T에 Object의 내부메서드는 사용할 수 없음
        // T는 Object의 자식클래스이기 때문
        System.out.println(t.toString());
        System.out.println(t.equals("AAA"));
        System.out.println(t.hashCode());
    }

}
public class GenericMethod_2 {
    public static void main(String[] args) {

    }
}
