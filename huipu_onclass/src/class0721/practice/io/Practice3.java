package class0721.practice.io;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

/**
 *@program: huipu_onclass
 *@description: 3、	在max.txt中存储程序运行以来的最大值，每运行一次程序，随机产生一个0~100之间的随机数，如果大于max.txt中的内容就替换
 *@author: ming
 *@create: 2020-07-21 21:01
 */
public class Practice3 {

    public static void main(String[] args) throws IOException {
        /*
        定义功能记录程序运行次数,满足试用次数后,提示试用次数已到,请注册.

        思路:
        1.需要计数器,
        2.让这个计数器持久化,存储到文件中.Properties
         */
        runCode();
        if (isBig()) {
            System.out.println("随机数较大，已更换");
            return;
        } else {
            System.out.println("随机数较小，未更换");
        }

    }

    private static boolean isBig() throws IOException {
        //1.配置文件
        File configFile = new File("randomNumber.txt");
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
        String value = properties.getProperty("BigerNumber");

        //6.对number进行判断，如果大就更新
        int number = (int) (Math.random() * 100);

        if (value != null) {
            if (!(number > Integer.parseInt(value))) {
                return false;
            }
        }

        //7.将值和指定的键重新存储到属性集中,键相同,值覆盖
        properties.setProperty("BigerNumber", Integer.toString(number));

        //8.将属性集存储到配置文件中.对配置文件中的信息进行更新.
        FileOutputStream fileOutputStream = new FileOutputStream(configFile);
        properties.store(fileOutputStream, "app find bignumber");

        //9.关闭资源
        fileOutputStream.close();
        fileInputStream.close();

        return true;
    }

    private static void runCode() {
        System.out.println("--------------程序运行-------------");
    }


}
