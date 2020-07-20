package asortpractice;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *@program: huipu_onclass
 *@description: 堆排序
 *@author: ming
 *@create: 2020-07-19 15:12
 */
public class HeapSort {

    public static void main(String[] args) {

        List<Integer> list = new ArrayList<Integer>();

        for (int i = 0; i < 10; i++) {
            list.add((int) (Math.random() * 100));
        }
        System.out.println("排序前的集合为：");
        System.out.println(Arrays.toString(list.toArray()));

        heapSort(list);

        System.out.println("排序后的集合为：");
        System.out.println(Arrays.toString(list.toArray()));
    }

    /**
     * 创建堆，
     * @param list 待排序列
     */
    private static void heapSort(List<Integer> list) {
        //创建堆
        for (int i = (list.size() - 1) / 2; i >= 0; i--) {
            //从第一个非叶子结点从下至上，从右至左调整结构
            adjustHeap(list, i, list.size());
        }

        System.out.println("dadui的集合为：");
        System.out.println(Arrays.toString(list.toArray()));

        //调整堆结构+交换堆顶元素与末尾元素
        for (int i = list.size() - 1; i > 0; i--) {
            //将堆顶元素与末尾元素进行交换
            int temp = list.get(i);
            list.set(i, list.get(0));
            list.set(0, temp);

            //重新对堆进行调整
            adjustHeap(list, 0, i);
        }
    }

    /**
     * 调整堆
     * @param list 待排序列
     * @param parent 父节点
     * @param length 待排序列尾元素索引
     */
    private static void adjustHeap(List<Integer> list, int parent, int length) {
        //将temp作为父节点
        int temp = list.get(parent);
        //左孩子
        int lChild = 2 * parent + 1;

        while (lChild < length) {
            //右孩子
            int rChild = lChild + 1;
            // 如果有右孩子结点，并且右孩子结点的值大于左孩子结点，则选取右孩子结点
            if (rChild < length && list.get(lChild) < list.get(rChild)) {
                lChild++;
            }

            // 如果父结点的值已经大于孩子结点的值，则直接结束
            if (temp >= list.get(lChild)) {
                break;
            }

            // 把孩子结点的值赋给父结点
            list.set(parent, list.get(lChild));

            //选取孩子结点的左孩子结点,继续向下筛选
            parent = lChild;
            lChild = 2 * lChild + 1;
        }
        list.set(parent, temp);
    }

}
