package class0721.onclass;
import java.io.File;
import java.util.Date;

/**
 *@program: huipu_onclass
 *@description:
 *@author: ming
 *@create: 2020-07-21 10:04
 */
public class Demo2 {
    public static void main(String[] args) {

        File f = new File("g:/workspace/filetest/bbb.java");
        System.out.println("文件绝对路径:"+f.getAbsolutePath());
        System.out.println("文件构造路径:"+f.getPath());
        System.out.println("文件名称:"+f.getName());
        System.out.println("文件长度:"+f.length()+"字节");
        System.out.println("文件最后一次修改时间"+new Date(f.lastModified()));

        File f2 = new File("g:/workspace");
        System.out.println("目录绝对路径:"+f2.getAbsolutePath());
        System.out.println("目录构造路径:"+f2.getPath());
        System.out.println("目录名称:"+f2.getName());
        System.out.println("目录长度:"+f2.length());
    }
}
