package class0721.onclass;
import java.io.File;
import java.io.FilenameFilter;

/**
 *@program: huipu_onclass
 *@description:
 *@author: ming
 *@create: 2020-07-21 10:12
 */
public class Demo3 {
    public static void main(String[] args) {
        File f = new File("G:/workspace/filetest");

        //获取当前目录下的文件以及文件夹的名称。
        String[] names = f.list();
        for (String name : names) {
            System.out.println(name);
        }

        System.out.println("----------------------------");

        //获取当前目录下的文件以及文件夹对象，只要拿到了文件对象，那么就可以获取更多信息
        File[] files = f.listFiles();
        for (File file : files) {
            System.out.println(file);
        }

        System.out.println("----------------------------");

        //使用过滤器获取特定的文件
        String[] list = f.list(new FilenameFilter() {
            @Override
            public boolean accept(File dir, String name) {
                return name.endsWith(".txt");
            }
        });

        if (list != null) {
            for (String s : list) {
                System.out.println(s);
            }
        }

    }
}
