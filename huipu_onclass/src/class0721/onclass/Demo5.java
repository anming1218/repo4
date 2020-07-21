package class0721.onclass;
import java.io.*;
import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.CharsetEncoder;

/**
 *@program: huipu_onclass
 *@description:
 *@author: ming
 *@create: 2020-07-21 14:12
 */
public class Demo5 {
    public static void main(String[] args) throws IOException {

        File f = new File("g:/workspace/filetest/bbb.java");

        Reader fr = new FileReader(f);

        int len;
        char[] b = new char[1024];
        while ((len=fr.read(b))!=-1){
            System.out.print(new String(b, 0, len));
        }

        fr.close();

    }
}
