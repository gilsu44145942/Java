package Abstract;

public class Main {
    public static void main(String[] args) {
        // Calculator
        Addittion addittion = new Addittion();
        addittion.displayResult(2,4); // Result : 6.0
        Multiply multiply = new Multiply();
        multiply.displayResult(2,4); // Result : 8.0
        System.out.println();

        // Shape
        Shape circle = new Circle(5);
        System.out.println(circle.area()); // 78.53981633974483
        Shape rectangle = new  Rectangle(4,6);
        System.out.println(rectangle.area()); // 24.0
        System.out.println();

        // Payment
        Payment credit = new CreditCard(20000,"A001","1234-5678", "2030-12-31");
        if (credit.processPayment()){
            // 결재진행 결과여부에 따라 영수증 발행
            System.out.println(credit.getReceipt());
        }
        Payment mobile = new Mobile(50000,"A001","Kakaopay", true);
        if (mobile.processPayment()){
            System.out.println(mobile.getReceipt());
        }
        System.out.println();

        // Cash 지불한 돈이 많을 경우
        Payment cash = new Cash(10000,"A001",50000);
        if (cash.processPayment()) {
            System.out.println(cash.getReceipt());
            //현금으로 결제진행
            //현금 결제금액:10000.0원 받은 돈:50000.0원 거스름돈:40000.0원
        }
        // Cash 지불한 돈이 적을 경우
        System.out.println();
        Payment cash1 = new Cash(10000, "A001",1000);
        if (cash1.processPayment()) {
            System.out.println(cash1.getReceipt()); // 결제금액이 부족합니다.

        }
        // Cash 지불한 돈이 가격과 같을 경우
        System.out.println();
        Payment cash2 = new Cash(10000,"A001",10000);
        if (cash2.processPayment());
        System.out.println(cash2.getReceipt());
        //현금으로 결제진행
        //현금 결제금액:10000.0원

        System.out.println();
        Rectangle rectangle1 = new Square(4,5);
        System.out.println(rectangle1.area());

    }


}
