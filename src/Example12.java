public class Example12 {
    public static void main(String[] args) {
        System.out.println(findNumber(1, 10, 5));//"5"
        System.out.println(findNumber(-10, 10, 0));//"0"
        System.out.println(findNumber(20, 50, 55));//"없음"
    }

    public static String findNumber(int a, int b, int c) {
        boolean found = false;
        for (int i=a; i<=b; i++){
            if (i == c) {
                found=true;
                break;
            }
        }
        if(found){
            return c+"";
        }else {
            return "없음";
        }

//        for(int i = a; i <= b; ++i) {
//            if (i == c) {
//                return "" + c;
//            }
//        }
//
//        return "없음";
    }
}


