package class0716.practice.sortpractice;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *@program: huipu_onclass
 *@description: 插入排序
 *@author: ming
 *@create: 2020-07-18 21:06
 */
public class InsertSort {

    public static void main(String[] args) {

        List<Integer> list = new ArrayList<Integer>();

        for (int i = 0; i < 10; i++) {
            list.add((int) (Math.random() * 100));
        }
        System.out.println("排序前的集合为：");
        System.out.println(Arrays.toString(list.toArray()));

        int j;
        for (int i = 1; i < list.size(); i++) {

            int index = list.get(i);
            for (j = i; j > 0 && (list.get(j) < list.get(j - 1)); j--) {
                list.set(j, list.get(j - 1));
                list.set(j-1, index);
            }

        }

        System.out.println("排序后的集合为：");
        System.out.println(Arrays.toString(list.toArray()));

    }

}
