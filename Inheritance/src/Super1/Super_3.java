package Super1;

class A1 {
    A1() {
        this(3); //this() 또는 super()는 반드시 첫 번째 줄에 있어야함!!
        System.out.println("A1생성자 1");
        // this(3); //에러!
    }
    A1(int a) {
        System.out.println("A1생성자 2");
    }
}
class B1 extends A1 {
    B1() {
        // super();가 적혀있지 않아도 자식클래스는 부모클래스의 기본 생성자가 들어가 있음
        this(3);
        System.out.println("B1생성자 1");
    }
    B1(int a) {
        // super(); 또한 적혀 있지 않지만 자식클래스의 부모클래스 기본생성자가 들어가 있음
        System.out.println("B1생성자 2");
        
    }
}
public class Super_3 {
    public static void main(String[] args) {
        A1 value1 = new A1();
        System.out.println();
        A1 value2 = new A1(3);
        System.out.println();
        B1 value3 = new B1();
        System.out.println();
        B1 value4 = new B1(3);
    }
}