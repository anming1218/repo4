package asortpractice;
import java.util.Arrays;
import java.util.Scanner;

/**
 *@program: huipu_onclass
 *@description:
 *@author: ming
 *@create: 2020-07-25 22:06
 */
public class ShellTest {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        //给数组填充数据
        int[] a = new int[10];
        for (int i = 0; i < a.length; i++) {
            a[i] = (int) (Math.random() * 100);
        }
        System.out.println(Arrays.toString(a));

        shellSort(a);
        System.out.println(Arrays.toString(a));

    }

    private static void shellSort(int[] a) {
        for (int gap = a.length / 2; gap > 0; gap /= 2) {
            for (int i = gap; i < a.length; i++) {
                for (int j = i; j >= gap && a[j] < a[j - gap]; j -= gap) {
                    int temp = a[j];
                    a[j] = a[j - gap];
                    a[j - gap] = temp;
                }
            }
        }
    }
}
