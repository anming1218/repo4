package class0721.practice.io;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Scanner;

/**
 *@program: huipu_onclass
 *@description: 在控制台输入学号、姓名、年龄、地址，并将此内容写入user.txt中
 * 文件格式：
 * 学号：101
 * 姓名：张三
 * 年龄：25岁
 * 地址：天津市
 *@author: ming
 *@create: 2020-07-21 20:39
 */
public class Practice1 {
    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);
        System.out.println("请依次输入学号，姓名，年龄，地址（空格隔开）：");
        String line = sc.nextLine();
        String[] lines = line.split(" ");


        OutputStream ops = new FileOutputStream("user.txt");
        ops.write("学号：".getBytes());
        ops.write(lines[0].getBytes());
        ops.write("\n".getBytes());
        ops.write("姓名：".getBytes());
        ops.write(lines[1].getBytes());
        ops.write("\n".getBytes());
        ops.write("年龄：".getBytes());
        ops.write(lines[2].getBytes());
        ops.write("\n".getBytes());
        ops.write("地址：".getBytes());
        ops.write(lines[3].getBytes());
        ops.close();

    }
}
