package class0713.practice.practice2;
import java.util.ArrayList;
import java.util.List;

/**
 *@program: huipu_onclass
 *@description: 用户相关操作
 *@author: ming
 *@create: 2020-07-13 22:48
 */
public class UserManger {

    List<User> userList = new ArrayList<>();

    public UserManger() {

        User[] users = {
                new User("wang", "wang", 2),
                new User("li", "li", 0),
                new User("cheng", "cheng", 1),
                new User("yu", "yu", 0),
                new User("zhao", "zhao", 1),
                new User("sun", "sun", 0),
        };

        for (User user : users) {
            userList.add(user);
        }
    }

    /**
     * 用户登录：输入用户名和密码，进行登录，并给予相应提示（登录成功/登录失败）
     * @param username
     * @param password
     */
    public void login(String username, String password) {

        boolean flag = false;

        for (User user : userList) {
            if (user.getUsername().equals(username)) {
                if (user.getPassword().equals(password)) {
                    System.out.println("登录成功！");
                    System.out.println("------------------------------------");
                    finduser(userList, user);
                    flag = true;
                    break;
                } else {
                    System.out.println("账户名或密码错误！");
                }
            }
        }

        if (!flag) {
            System.out.println("账户名或密码错误！");
        }
    }

    public void finduser(List<User> userList, User user) {

        switch (user.getAuthority()) {
            case 0: {
                System.out.println("欢迎您，您是普通用户！您的信息为：");
                System.out.println(user);
                break;
            }
            case 1: {
                System.out.println("欢迎您，您是管理员！所有普通用户的信息为：");
                for (User user1 : this.userList) {
                    if (user1.getAuthority() == 1) {
                        System.out.println(user1);
                    }
                }
                System.out.println("您的信息为：");
                System.out.println(user);

                break;
            }
            default: {
                System.out.println("欢迎您，您是超级管理员！所有用户的信息为：");
                for (User user1 : this.userList) {
                    System.out.println(user1);
                }
            }
        }

    }

}
