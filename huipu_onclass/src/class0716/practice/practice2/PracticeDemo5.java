package class0716.practice.practice2;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 *@program: huipu_onclass
 *@description: 将一个List集合逆序
 *@author: ming
 *@create: 2020-07-16 16:51
 */
public class PracticeDemo5 {

    public static void main(String[] args) {

        List<String> list = new ArrayList<String>();
        list.add("王明");
        list.add("李娟");
        list.add("程宇翔");
        list.add("李翔宇");
        list.add("贺复来");

        System.out.println("原集合为：");
        System.out.println(Arrays.toString(list.toArray()));
        System.out.println("逆序后集合为：");
        Collections.reverse(list);
        System.out.println(list);

    }


}
