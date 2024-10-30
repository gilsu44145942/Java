package P1030;

public class FlexibleSize {
    public static void main(String[] args) {
        // #1. method1(int...value)
        method1(1,2);
        method1(1,2,3);
        method1();

        // #2. method2(String...values)
        method2("안녕","방가");
        method2("땡큐","배려","감사");
        method2();
    }
    public static void method1(int ...values){
        for (int i = 0; i<values.length;i++){
            System.out.print(values[i]+ " ");
        }
        System.out.println();
    }
    public static void method2(String...vlaues){
        for (int i = 0; i<vlaues.length;i++){
            System.out.print(vlaues[i]+" ");
        }
        System.out.println();
    }

}
