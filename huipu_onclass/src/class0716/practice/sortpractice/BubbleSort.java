package class0716.practice.sortpractice;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *@program: huipu_onclass
 *@description: 一个ArrayList集合，里面存储6个整数，使用冒泡排序，将该集合升序
 *@author: ming
 *@create: 2020-07-16 16:29
 */
public class BubbleSort {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<Integer>();

        for (int i = 0; i < 10; i++) {
            list.add((int) (Math.random() * 100));
        }
        System.out.println("排序前的集合为：");
        System.out.println(Arrays.toString(list.toArray()));

        //冒泡排序
        for (int i = 0; i < list.size() - 1; i++) {

            for (int j = 0; j < list.size() - 1 - i; j++) {
                if (list.get(j) > list.get(j + 1)) {
                    //交换值
                    int index = list.get(j);
                    list.set(j, list.get(j + 1));
                    list.set(j + 1, index);
                }
            }

        }

        System.out.println("排序后的集合为：");
        System.out.println(Arrays.toString(list.toArray()));

    }
}
