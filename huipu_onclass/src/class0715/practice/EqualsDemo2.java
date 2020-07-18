package class0715.practice;
/**
 *@program: huipu_onclass
 *@description:
 *@author: ming
 *@create: 2020-07-15 16:32
 */
public class EqualsDemo2 {

    public static void main(String[] args) {

        String s1 = "hello";
        String s2 = new String("hello");

        System.out.println(s1==s2);
        System.out.println(s1.equals(s2));
    }
}

