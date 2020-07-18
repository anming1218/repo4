package class0713.practice.practice1_list;


import java.util.ArrayList;
import java.util.List;

/**
 *@program: huipu_onclass
 *@description:
 *@author: ming
 *@create: 2020-07-13 21:46
 */
public class Test {
    public static void main(String[] args) {
        Book[] books = {
                new Book(1, "红楼梦", 35.0, "曹雪芹", "译林出版社"),
                new Book(2, "三国演义", 35.8, "罗贯中", "人民出版社"),
                new Book(3, "西游记", 33.75, "吴承恩", "凤凰出版社"),
                new Book(4, "水浒传", 35.5, "施耐庵", "译林出版社"),
                new Book(5, "Java高级程序设计", 40.9, "cui", "凤凰出版社"),
                new Book(6, "数据库原理", 38.5, "chen", "人民出版社"),
                new Book(7, "数据挖掘", 35, "liang", "译林出版社"),
                new Book(8, "Web应用", 35, "cui", "译林出版社"),
                new Book(9, "数据结构", 37.7, "liang", "凤凰出版社"),
                new Book(10, "机组", 35.5, "huang", "凤凰出版社"),

        };

        List<Book> bookList = new ArrayList<>();

        for (int i = 0; i < books.length; i++) {
            bookList.add(books[i]);
        }

        BookManager bookManager = new BookManager();
        //1、	显示所有图书信息
        bookManager.findAll(bookList);
        System.out.println("--------------------------");

        //2、	根据书名查找图书
        bookManager.findBookBytitle(bookList, "水浒传");
        System.out.println("--------------------------");

        //3、	根据价格区间查找图书
        bookManager.findBookByprice(bookList, 37d, 38d);
        System.out.println("--------------------------");

        //4、	根据作者查找图书
        bookManager.findBookByauthor(bookList, "chen");
        System.out.println("--------------------------");

        //5、	根据出版社查找图书
        bookManager.findBookBypublishingHouse(bookList, "凤凰出版社");
        System.out.println("--------------------------");

        //6、	输入作者，统计该作者所写的书的总数
        bookManager.statisticsAuthor(bookList, "chen");
        System.out.println("--------------------------");

        //7、	查找价格最贵的书的信息
        bookManager.FindMostPrice(bookList);
        System.out.println("--------------------------");

        //8、	查找低于平均价格的图书
        bookManager.lowAvergePrice(bookList);
        System.out.println("--------------------------");


    }
}
