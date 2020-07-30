package asortpractice;
import java.util.Arrays;
import java.util.Random;


/**
 *@program: huipu_onclass
 *@description:
 *@author: ming
 *@create: 2020-07-26 11:09
 */
public class QuickTest {
    public static void main(String[] args) {

        //给数组填充数据
        int[] a = new int[10];
        for (int i = 0; i < a.length; i++) {
            a[i] = (int) (Math.random() * 100);
        }
        System.out.println(Arrays.toString(a));

        quickSort(a, 0, a.length - 1);
        System.out.println(Arrays.toString(a));
    }

    private static void quickSort(int[] a, int lo, int hi) {
        if (lo > hi) {
            return;
        }

        int pivot = paritition(a, lo, hi);

        quickSort(a, lo, pivot - 1);
        quickSort(a, pivot + 1, hi);

    }

    private static int paritition(int[] a, int lo, int hi) {

        Random random = new Random();
        int pivotIndex = random.nextInt(hi - lo + 1) + lo;
        int pivotValue = a[pivotIndex];

        int high = hi;
        swap(a, pivotIndex, hi);

        hi--;

        while (lo <= hi) {
            if (a[lo] > pivotValue) {
                swap(a, lo, hi);
                hi--;
            } else {
                lo++;
            }
        }

        swap(a, lo, high);
        return lo;


    }

    private static void swap(int[] a, int lo, int hi) {
        int temp = a[lo];
        a[lo] = a[hi];
        a[hi] = temp;
    }


}
