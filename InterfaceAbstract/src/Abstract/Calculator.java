package Abstract;

abstract public class Calculator {
    abstract double calculator(double a, double b);
    void displayResult(double a, double b){
        System.out.println("Result : " + calculator(a,b));
    }
}
class Addittion extends Calculator{
    @Override
    double calculator(double a, double b) {
        return a + b;
    }
}
class Multiply extends Calculator{
    @Override
    double calculator(double a, double b) {
        return a * b;
    }
}
