package class0713.practice.practice1_list;
import java.io.Serializable;

/**
 *@program: huipu_onclass
 *@description: 图书的实体类
 *@author: ming
 *@create: 2020-07-13 21:20
 */
public class Book implements Serializable {

    private int bookId;
    private String title;
    private double price;
    private String author;
    private String publishingHouse;

    public Book(int bookId, String title, double price, String author, String publishingHouse) {
        this.bookId = bookId;
        this.title = title;
        this.price = price;
        this.author = author;
        this.publishingHouse = publishingHouse;
    }

    public Book() {
    }

    public int getBookId() {
        return bookId;
    }

    public void setBookId(int bookId) {
        this.bookId = bookId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPublishingHouse() {
        return publishingHouse;
    }

    public void setPublishingHouse(String publishingHouse) {
        this.publishingHouse = publishingHouse;
    }

    @Override
    public String toString() {
        return "Book{" +
                "bookId='" + bookId + '\'' +
                ", title='" + title + '\'' +
                ", price=" + price +
                ", author='" + author + '\'' +
                ", publishingHouse='" + publishingHouse + '\'' +
                '}';
    }
}
