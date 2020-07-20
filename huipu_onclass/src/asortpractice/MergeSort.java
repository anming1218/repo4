package asortpractice;

import java.util.Arrays;

/**
 *@program: huipu_onclass
 *@description: 归并排序
 *@author: ming
 *@create: 2020-07-19 20:04
 */
public class MergeSort {

    /**
     * 记录逆序对数
     */
    public static long count = 0;

    public static void main(String args[]) throws Exception {

        //给数组填充数据
        int[] a = new int[10];
        for (int i = 0; i < 10; i++) {
            a[i] = (int) (Math.random() * 100);
        }
        System.out.println(Arrays.toString(a));

        //给数组进行分组
        mergeSort(a, 0, a.length - 1);

        //输出逆序对数，排序后的数组
        System.out.println(count);
        System.out.println(Arrays.toString(a));
    }

    /**
     * 对这个数组进行分割
     * @param a 初识数组
     * @param lo 数组分割的开始
     * @param hi 数组分割的结束
     */
    private static void mergeSort(int[] a, int lo, int hi) {
        if (lo >= hi) {
            return;
        }

        int mid = lo + (hi - lo) / 2;

        mergeSort(a, lo, mid);
        mergeSort(a, mid + 1, hi);

        merge(a, lo, mid, hi);
    }

    /**
     * 对已经分割的数组进行归并排序
     * @param a 初识数组
     * @param lo 数组分割开始的位置
     * @param mid 数组的中间位置
     * @param hi 数组分割的结束位置
     */
    private static void merge(int[] a, int lo, int mid, int hi) {
        //分别记录两个数组的开始位置
        int p = lo, q = mid + 1;

        //得到一个新的空数组
        int[] nums = new int[hi - lo + 1];
        int index = 0;

        //比较前后数组中的元素排序
        while (p <= mid && q <= hi) {
            if (a[p] > a[q]) {
                count += mid - p + 1;
                nums[index++] = a[q++];
            } else {
                nums[index++] = a[p++];
            }
        }

        //mid前未排序的数组加入
        while (p <= mid) {
            nums[index++] = a[p++];
        }

        //mid后未排序的数组加入
        while (q <= hi) {
            nums[index++] = a[q++];
        }

        //复制数组
        System.arraycopy(nums, 0, a, lo, hi - lo + 1);
    }
}
