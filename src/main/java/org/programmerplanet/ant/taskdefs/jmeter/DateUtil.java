package org.programmerplanet.ant.taskdefs.jmeter;



import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created with IntelliJ IDEA.
 * User: jiaou
 * Date: 16-7-23
 * Time: 下午10:51
 * To change this template use File | Settings | File Templates.
 */
public class DateUtil {

    /**
     * 获取当前时间，"HH:mm:ss"格式返回
     * @return
     */
    public static String getCurrentTime()
    {
        SimpleDateFormat df = new SimpleDateFormat("HH:mm:ss");//设置日期格式
        return df.format(new Date());
    }

    /**
     * 获取当前日期，"yyyy-MM-dd HH:mm:ss"格式返回
     * @return
     */
    public static String getCurrentDate()
    {
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//设置日期格式
        return df.format(new Date());
    }

    /**
     * 获取format格式的日期
     * @param format
     * @return
     */
    public static String getDate(String format)
    {
        SimpleDateFormat df = new SimpleDateFormat(format);//设置日期格式
        return df.format(new Date());
    }

    /*
     * 将时间转换为时间戳
     */
    public static String dateToStamp(String time){
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String stamp = "";
        if (!"".equals(time)) {//时间不为空
            try {
                stamp = String.valueOf(sdf.parse(time).getTime()/1000);
            } catch (Exception e) {
                System.out.println("参数为空！");
            }
        }else {    //时间为空
            long current_time = System.currentTimeMillis();  //获取当前时间
            stamp = String.valueOf(current_time/1000);
        }
        return stamp;
    }


    /*
     * 将时间戳转换为时间
     */
    public static String stampToDate(String time){
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String time_Date = sdf.format(new Date(Long.parseLong(time)));
        return time_Date;

    }

    public static void main(String[] args) {
        String time1 = "2020-2-7 12:30:56";
        String time2 = "1581004800";
        System.out.println("将时间转为时间戳："+dateToStamp(time1));
        System.out.println("将时间戳转为时间："+stampToDate(time2));
    }


}



