class A2{
    int a = 3;
    int b = 4;
    void abc(){
        System.out.println("A클래스 메서드");
    }
    class B2{
        int a = 5;
        int b = 6;
        void abc(){
            System.out.println("B클래스 메서드");
        }
        void bcd(){
            // 이너클래스 본인이 멤버를 참조 사용한다.
            System.out.println(a); // 5
            abc(); // B클래스 메서드
            // 아우터클래스의 멤버는 어떻게 접급하나?
            System.out.println(A2.this.a); // 3
            A2.this.abc(); // A클래스 메서드
        }
    }
}
public class InnerClass_2 {
    public static void main(String[] args) {
        A2 a = new A2();
        A2.B2 b = a.new B2();
        b.bcd();

    }
}
