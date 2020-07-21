package class0721.practice.io;
import java.io.*;
import java.util.HashMap;

/**
 *@program: huipu_onclass
 *@description: 4、	文件中存储5个学生信息
 * 文件格式：
 * 1，	张三，22，天津市
 * 2，	张三，22，天津市
 * 3，	张三，22，天津市
 * 4，	张三，22，天津市
 * 5，	张三，22，天津市
 * 将内容读取出来，并存入List集合
 *@author: ming
 *@create: 2020-07-21 21:15
 */
public class Practice4 {
    public static void main(String[] args) throws IOException {
        // 创建map集合,保存文本数据,键为序号,值为文字
        HashMap<String, String> lineMap = new HashMap<>();

        // 创建流对象
        BufferedReader br = new BufferedReader(new FileReader("in.txt"));

        // 读取数据
        String line = null;
        while ((line = br.readLine()) != null) {
            // 解析文本
            String[] split = line.split("\\.");
            // 保存到集合
            lineMap.put(split[0], split[1]);
        }
        // 释放资源
        br.close();

        for (int i = 1; i <= lineMap.size(); i++) {
            String key = String.valueOf(i);
            // 获取map中文本
            String value = lineMap.get(key);
            System.out.println(key + "." + value);
        }
    }
}
