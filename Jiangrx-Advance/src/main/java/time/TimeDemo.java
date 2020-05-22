package time;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Calendar;
import java.util.Date;

/**
 * @Author: caop
 * @Description:
 * @Date: Created in 19:01 2020/5/21
 */
public class TimeDemo {

    /**
     * "介绍日期类，常用功能。
     * 1. 示例代码里写一个工具类，传入一个日期能查看年份、月份、季度、日期、星期数、是365天中的那一天，
     *    用静态方法写；
     * 2. 按指定要求格式化一个日期；
     * 3. 对日期进行相关操作，进行增减小时、月份、日期。要有源码有笔记"
     */

    public static void main(String[] args) throws ParseException {
//        指定一个日期
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date d = sdf.parse("2019-03-21");
        Date date = new Date();
        timeUtil(d);

        /**
         * 指定要求格式化日期
         */
        LocalDateTime localDate = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.FULL,FormatStyle.MEDIUM);

        System.out.println(localDate);
        System.out.println(localDate.format(formatter));

        /**
         * 对日期进行相关操作，进行增减小时、月份、日期。
         */
        LocalDateTime localDate1 = LocalDateTime.now();
        LocalDateTime localDateTime = localDate1.minusDays(2).plusYears(1).plusMonths(2);

        System.out.println("修改之后的时间 "+localDateTime);


    }

    public static void timeUtil(Date date){
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        int year = calendar.get(Calendar.YEAR);
        int month = calendar.get(Calendar.MONTH)+1;
        int season = getSeason(date);
        int day = calendar.get(Calendar.DATE);
        int week = calendar.get(Calendar.WEEK_OF_YEAR);
        int dayOfYear = calendar.get(Calendar.DAY_OF_YEAR);
        System.out.println("今天是"+year+"年 "+month+"月 "+season+"季度 "+day+"日 "+week+"星期 "+"第"+dayOfYear+"天");

    }

    /**
     *
     * 1 第一季度 2 第二季度 3 第三季度 4 第四季度
     *
     * @param date
     * @return
     */
    public static int getSeason(Date date) {

        int season = 0;

        Calendar c = Calendar.getInstance();
        c.setTime(date);
        int month = c.get(Calendar.MONTH);
        switch (month) {
            case Calendar.JANUARY:
            case Calendar.FEBRUARY:
            case Calendar.MARCH:
                season = 1;
                break;
            case Calendar.APRIL:
            case Calendar.MAY:
            case Calendar.JUNE:
                season = 2;
                break;
            case Calendar.JULY:
            case Calendar.AUGUST:
            case Calendar.SEPTEMBER:
                season = 3;
                break;
            case Calendar.OCTOBER:
            case Calendar.NOVEMBER:
            case Calendar.DECEMBER:
                season = 4;
                break;
            default:
                break;
        }
        return season;
    }
}
