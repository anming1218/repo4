package asortpractice;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/**
 *@program: huipu_onclass
 *@description:
 *@author: ming
 *@create: 2020-07-26 11:09
 */
public class QuickTest {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
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

        if (lo >= hi) {
            return;
        }

        int point = partition(a, lo, hi);

        partition(a, lo, point - 1);
        partition(a, point + 1, hi);
    }

    private static int partition(int[] a, int lo, int hi) {
        Random random = new Random();
        int pivotIndex = random.nextInt(hi - lo + 1) + lo;
        int pivotValue = a[pivotIndex];
        int savedPosition = hi;
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

        swap(a, lo, savedPosition);
        return lo;
    }

    private static void swap(int[] a, int pivotIndex, int hi) {

        int temp = a[pivotIndex];
        a[pivotIndex] = a[hi];
        a[hi] = temp;
    }
}
