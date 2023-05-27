package day025;
import java.lang.*;
import java.util.Objects;

class Book implements Cloneable {
    private String title;
    private String author;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public String toString() { // toString() 재정의
        return "제목 : " + title + ", 저자 : " + author;
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Book book = (Book) obj;

        if (author != book.author) {
            return false;
        }
        return Objects.equals(author, book.author); // author로 비교하는 것으로 재정의
    }

    @Override
    public Book clone() throws CloneNotSupportedException {
        return (Book) super.clone();
    }
}
public class ObjectClassTest {
    public static void main(String[] args) {
        Book book = new Book("루피의 하루", "잔망루피");
        try {
            Book book1 = book.clone();
            System.out.println(book); // 제목 : 루피의 하루, 저자 : 잔망루피
            System.out.println(book1); // 제목 : 루피의 하루, 저자 : 잔망루피
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}
