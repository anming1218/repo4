package class0714.practice.practice1.test;
import class0714.practice.practice1.dao.EmployeeDao;
import class0714.practice.practice1.domain.Employee;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 *@program: huipu_onclass
 *@description: 员工管理测试类
 *@author: ming
 *@create: 2020-07-14 16:22
 */
public class EmployeeTest {

    private static Scanner sc = new Scanner(System.in);
    private static EmployeeDao dao = new EmployeeDao();

    public static void main(String[] args) {

        out1:
        {
            while (true) {
                System.out.println("欢迎登陆员工管理系统！");
                System.out.println("===============================");
                System.out.println("请输入功能前面的数字以确定您的操作！");
                System.out.println("1.登陆    2.退出");
                int index = sc.nextInt();

                //把读取完int类型后的\N读取了
                sc.nextLine();

                if (index == 1) {

                    System.out.println("请输入工号：");
                    String eid = sc.nextLine();
                    System.out.println("请输入姓名：");
                    String name = sc.nextLine();
                    Employee employee = dao.login(eid, name);

                    if (employee != null) {
                        Map<String,Integer> map=new HashMap<String, Integer>();
                        map.put("职员",1);
                        map.put("部门经理",2);
                        map.put("管理员",3);

                        switch (map.get(employee.getCompetence())) {

                            //职员操作
                            case 1: {
                                out2:
                                {
                                    while (true) {
                                        System.out.println("===============================");
                                        System.out.println("登陆成功！欢迎您职员" + employee.getName());

                                        System.out.println("请输入功能前面的数字以确定您的操作！");
                                        System.out.println("1.查看个人信息    2.个人信息完善    3.退出");
                                        int index1 = sc.nextInt();

                                        //把读取完int类型后的\N读取了
                                        sc.nextLine();

                                        switch (index1) {
                                            case 1: {
                                                System.out.println("===============================");
                                                System.out.println(employee);
                                                break;
                                            }

                                            case 2: {
                                                System.out.println("===============================");
                                                updateEmployee(employee);
                                                System.out.println("修改成功！");
                                                break;
                                            }

                                            default: {
                                                System.out.println("账户已退出！");
                                                break out2;
                                            }
                                        }
                                    }
                                }
                                break;
                            }

                            //部门经理操作
                            case 2: {

                                out3:
                                {
                                    while (true) {
                                        System.out.println("===============================");
                                        System.out.println("登陆成功！欢迎您部门经理" + employee.getName());

                                        System.out.println("请输入功能前面的数字以确定您的操作！");
                                        System.out.println("1.查看个人信息    2.个人信息完善    3.查看部门员工    4.注销员工    5.退出");
                                        int index1 = sc.nextInt();

                                        //把读取完int类型后的\N读取了
                                        sc.nextLine();

                                        switch (index1) {
                                            case 1: {
                                                System.out.println("===============================");
                                                System.out.println(employee);
                                                break;
                                            }

                                            case 2: {
                                                System.out.println("===============================");
                                                updateEmployee(employee);
                                                System.out.println("修改成功！");
                                                break;
                                            }

                                            case 3: {
                                                System.out.println("===============================");
                                                dao.findDepartmentEmployee(employee.getDepartment());
                                                break;
                                            }

                                            case 4: {
                                                System.out.println("===============================");
                                                System.out.println("请输入要注销员工的id：");
                                                String logoutEid = sc.nextLine();
                                                dao.logout(logoutEid,employee.getDepartment());
                                                break;
                                            }

                                            default: {
                                                System.out.println("账户已退出！");
                                                break out3;
                                            }
                                        }
                                    }
                                }
                                break;
                            }

                            //管理员操作
                            default: {

                                out4:
                                {
                                    while (true) {
                                        System.out.println("===============================");
                                        System.out.println("登陆成功！欢迎您部门经理" + employee.getName());

                                        System.out.println("请输入功能前面的数字以确定您的操作！");
                                        System.out.println("1.查看个人信息    2.个人信息完善    3.提升员工    4.退出");
                                        int index1 = sc.nextInt();

                                        //把读取完int类型后的\N读取了
                                        sc.nextLine();

                                        switch (index1) {
                                            case 1: {
                                                System.out.println("===============================");
                                                System.out.println(employee);
                                                break;
                                            }

                                            case 2: {
                                                System.out.println("===============================");
                                                updateEmployee(employee);
                                                System.out.println("修改成功！");
                                                break;
                                            }

                                            case 3: {
                                                System.out.println("===============================");
                                                System.out.println("请输入要提升员工的id：");
                                                String promoteEid = sc.nextLine();
                                                dao.promoteEmployee(promoteEid);
                                                break;
                                            }

                                            default: {
                                                System.out.println("账户已退出！");
                                                break out4;
                                            }
                                        }
                                    }
                                }
                                break;
                            }
                        }
                    }
                } else {
                    System.out.println("退出成功，欢迎下次使用！");
                    break out1;
                }
            }
        }
    }

    /**
     * 完善个人信息
     */
    public static void updateEmployee(Employee newEmployee) {

        System.out.println("请输入新的年龄：");
        int age = sc.nextInt();

        //把读取完int类型后的\N读取了
        sc.nextLine();

        System.out.println("请输入新的性别：");
        String sex = sc.nextLine();
        System.out.println("请输入新的部门：");
        String department = sc.nextLine();

        newEmployee.setAge(age);
        newEmployee.setSex(sex.toCharArray()[0]);
        newEmployee.setDepartment(department);

        dao.update(newEmployee);
    }

}
