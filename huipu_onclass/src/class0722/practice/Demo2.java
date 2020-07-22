package class0722.practice;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 *@program: huipu_onclass
 *@description:
 *@author: ming
 *@create: 2020-07-22 15:01
 */
public class Demo2 {

    public static void main(String[] args) throws IOException {

        FileOutputStream ops = new FileOutputStream("aa2.txt");
        ops.write("1".getBytes());
        ops.close();
    }

}
