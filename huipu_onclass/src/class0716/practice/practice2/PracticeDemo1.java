package class0716.practice.practice2;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 *@program: huipu_onclass
 *@description: 定义一个ArrayList集合，里面存储5个姓名，录入一个新的姓名，如果存在，则给予提示，不存在，则存入
 *@author: ming
 *@create: 2020-07-16 16:24
 */
public class PracticeDemo1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        List<String> list  =new ArrayList<String>();
        list.add("王明");
        list.add("李娟");
        list.add("程宇翔");
        list.add("李翔宇");
        list.add("贺复来");

        System.out.println("请输入一个新的姓名：");
        String newName = sc.nextLine();

        if (list.contains(newName)){
            System.out.println("集合中已经存在此姓名！");
        }else {
            list.add(newName);
            System.out.println(Arrays.toString(list.toArray()));
        }


    }
}
