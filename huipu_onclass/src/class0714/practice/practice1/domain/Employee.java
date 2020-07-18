package class0714.practice.practice1.domain;
import java.io.Serializable;

/**
 *@program: huipu_onclass
 *@description: 用户的实体类
 *@author: ming
 *@create: 2020-07-14 16:01
 */
public class Employee implements Serializable {

    /**
     * 工号、姓名、年龄、性别、部门、权限（职员/部门经理/管理员）、状态（正常、注销）
     */
    private String eid;
    private String name;
    private int age;
    private char sex;
    private String department;
    private String competence;
    private String status;

    public Employee() {
    }

    public Employee(String eid, String name, int age, char sex, String department, String competence, String status) {
        this.eid = eid;
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.department = department;
        this.competence = competence;
        this.status = status;
    }

    public String getEid() {
        return eid;
    }

    public void setEid(String eid) {
        this.eid = eid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getCompetence() {
        return competence;
    }

    public void setCompetence(String competence) {
        this.competence = competence;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "{" +
                "工号=" + eid +
                ", 姓名='" + name + '\'' +
                ", 年龄=" + age +
                ", 性别=" + sex +
                ", 部门='" + department + '\'' +
                ", 权限='" + competence + '\'' +
                ", 状态='" + status + '\'' +
                '}';
    }
}
