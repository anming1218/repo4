package class0713.practice.practice1_list;

import java.util.List;

/**
 *@program: huipu_onclass
 *@description: 图书管理
 *@author: ming
 *@create: 2020-07-13 21:23
 */
public class BookManager {


    public BookManager() {
    }

    /**
     * 显示所有图书信息
     * @param bookList
     */
    public void findAll(List<Book> bookList) {
        for (Book book : bookList) {
            System.out.println(book);
        }
    }

    /**
     * 根据书名查找图书
     * @param bookList
     * @param title
     */
    public void findBookBytitle(List<Book> bookList, String title) {
        for (Book book : bookList) {
            if (book.getTitle().equals(title)) {
                System.out.println(book);
            }
        }
    }

    /**
     * 根据价格区间查找图书
     * @param bookList
     * @param start
     * @param end
     */
    public void findBookByprice(List<Book> bookList, double start, double end) {
        for (Book book : bookList) {
            if (book.getPrice() >= start && book.getPrice() < end) {
                System.out.println(book);
            }
        }
    }

    /**
     * 根据作者查找图书
     * @param bookList
     * @param author
     */
    public void findBookByauthor(List<Book> bookList, String author) {
        for (Book book : bookList) {
            if (book.getAuthor().equals(author)) {
                System.out.println(book);
            }
        }
    }

    /**
     * 根据出版社查找图书
     * @param bookList
     * @param publishinghouse
     */
    public void findBookBypublishingHouse(List<Book> bookList, String publishinghouse) {
        for (Book book : bookList) {
            if (book.getAuthor().equals(publishinghouse)) {
                System.out.println(book);
            }
        }
    }

    /**
     * 输入作者，统计该作者所写的书的总数
     * @param bookList
     * @param author
     */
    public void statisticsAuthor(List<Book> bookList, String author) {
        int frequency = 0;
        for (Book book : bookList) {
            if (book.getAuthor().equals(author)) {
                frequency++;
            }
        }

        System.out.println(author + "所写的书的总数为：" + frequency);
    }

    /**
     * 查找价格最贵的书的信息
     * @param bookList
     */
    public void FindMostPrice(List<Book> bookList) {
        Book book = new Book();
        book = bookList.get(0);
        for (Book book1 : bookList) {
            if (book1.getPrice() > book.getPrice()) {
                book = book1;
            }
        }

        System.out.println(book);
    }

    /**
     * 查找低于平均价格的图书
     * @param bookList
     */
    public void lowAvergePrice(List<Book> bookList) {
        double sum = 0;
        for (Book book : bookList) {
            sum += book.getPrice();
        }

        double avg = sum / bookList.size();

        for (Book book : bookList) {
            if (book.getPrice() < avg) {
                System.out.println(book);
            }
        }
    }
}
