package asortpractice;
import java.util.Arrays;
import java.util.Scanner;

/**
 *@program: huipu_onclass
 *@description:
 *@author: ming
 *@create: 2020-07-25 21:11
 */
public class SelectTest {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        //给数组填充数据
        int[] a = new int[10];
        for (int i = 0; i < a.length; i++) {
            a[i] = (int) (Math.random() * 100);
        }
        System.out.println(Arrays.toString(a));

        selectSort(a);
        System.out.println(Arrays.toString(a));

    }

    private static void selectSort(int[] a) {

        for (int i = 0; i < a.length - 1; i++) {

            for (int j = i; j < a.length; j++) {
                if (a[i] > a[j]) {
                    int temp = a[j];
                    a[j] = a[i];
                    a[i] = temp;
                }
            }
        }

    }
}
