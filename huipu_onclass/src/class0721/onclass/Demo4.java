package class0721.onclass;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 *@program: huipu_onclass
 *@description:
 *@author: ming
 *@create: 2020-07-21 11:21
 */
public class Demo4 {
    public static void main(String[] args) throws IOException {

        File f = new File("g:/workspace/filetest/bbb.java");

        InputStream is = new FileInputStream(f);
        /*int c1 = is.read();
        System.out.println((char) c1);
        */

        /*while (is.read() != -1) {
            int cc = is.read();
            System.out.print((char) cc);
        }*/

        int len;
        byte[] b = new byte[1024];
        while ((len = is.read(b)) != -1) {
            System.out.print(new String(b, 0, len));
        }

        is.close();

    }
}
