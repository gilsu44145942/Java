package Set;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

// A클래스는 equals와 hashCode를 오버라이드 하지 않음
class A{
    int data;
    public A(int data){
        this.data =data;
    }
}

// B클래스는 equals만 오버라이드 함
class B{
    int data;
    public B(int data){
        this.data =data;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof B){
            this.data = ((B)obj).data;
            return true;
        }else {
            return false;
        }
    }
}

// C클래스는 equals와 hashCode를 오버라이드 함
class C {
    int data;
    public C(int data) {
        this.data = data;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof C) {
            this.data = ((C) obj).data;
            return true;
        } else {
            return false;
        }
    }
    @Override
    public int hashCode(){
        return Objects.hash(data);
    }
}class D {
    int data1;
    int data2;
    public D(int data1, int data2) {
        this.data1 = data1;
        this.data2 = data2;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof D) {
            this.data1 = ((D) obj).data1;
            this.data2 = ((D) obj).data2;
            return true;
        } else {
            return false;
        }

    }
    @Override
    public int hashCode(){
        // hash메서드는 문자열이나 숫자 무엇이든 매개변수로 넣으면 함께 계산
        // 동일한 데이터들을 매개변수로 전달하면 항상 동일한 결과를 리턴!!
        // 이러한 hash의 특성때문에 로그인시 패스워드의 인증에 사용됨
        return Objects.hash(data1,data2);
    }
}

public class HashSet_2 {
    public static void main(String[] args) {
        // #1.A클래스 오버라이드 안함
        Set<A> hset1 = new HashSet<>();
        A a1 = new A(3);
        A a2 = new A(3);
        System.out.println(a1==a2); //false
        System.out.println(a1.equals(a2)); //false
        System.out.println(a1.hashCode()); //793589513
        System.out.println(a2.hashCode()); //1313922862
        hset1.add(a1);
        hset1.add(a2);
        // a1, a2 객체의 equals는 false, hashCode는 다르므로 중복 아님
        System.out.println(hset1.size()); //2
        System.out.println();

        // #2.B클래스 equals만 오버라이드
        Set<B>hset2 = new HashSet<>();
        B b1 = new B(3);
        B b2 = new B(3);
        System.out.println(b1==b2); //false
        System.out.println(b1.equals(b2)); //true
        System.out.println(b1.hashCode()); //1922154895
        System.out.println(b2.hashCode()); //883049899
        hset2.add(b1);
        hset2.add(b2);
        // equals는 true였지만 hashCode 가 다르기 때문에 중복아님
        System.out.println(hset2.size()); //2
        System.out.println();

        // #3.C클래스 equals와 hashCode 오버라이드
        Set<C>hset3 = new HashSet<>();
        C c1 = new C(3);
        C c2 = new C(3);
        System.out.println(c1==c2); //false
        System.out.println(c1.equals(c2)); //true
        System.out.println(c1.hashCode()); // 34
        System.out.println(c2.hashCode()); // 34
        hset3.add(c1);
        hset3.add(c2);
        // hashCode 와 equals가 둘다 동일하다고 판단해야 중복객체로 판정됨
        System.out.println(hset3.size()); //1
        System.out.println();

        D d1 = new D(5,6);
        D d2 = new D(5,6);
        System.out.println(d1.hashCode()); //1122
        System.out.println(d2.hashCode()); //1122

    }
}
