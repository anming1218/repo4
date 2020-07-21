package class0721.practice.exception;
/**
 *@program: huipu_onclass
 *@description:
 *@author: ming
 *@create: 2020-07-21 20:30
 */

//首先创建6个异常类
class LowAgeException extends Exception {
    public LowAgeException(String message) {
        super(message);
    }
}

class HeightAgeException extends Exception {
    public HeightAgeException(String message) {
        super(message);
    }
}

class NullException extends Exception {
    public NullException(String message) {
        super(message);
    }
}

class LowSalaryException extends Exception {
    public LowSalaryException(String message) {
        super(message);
    }
}

class HighSalaryException extends Exception {
    public HighSalaryException(String message) {
        super(message);
    }
}

class IdCardException extends Exception {
    public IdCardException(String message) {
        super(message);
    }
}

//员工类
class Employee {
    private int id;
    private String name;
    private int age;
    private double salary;
    private String idCard;
    private int totalEmployee = 10;
    private double totalSalary = 100000;

    public Employee(int id, String name, int age) throws Exception {
        if (age < 18) {
            throw new LowAgeException("年龄太小了!");
        } else if (age > 60) {
            throw new HeightAgeException("年龄太高了!");
        } else if ((name == null) || name == "") {
            throw new NullException("姓名不能为空!");
        }
    }

    public Employee(double salary, String idCard) throws Exception {
        this.salary = salary;
        if (salary < 600) {
            throw new LowSalaryException("工资太低了!");
        } else if (idCard.length() != 18) {
            throw new IdCardException("身份证非法!");
        }
    }

    //增加工资
    public void addSalary(double addSalary) throws Exception {
        double nowSalary = salary + addSalary;
        System.out.println("增加后的工资是:" + nowSalary);
        if (nowSalary > totalSalary) {
            throw new HighSalaryException("工资增加后太高了!");
        }
    }

    //减少工资
    public void minusSalary(double minusSalary) throws Exception {
        double nowSalary = salary - minusSalary;
        System.out.println("减少后的工资是:" + nowSalary);
        if (nowSalary < 600) {
            throw new HighSalaryException("工资减少后太低了!");
        }
    }

    //显示员工工资总额
    public void showTotalSalary() throws Exception {
        if (totalSalary == 0) {
            throw new IdCardException("工资总额为0!");
        }
    }

    //显示员工人数
    public void showTotalEmployee() throws Exception {
        if (totalEmployee == 0) {
            throw new IdCardException("员工人数为0!");
        }
    }
}

public class Practice {
    public static void main(String[] args) {
        try {
            Employee e1 = new Employee(201801, "小青", 26);
            Employee e2 = new Employee(655, "123456789987654321");
            e2.addSalary(1000);
            e2.minusSalary(100);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            System.out.println("欢迎使用本系统！");
        }
    }
}