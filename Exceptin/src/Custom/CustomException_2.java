package Custom;

/* 에외전가를 구현할 때 MyException 과 MyRTException 의 구현상 차이점 있음\
 1) MyRTException 의 경우
 에외처리를 하지 않고 call 메서드가 throw 하지 않아도 JVM 이 에외처리 해줌
  (JVM 의 예외처리는 catch 문과는 다름)

  ==> 자아 컴파일러가 RuntimeException 계열의 경우, 예외처리를 강제하지 않도록
  설계외어 있다고 함(설계철학의 문제)

  2) MyException 의 경우
  예외처리(catch)를 하지 않고 call 메서드가 throws 하지 않으면 컴파일 에러가 발생함
  반드시 !! 콜스택애의 모든 메서드들이 throws 해야함 (mian()도 throws 가능)
 */


class C {
    void setAge(int age) throws MyRTException {

        if (age >= 0) {
            System.out.println("정상동작");
        } else {
            throw new MyRTException("나이가 음수입니다.");
        }
    }
    void callSetAge(int age){
            setAge(age);

        }
    }

class D{
    void setAge(int age) throws MyException {

        if (age >= 0) {
            System.out.println("정상동작");
        } else {
            throw new MyException("나이가 음수입니다.");
        }
    }
    void callSetAge(int age)throws MyException{
        setAge(age);

    }
}

public class CustomException_2 {
    public static void main(String[] args) throws MyException{
//        C c = new C();
//        c.callSetAge(-1);
        D d = new D();
        d.callSetAge(-1);
    }
}
