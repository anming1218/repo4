package class0713.practice.practice2;
import java.util.Scanner;

/**
 *@program: huipu_onclass
 *@description:
 *@author: ming
 *@create: 2020-07-13 23:05
 */
public class Test {

    public static void main(String[] args) {

        System.out.println("欢迎登陆用户管理系统！");

        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入账户名:");
        String username = scanner.nextLine();
        System.out.println("请输入密码:");
        String password = scanner.nextLine();

        UserManger userManger = new UserManger();
        userManger.login(username, password);

    }

}
