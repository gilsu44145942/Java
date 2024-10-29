package P1029;

import java.util.Date;

public class MyClass {
    public static void main(String[] args) {
        Student steve = new Student("Steve",25);
        Student tom = new Student();
        Student sam = new Student("Sam",29,"대전","남",100,90,80);
        System.out.println(steve.name); //Steve
        System.out.println(steve.address); //null
        System.out.println(tom.name); //null
        System.out.println(sam.name); //Sam
        System.out.println(sam.scoreHistory); //90.0

        //매서드의 사용
        //외부 클래스가 가지고 있는 매서드이므로 해당 클래스의 인스턴스를 명시해야함!
        System.out.println(steve.sumScore()); //0.0
        System.out.println(tom.sumScore()); //0.0
        System.out.println(sam.sumScore()); //270.0


        User kim = new User("Kim","kim@gmail.com","1234");
        System.out.println(kim.password); //1234
        kim.setPassword("abcd");
        System.out.println(kim.password); //abcd

        Product book1 =new Product("a001","여행",10000,100);
        System.out.println(book1.price+" "+book1.stock); //10000.0 100
        book1.setPrice(11000);
        book1.setStock(90);
        System.out.println(book1.price+" "+book1.stock); //11000.0 90

        // 주문 생성
        Order order1 =new Order("1029-001",kim,book1,new Date(),3);
        System.out.println(order1.user.username); //kim
        System.out.println(order1.product.name); //여행
        System.out.println(order1.orderDate); //


    }
}
