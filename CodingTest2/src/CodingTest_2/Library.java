package CodingTest_2;
import java.util.ArrayList;
import java.util.List;

public class Library {
    String name;
    List<Book> books = new ArrayList<>();

    public Library(String name) {
        this.name = name;
    }

    public void addBook(Book book) {
        books.add(book);
        System.out.println("책등록:" + book.title);
    }

    public void displayBooks() {
        System.out.println(books);



    }

    public void lendBook(String title) {
        for (Book book : books) {
            if (book instanceof PrintedBook) {
                ((PrintedBook) book).lend();
            } else if (book instanceof EBook) {
                ((EBook) book).access();
            }
        }
    }
    public void returnBook(String title){
        for ( Book book : books){
            if (book instanceof PrintedBook){
                ((PrintedBook) book).returnBook();
            }
        }

    }

}