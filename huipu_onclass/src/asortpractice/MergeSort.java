package asortpractice;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *@program: huipu_onclass
 *@description: 归并排序
 *@author: ming
 *@create: 2020-07-19 20:04
 */
public class MergeSort {

    public static void main(String[] args) {

        List<Integer> list = new ArrayList<Integer>();
        List<Integer> temp = new ArrayList<Integer>();

        for (int i = 0; i < 10; i++) {
            list.add((int) (Math.random() * 100));
            temp.add(0);
        }
        System.out.println("排序前的集合为：");
        System.out.println(Arrays.toString(list.toArray()));

        merge(list, temp, 0, list.size() - 1);

        System.out.println("排序后的集合为：");
        System.out.println(Arrays.toString(list.toArray()));

    }

    private static void merge(List<Integer> list, List<Integer> temp, int l, int r) {
        //取得中间数
        int mid = (r + l) / 2;
        if (l == r) {
            return;
        }

        merge(list, temp, l, mid);
        merge(list, temp, mid + 1, r);

        for (int i = l; i <= r; i++) {
            temp.set(i, list.get(i));
        }

        int i1 = l;
        int i2 = mid + 1;
        for (int cur = l; cur <= r; cur++) {
            if (i1 == mid + 1) {
                list.set(cur, temp.get(i2++));
            } else if (i2 > r) {
                list.set(cur, temp.get(i1++));
            } else if (temp.get(i1) < temp.get(i2)) {
                list.set(cur, temp.get(i1++));
            } else {
                list.set(cur, temp.get(i2++));
            }
        }
    }

}
