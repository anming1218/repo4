package class0714.practice.practice2;
/**
 *@program: huipu_onclass
 *@description:
 *@author: ming
 *@create: 2020-07-14 22:37
 */
public class Demo {
    public static void main(String[] args) {

        for(char a = 'x';a <= 'z'; a++){
            for(char b = 'x'; b <= 'z'; b++){
                for(char c = 'x'; c <= 'z'; c++){

                    // 后三个条件是去除重复情况（比如排除：a vs y, b vs y）
                    if(a != 'x' && c!='x'&&c!='z'&&a!=b&&a!=c&&b!=c){
                        System.out.println("a  vs  "+a);
                        System.out.println("b  vs  "+b);
                        System.out.println("c  vs  "+c);
                    }
                }
            }
        }
    }
}
