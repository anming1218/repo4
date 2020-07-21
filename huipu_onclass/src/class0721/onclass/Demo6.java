package class0721.onclass;
import java.io.*;
import java.nio.charset.StandardCharsets;

/**
 *@program: huipu_onclass
 *@description: 王安明
 *@author: ming
 *@create: 2020-07-21 14:37
 */
public class Demo6 {
    public static void main(String[] args) throws IOException {

        File f = new File("g:/workspace/filetest/bbb.java");
        InputStream in = new FileInputStream(f);
        InputStreamReader isr = new InputStreamReader(in, StandardCharsets.UTF_8);

        int len;
        char[] b = new char[1024];
        while ((len = isr.read(b)) != -1) {
            System.out.print(new String(b, 0, len));
        }

        isr.close();
        in.close();


    }
}
