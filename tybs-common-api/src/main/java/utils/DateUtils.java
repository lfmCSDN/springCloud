package utils;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * User:lfm
 * Date:2018/3/13 0013
 * <p>
 * 日期相关的工具集
 */
public final class DateUtils {

    public static String dataToStr1(Date date) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        return sdf.format(date);
    }

    public static String getOrderOID() {
        SimpleDateFormat format = new SimpleDateFormat("HHmmssSSS");
        String str = format.format(new Date());
        return str;
    }

    public static String getCurrenTime(){
        SimpleDateFormat dateformat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String dateStr = dateformat.format(System.currentTimeMillis());
        return dateStr;
    }

}
