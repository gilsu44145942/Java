package Super1;

class AA{
    AA(){ // 기본 생성자
        System.out.println("A생성자");
    }
}
class BB extends AA{
    BB(){
        // super()를 명시적으로 호출하지 않아도 컴파일러가 자동으로 호출함
        // 부모의 기본생성자는 자동으로 호출되기 때문에 항상 자식클래스의 영역에는 부모클래스의 영역이 생성됨
        super(); // 부모의 기본생성자
        System.out.println("B생성자");
    }
}
class CC{
    // 기본생성자가 없음

    CC(int a){ //매개변수가 int a 인 생성자
        System.out.println("C생성자");
    }
}
class DD extends CC{
    // *****중요*****
    // 이 경우, DD는 반드시 생성자를 선언해줘야 함.
    // 자동으로 생성되는 기본 생성자는 부모의 기본생성자를 필요로 하기 때문임

    DD(){
        super(3);
        // super(); // 부모에게 기본생성자가 없으므로 에러 발생
    }
}
public class Super_2 {
    public static void main(String[] args) {
        BB value1 = new BB();



    }
}
