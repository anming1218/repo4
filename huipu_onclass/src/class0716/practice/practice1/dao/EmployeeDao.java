package class0716.practice.practice1.dao;

import class0716.practice.practice1.domain.Employee;

import java.util.ArrayList;
import java.util.List;

/**
 *@program: huipu_onclass
 *@description:
 *@author: ming
 *@create: 2020-07-14 16:08
 */
public class EmployeeDao {

    private List<Employee> employees = new ArrayList<>();

    public void addAll() {

        Employee[] employeeArray = {
                new Employee("1001", "xi", 22, '女', "开发部", "部门经理", "正常"),
                new Employee("1002", "sun", 34, '男', "营销部", "部门经理", "正常"),
                new Employee("1003", "cheng", 35, '女', "开发部", "管理员", "正常"),
                new Employee("1004", "xi", 23, '男', "开发部", "职员", "正常"),
                new Employee("1005", "zhao", 282, '男', "营销部", "职员", "正常"),
                new Employee("1006", "mei", 24, '女', "营销部", "职员", "正常"),
                new Employee("1007", "yu", 27, '女', "开发部", "职员", "正常"),
                new Employee("1008", "wu", 20, '男', "营销部", "职员", "正常"),
                new Employee("1009", "he", 32, '女', "开发部", "职员", "正常"),
                new Employee("1010", "liu", 42, '女', "开发部", "职员", "正常"),
        };
        for (Employee employee : employeeArray) {
            employees.add(employee);
        }

    }

    /**
     * 登陆功能
     * @param eid 工号
     * @param name 姓名
     * @return 员工
     */
    public Employee login(String eid, String name) {
        for (Employee employee : employees) {
            if (employee.getEid().equals(eid) && employee.getName().equals(name) && "正常".equals(employee.getStatus())) {
                return employee;
            }
        }


        return null;
    }

    /**
     * 更新个人信息
     * @param employee
     */
    public void update(Employee employee) {

        for (Employee employee1 : employees) {
            if (employee.getEid().equals(employee1.getEid()) && employee.getName().equals(employee.getName())) {
                employee1 = employee;
                System.out.println(employee1);
                break;
            }
        }

    }


    /**
     * 查看部们所有员工
     * @param department
     */
    public void findDepartmentEmployee(String department) {

        int i = 1;

        for (Employee employee : employees) {
            if (employee.getDepartment().equals(department)) {
                System.out.println(department + "员工" + i + employee);
                i++;
            }
        }


    }

    /**
     * 注销员工
     * @param logoutEid
     */
    public void logout(String logoutEid, String department) {

        for (Employee employee : employees) {
            if (employee.getEid().equals(logoutEid) && employee.getDepartment().equals(department)) {
                employee.setStatus("注销");
                System.out.println("注销成功");
                System.out.println(employee);
            }
        }

    }

    /**
     * 提升员工
     * @param promoteEid
     */
    public void promoteEmployee(String promoteEid) {

        for (Employee employee : employees) {
            if (employee.getEid().equals(promoteEid)) {
                employee.setCompetence("部门经理");
                System.out.println("提升成功！");
                System.out.println(employee);
                break;
            }
        }
    }

    /**
     * 员工注册
     * @param name
     * @param age
     * @param sex
     * @param department
     */
    public void addEmployee(String name, int age, String sex, String department) {

        Employee employee = new Employee();

        //写入数据到Employee中
        employee.setEid(Integer.toString(Integer.parseInt(employees.get(employees.size() - 1).getEid())+1));
        employee.setName(name);
        employee.setAge(age);
        employee.setSex(sex.toCharArray()[0]);
        employee.setDepartment(department);
        employee.setCompetence("职员");
        employee.setStatus("正常");

        System.out.println("添加成功！");
        System.out.println("您的信息为：" + employee);

        employees.add(employee);
    }
}
