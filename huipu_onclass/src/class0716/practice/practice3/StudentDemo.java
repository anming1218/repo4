package class0716.practice.practice3;

import java.util.*;

/**
 *@program: huipu_onclass
 *@description:
 *@author: ming
 *@create: 2020-07-16 21:13
 */
public class StudentDemo {

    public static void main(String[] args) {

        //1.把数据放入集合中
        List<Student> students = new ArrayList<Student>();
        Student[] studentsarr = {
                new Student("wang", 18, 95.7d, "class01"),
                new Student("sun", 35, 60.7d, "class02"),
                new Student("zhao", 22, 70.0d, "class02"),
                new Student("xi", 17, 98.5d, "class01"),
                new Student("xia", 21, 97.2d, "class01"),
                new Student("li", 18, 83.2d, "class03"),
                new Student("cheng", 33, 69.1d, "class03"),
                new Student("he", 29, 75.2d, "class02"),
                new Student("cao", 24, 77.9d, "class03"),
                new Student("mei", 19, 99.0d, "class01"),
        };
        students.addAll(Arrays.asList(studentsarr));

        //计算所有学生的平均年龄
        int sumAge = 0;
        for (Student student : studentsarr) {
            sumAge += student.getAge();
        }

        System.out.println("所有学生的平均年龄为：" + (sumAge / (double) students.size()));

        System.out.println("-------------------------------------------");

        //2.计算各个班级的平均分
        //2.1把每个班的成绩放入map中存储
        Map<String, ArrayList<Double>> map = new HashMap<String, ArrayList<Double>>();
        for (Student student : students) {
            if (!map.containsKey(student.getClassNum())) {
                ArrayList<Double> arrayList = new ArrayList<>();
                arrayList.add(student.getScore());
                map.put(student.getClassNum(), arrayList);
            } else {
                map.get(student.getClassNum()).add(student.getScore());
            }
        }

        //2.2遍历map，获取每个班的成绩
        for (String s : map.keySet()) {
            Double classAvergeScore = arrayListAverge(map.get(s));
            System.out.println(s + "班级的平均分为" + classAvergeScore);
        }

        System.out.println("-------------------------------------------");

        //显示低于平均分的所有学生信息
        double sumScore = 0;
        for (Student student : students) {
            sumScore += student.getScore();
        }

        double avergeScoce = sumScore / students.size();

        for (Student student : studentsarr) {
            if (student.getScore() < avergeScoce) {
                System.out.println(student);
            }
        }

        System.out.println("-------------------------------------------");

        //根据班级显示学生
        //2.1把每个班的学生信息放入map中存储,以班级为键
        Map<String, ArrayList<Student>> classNumMap = new HashMap<String, ArrayList<Student>>();
        for (Student student : students) {
            if (!classNumMap.containsKey(student.getClassNum())) {
                ArrayList<Student> arrayList = new ArrayList<Student>();
                arrayList.add(student);
                classNumMap.put(student.getClassNum(), arrayList);
            } else {
                classNumMap.get(student.getClassNum()).add(student);
            }
        }

        //4.2遍历map，获取每个班的学生信息
        for (String s : classNumMap.keySet()) {
            System.out.println(s + "班的学生信息为");
            for (Student student : classNumMap.get(s)) {
                System.out.println(student);
            }
        }

        System.out.println("-------------------------------------------");

        //5.根据年龄区间显示学生
        int maxage = Integer.MIN_VALUE;
        int minAge = Integer.MAX_VALUE;

        for (Student student : students) {
            if (student.getAge() < minAge) {
                minAge = student.getAge();
            } else if (student.getAge() > maxage) {
                maxage = student.getAge();
            }
        }

        int size = (maxage - minAge) / 5 + ((maxage - minAge) % 5 == 0 ? 0 : 1);

        for (int i = 1; i <= size; i++) {
            System.out.println(minAge + 5 * (i - 1) + "到" + (minAge + 5 * i) + "岁的学生有：");
            for (Student student : studentsarr) {
                if (student.getAge() < (minAge + 5 * i) && student.getAge() >= (minAge + 5 * (i - 1))) {
                    System.out.println(student);
                }
            }
        }

        System.out.println("-------------------------------------------");

        //6.输入姓名，删除某个学生
        System.out.println("请输入要删除学生的姓名：");
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();

        System.out.println("删除前的所有学生信息为:");
        for (Student student : students) {
            System.out.println(student);
        }

        students.removeIf(student -> student.getName().equals(name));
        System.out.println("删除后的所有学生信息为:");
        for (Student student : students) {
            System.out.println(student);
        }

    }

    /**
     * 计算成绩集合的平均成绩
     * @param list
     */
    private static Double arrayListAverge(ArrayList<Double> list) {

        double sumScore = 0;
        for (Double score : list) {
            sumScore += score;
        }

        return sumScore / list.size();
    }

}
