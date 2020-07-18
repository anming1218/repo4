package class0716.practice.practice2;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 *@program: huipu_onclass
 *@description: 已知有十六支男子足球队参加运动会。写一个程序，把这16 支球队随机分为4 个组，要求数据存储使用List，随机数问题自行查阅
 * 足球队： 科特迪瓦，阿根廷，澳大利亚，塞尔维亚，荷兰，尼日利亚、日本，美国，中国，新西兰，巴西，比利时，韩国，喀麦隆，洪都拉斯，意大利
 *@author: ming
 *@create: 2020-07-16 17:18
 */
public class PracticeDemo7 {

    public static void main(String[] args) {

        //把所有足球队写入数组中
        String[] allTeam = {"科特迪瓦", "阿根廷", "澳大利亚", "塞尔维亚", "荷兰", "尼日利亚",
                "日本", "美国", "中国", "新西兰", "巴西", "比利时", "韩国", "喀麦隆", "洪都拉斯", "意大利"};

        List<String> list = new ArrayList<String>();
        Random random = new Random();

        //将数组中的队伍随机放入集合中
        random.nextInt(16);
        while (!(list.size() == 16)) {
            String team = allTeam[random.nextInt(16)];
            if (!list.contains(team)) {
                list.add(team);
            }
        }

        //遍历集合，并将其分为四组
        for (int i = 0, j = 1; i < list.size() && j <= 4; i++) {


            if ((i + 1) % 4 != 0) {

                //输出组号
                if (i%4==0){
                    System.out.println("第"+j+"组");
                }
                //输出队伍名称
                System.out.print(list.get(i) + ",");

            } else {
                System.out.print(list.get(i));
                j++;
                System.out.println();
            }

        }


    }

}
