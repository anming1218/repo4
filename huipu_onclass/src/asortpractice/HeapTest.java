package asortpractice;
import java.util.Arrays;
import java.util.Scanner;

/**
 *@program: huipu_onclass
 *@description:
 *@author: ming
 *@create: 2020-07-26 09:25
 */
public class HeapTest {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        //给数组填充数据
        int[] a = new int[10];
        for (int i = 0; i < a.length; i++) {
            a[i] = (int) (Math.random() * 100);
        }
        System.out.println(Arrays.toString(a));

        heapSort(a);
        System.out.println(Arrays.toString(a));

    }

    private static void heapSort(int[] a) {

        //将堆调整为最大堆,从第一个叶子节点起
        for (int i = (a.length - 1) / 2; i >= 0; i--) {
            adjustHeap(a, i, a.length);
        }

        //调整堆，并交换首位元素
        for (int i = a.length - 1; i >= 0; i--) {
            int temp = a[0];
            a[0] = a[i];
            a[i] = temp;
            adjustHeap(a, 0, i);
        }

    }

    private static void adjustHeap(int[] a, int parent, int length) {
        //保留父节点的值
        int temp = a[parent];

        int leftChild = 2 * parent + 1;
        while (leftChild < length) {
            int rightChild = leftChild + 1;
            if (rightChild < length && a[rightChild] > a[leftChild]) {
                leftChild++;
            }

            if (a[parent] > a[leftChild]) {
                break;
            } else {
                a[parent] = a[leftChild];
                parent = leftChild;
                leftChild = 2 * parent + 1;
            }

            a[parent] = temp;
        }


    }


}

