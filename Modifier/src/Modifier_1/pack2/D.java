package Modifier_1.pack2;

import Modifier_1.pack1.A;
 // 클래스 D는 클래스 A를 상속 (=extends)
public class D extends A {
    public void print(){
        System.out.print(a + " ");
        System.out.print(b + " "); // protected 상속 받았으므로 접근가능
//        System.out.print(c + " "); // default 외부패키지이므로 접근불가 (read/write불가)
//        System.out.print(d + " "); // private 외부클래스이므로 접근불가 (read/write불가)
        System.out.println();


    }
}
