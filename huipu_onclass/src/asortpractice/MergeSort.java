package asortpractice;

import java.util.Arrays;
import java.util.Scanner;

/**
 *@program: huipu_onclass
 *@description: 归并排序
 *@author: ming
 *@create: 2020-07-19 20:04
 */
public class MergeSort {

    public static long count = 0;

    public static void main(String args[]) throws Exception {

        int[] a = new int[10];
        for (int i = 0; i < 10; i++) {
            a[i] = (int) (Math.random() * 100);
        }
        System.out.println(Arrays.toString(a));

        mergeSort(a, 0, a.length - 1);
        System.out.println(count);
        System.out.println(Arrays.toString(a));
    }

    private static void mergeSort(int[] a, int lo, int hi) {
        if (lo >= hi) {
            return;
        }

        int mid = lo + (hi - lo) / 2;

        mergeSort(a, lo, mid);
        mergeSort(a, mid + 1, hi);
        merge(a, lo, mid, hi);
    }

    private static void merge(int[] a, int lo, int mid, int hi) {
        int p = lo, q = mid + 1;

        int[] nums = new int[hi - lo + 1];
        int index = 0;

        while (p <= mid && q <= hi) {
            if (a[p] > a[q]) {
                count += mid - p + 1;
                nums[index++] = a[q++];
            } else {
                nums[index++] = a[p++];
            }
        }

        while (p <= mid) {
            nums[index++] = a[p++];
        }

        while (q <= hi) {
            nums[index++] = a[q++];
        }

        System.arraycopy(nums, 0, a, lo, hi - lo + 1);
    }
}
