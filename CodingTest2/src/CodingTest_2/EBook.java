package CodingTest_2;

public class EBook extends Book {
    double fileSize;
    int accessCount = 0;

    public EBook(String title, String author, double fileSize) {
        super(title, author);
        this.fileSize = fileSize;
    }
   public void access(){
        accessCount = accessCount+1;
        System.out.println(title+"조회횟수:" +accessCount);

    }

    @Override
    void displayDetails() {
        System.out.println("EBook - 제목:"+title+ "저자:"+author+ "파일 사이즈:"+fileSize +"MB "+ "조회 횟수:"+accessCount);
    }
}
