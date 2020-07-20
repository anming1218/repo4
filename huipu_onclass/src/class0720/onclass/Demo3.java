package class0720.onclass;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *@program: huipu_onclass
 *@description:
 *@author: ming
 *@create: 2020-07-20 10:47
 */
public class Demo3 {
    public static void main(String[] args) throws ParseException {


        Date date = new Date();
        System.out.println(date);
        DateFormat dateFormat1 = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");
        String dateStr = dateFormat1.format(date);
        System.out.println(dateStr);

        String date1 = "1999年2月3日";
        DateFormat dateFormat2 = new SimpleDateFormat("yyyy年MM月dd日");
        Date date2 = dateFormat2.parse(date1);
        System.out.println(date2);


    }
}
