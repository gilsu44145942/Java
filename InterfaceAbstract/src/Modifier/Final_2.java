package Modifier;

class A{
    void abc(){}
    final void bcd(){} // 오버라이드 불가
}
class B1 extends A{
    @Override
    void abc(){
        super.abc();
    }
    //@Override
//    void bcd(){} // 오버라이드 불가
}

final class C{}
//class D extends C{} //final 클래스는 상속불가

// final 메서드와 final 클래스 예제
public class Final_2 {
}
