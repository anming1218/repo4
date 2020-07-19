package class0716.practice.sortpractice;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *@program: huipu_onclass
 *@description: 希尔排序
 *@author: ming
 *@create: 2020-07-19 14:38
 */
public class ShellSort {

    public static void main(String[] args) {

        List<Integer> list = new ArrayList<Integer>();

        for (int i = 0; i < 10; i++) {
            list.add((int) (Math.random() * 100));
        }
        System.out.println("排序前的集合为：");
        System.out.println(Arrays.toString(list.toArray()));

        for (int gap = list.size() / 2; gap > 0; gap /= 2) {
            for (int i = gap; i < list.size(); i++) {
                for (int j = i; j >= gap && list.get(j) - list.get(j - gap) < 0; j -= gap) {
                    //交换值
                    int index = list.get(j);
                    list.set(j, list.get(j - gap));
                    list.set(j - gap, index);
                }
            }
        }

        System.out.println("排序后的集合为：");
        System.out.println(Arrays.toString(list.toArray()));
    }
}
