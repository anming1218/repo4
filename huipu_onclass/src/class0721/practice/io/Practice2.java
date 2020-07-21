package class0721.practice.io;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

/**
 *@program: huipu_onclass
 *@description: 2、	在count.txt中记录程序的运行次数
 *@author: ming
 *@create: 2020-07-21 20:49
 */
public class Practice2 {


    public static void main(String[] args) throws IOException {
        /*
        定义功能记录程序运行次数,满足试用次数后,提示试用次数已到,请注册.

        思路:
        1.需要计数器,
        2.让这个计数器持久化,存储到文件中.Properties
         */

        if (isCountOfEnd()) {
            System.out.println("试用次数已到,请注册");
            return;
        }
        runCode();
    }

    private static boolean isCountOfEnd() throws IOException {
        //1.配置文件
        File configFile = new File("count.txt");
        if (!configFile.exists()) {   //r如果配置文件不存在,就创建
            configFile.createNewFile();
        }
        //2.创建属性集
        Properties properties = new Properties();

        //3.定义读取流和配置文件关联
        FileInputStream fileInputStream = new FileInputStream(configFile);

        //4.将流关联的数据读取到属性集中
        properties.load(fileInputStream);

        //5.通过属性集的指定键count,获取具体次数
        String value = properties.getProperty("count");

        //6.对value进行判断,如果存在就对其自增
        int count = 0;
        if (value != null) {
            count = Integer.parseInt(value);
            if (count >= 5) {
                return true;
            }
        }
        count++;

        //7.将自增后的值和指定的键重新存储到属性集中,键相同,值覆盖
        properties.setProperty("count", Integer.toString(count));

        //8.将属性集存储到配置文件中.对配置文件中的信息进行更新.
        FileOutputStream fileOutputStream = new FileOutputStream(configFile);
        properties.store(fileOutputStream, "app run count");

        //9.关闭资源
        fileOutputStream.close();
        fileInputStream.close();

        return false;
    }

    private static void runCode() {
        System.out.println("--------------程序运行-------------");
    }


}
