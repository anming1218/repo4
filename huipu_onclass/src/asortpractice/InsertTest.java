package asortpractice;
import java.util.Arrays;
import java.util.Scanner;

/**
 *@program: huipu_onclass
 *@description:
 *@author: ming
 *@create: 2020-07-25 21:04
 */
public class InsertTest {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        //给数组填充数据
        int[] a = new int[10];
        for (int i = 0; i < a.length; i++) {
            a[i] = (int) (Math.random() * 100);
        }
        System.out.println(Arrays.toString(a));

        insertSort(a);
        System.out.println(Arrays.toString(a));
    }

    private static void insertSort(int[] a) {

        for (int i = 1; i < a.length; i++) {

            for (int j = i; j > 0 && j < a.length ; j--) {

                if (a[j] < a[j - 1]) {
                    int temp = a[j];
                    a[j] = a[j - 1];
                    a[j - 1] = temp;
                } else {
                    break;
                }

            }
        }
    }
}
