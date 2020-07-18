package class0716.practice.practice2;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/**
 *@program: huipu_onclass
 *@description: 定义一个ArrayList集合，存储6个String类型，定义方法，消除其中的重复值
 *@author: ming
 *@create: 2020-07-16 16:36
 */
public class PracticeDemo4 {
    public static void main(String[] args) {

        List<String> list  =new ArrayList<String>();
        list.add("王明");
        list.add("李娟");
        list.add("程宇翔");
        list.add("李翔宇");
        list.add("王明");
        list.add("程宇翔");

        List<String>  newList = removeElement(list);
        System.out.println("原集合为：");
        System.out.println(Arrays.toString(list.toArray()));
        System.out.println("消除重复元素后集合为：");
        System.out.println(Arrays.toString(newList.toArray()));


    }

    private static List<String> removeElement(List<String> list) {

        List<String> newList = new ArrayList<String>();
        for (String next : list) {
            if (!newList.contains(next)) {
                newList.add(next);
            }
        }

        return newList;
    }


}
