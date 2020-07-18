package class0713.practice.practice2;
import java.io.Serializable;

/**
 *@program: huipu_onclass
 *@description: 用户实体类
 *@author: ming
 *@create: 2020-07-13 22:45
 */
public class User implements Serializable {

    private String username;
    private String password;
    private int authority;

    public User() {
    }

    public User(String username, String password, int authority) {
        this.username = username;
        this.password = password;
        this.authority = authority;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getAuthority() {
        return authority;
    }

    public void setAuthority(int authority) {
        this.authority = authority;
    }

    @Override
    public String toString() {
        return "User{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", authority=" + authority +
                '}';
    }

}
