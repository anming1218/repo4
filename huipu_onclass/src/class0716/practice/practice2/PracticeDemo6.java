package class0716.practice.practice2;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *@program: huipu_onclass
 *@description: 定义两个ArrayList集合A和B， A、B中元素都是没有重复的，现要合并A、B得到新的List C，要求C中不能有重复元素
 *@author: ming
 *@create: 2020-07-16 17:03
 */
public class PracticeDemo6 {

    public static void main(String[] args) {

        List<Integer> listA = new ArrayList<Integer>();
        List<Integer> listB = new ArrayList<Integer>();
        List<Integer> listC = new ArrayList<Integer>();

        listA.add(1);
        listA.add(2);
        listA.add(3);
        listA.add(4);
        listB.add(2);
        listB.add(3);
        listB.add(5);
        listB.add(6);

        System.out.println("集合A为：");
        System.out.println(Arrays.toString(listA.toArray()));
        System.out.println("集合B为：");
        System.out.println(Arrays.toString(listB.toArray()));

        listC.addAll(listA);
        for (Integer i : listB) {
            if (!listC.contains(i)) {
                listC.add(i);
            }
        }

        System.out.println("集合c为：");
        System.out.println(Arrays.toString(listC.toArray()));

    }
}
