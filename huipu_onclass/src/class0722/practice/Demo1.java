package class0722.practice;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;

/**
 *@program: huipu_onclass
 *@description:
 *@author: ming
 *@create: 2020-07-22 14:47
 */
public class Demo1 {

    public static void main(String[] args) throws IOException {

/*        // 定义文件路径
        String FileName = "aa.txt";
        OutputStream op = new FileOutputStream(FileName);
        // 创建流对象,默认UTF8编码
        OutputStreamWriter osw = new OutputStreamWriter(op);
        // 写出数据
        osw.write("你好");
        osw.close();*/

        OutputStream op = new FileOutputStream("aa.txt");
        OutputStreamWriter ops = new OutputStreamWriter(op);
        ops.write("?????");
        ops.close();



    }

}
