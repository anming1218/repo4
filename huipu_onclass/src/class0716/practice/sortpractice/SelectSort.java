package class0716.practice.sortpractice;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *@program: huipu_onclass
 *@description: 3、	定义一个ArrayList集合，里面存储6个整数，使用选择排序，将该集合降序
 *@author: ming
 *@create: 2020-07-16 16:35
 */
public class SelectSort {

    public static void main(String[] args) {

        List<Integer> list = new ArrayList<Integer>();

        for (int i = 0; i < 10; i++) {
            list.add((int) (Math.random() * 100));
        }
        System.out.println("排序前的集合为：");
        System.out.println(Arrays.toString(list.toArray()));

        //选择排序
        for (int i = 0; i < list.size() - 1; i++) {

            for (int j = i + 1; j < list.size(); j++) {
                if (list.get(i) > list.get(j)) {
                    int index = list.get(i);
                    list.set(i, list.get(j));
                    list.set(j, index);
                }
            }

        }

        System.out.println("排序后的集合为：");
        System.out.println(Arrays.toString(list.toArray()));
    }
}
