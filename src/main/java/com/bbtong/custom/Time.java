package com.bbtong.custom;

import javax.xml.crypto.Data;
import java.rmi.MarshalledObject;
import java.text.SimpleDateFormat;
import java.time.*;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * 自定义时间类 用来存储一些时间类和调用时间类
 */

public class Time {
    /**
     * 获取每天的时间
     *
     * @return
     */
    public Map<String, String> todayTime() {
        //创建map函数用来存储和操作数据
        Map<String, String> map = new HashMap<String, String>();
        Calendar cal = Calendar.getInstance();
        //将时间设置成当前日期 0:0::0
        cal.set(cal.get(Calendar.YEAR), cal.get(Calendar.MONTH), cal.get(Calendar.DAY_OF_MONTH), 0, 0, 0);
        //获取当前的时间
        Date beginOfDate = cal.getTime();
        //设置时间的格式为yyyy-MM-dd HH:mm:ss
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        //在当前日期下+1
        cal.set(cal.get(Calendar.YEAR), cal.get(Calendar.MONTH), cal.get(Calendar.DAY_OF_MONTH) + 1, 0, 0, 0);
        //获取当前的时间
        Date newData = cal.getTime();
        //设置时间的格式为yyyy-MM-dd HH:mm:ss
        SimpleDateFormat newformatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        //将设置的时间赋值给startTime
        String startTime = formatter.format(beginOfDate);
        //将设置的时间赋值给endTime
        String endTime = newformatter.format(newData);
        map.put("startTime", startTime);//将当天0.0.0的时间存到map中
        map.put("endTime", endTime);//将第二天0.0.0的时间存到map中
        return map;
    }

    /**
     * 获取昨天的时间
     * 起始时间 和 结束时间
     *
     * @return 戴辆
     */
    public Map<String, String> yesterdayTime() {
        //创建map函数用来存储和操作数据
        Map<String, String> map = new HashMap<String, String>();
        Calendar cal = Calendar.getInstance();
        //在当前时间-1
        cal.set(cal.get(Calendar.YEAR), cal.get(Calendar.MONTH), cal.get(Calendar.DAY_OF_MONTH) - 1, 0, 0, 0);
        //获取当前的时间
        Date beginOfDate = cal.getTime();
        //设置时间的格式为yyyy-MM-dd HH:mm:ss
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        //在当前日期下+1
        cal.set(cal.get(Calendar.YEAR), cal.get(Calendar.MONTH), cal.get(Calendar.DAY_OF_MONTH) + 1, 0, 0, 0);
        //获取当前的时间
        Date newData = cal.getTime();
        //设置时间的格式为yyyy-MM-dd HH:mm:ss
        SimpleDateFormat newformatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        //将设置的时间赋值给startTime
        String startTime = formatter.format(beginOfDate);
        //将设置的时间赋值给endTime
        String endTime = newformatter.format(newData);
        map.put("startTime", startTime);//将当天0.0.0的时间存到map中
        map.put("endTime", endTime);//将第二天0.0.0的时间存到map中
        return map;
    }

    /**
     * 获取每周的时间
     * 起始时间 和 结束时间
     *
     * @return 戴辆
     */
    public Map<String, String> weeklyTime() {
        //创建map函数用来存储和操作数据
        Map<String, String> map = new HashMap<String, String>();
        //将这一周第一天的时间存到map中
        map.put("startTime", getFirstDayOfWeek());
        //将这一周最后一天的时间存到map中
        map.put("endTime", getLastDayOfWeek());
        return map;
    }

    /**
     * 获取每月的时间
     * 起始时间 和 结束时间
     *
     * @return
     */
    public Map<String, String> Monthly() {
        //创建map函数来存储时间
        Map<String, String> map = new HashMap<String, String>();
        map.put("startTime", getFirsDayOfMonthly());//将起始时间存到map函数中
        map.put("endTime", getLastDayOfMonthly());//将结束时间存到map函数中
        return map;//将map函数返回出去
    }

    /**
     * 获取每年的时间
     * 起始时间 和 结束时间
     *
     * @return 戴辆
     */
    public Map<String, String> Year() {
        //创建map函数来存储时间
        Map<String, String> map = new HashMap<String, String>();
        map.put("startTime", getFirsDayOfYear());//将这一年的起始时间存到map函数中
        map.put("endTime", getLastDayOfYear());//将这个一年的结束时间存到map函数中
        return map;//将map函数返回出去
    }

    /**
     * 获取当前的时间
     *
     * @return 戴辆
     */
    public Map<String, String> Time() {
        //创建map函数用来存储时间
        Map<String, String> map = new HashMap<String, String>();
        map.put("Time", getCurrent());
        return map;
    }

    /**
     * 传入对应的月份 返回对应的时间段
     *
     * @param monthly 月份
     * @return 戴辆
     */
    public Map<String, String> appointMonthly(Integer monthly) {
        //设计日期的格式
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        //创建map函数用来存储数据
        Map<String, String> map = new HashMap<String, String>();
        //用户获取电脑当前的时间
        Calendar cal = Calendar.getInstance();
        //创建两个参数 一个用户获取当前是多少年，一个用来接受传进来的月数
        int year = cal.get(Calendar.YEAR), month = monthly;
        //用一个date来接受返回的起始时间
        Date beginTime = getBeginTime(year, month);
        map.put("startTime", sdf.format(beginTime));//将起始时间存到map中
        //用一个date来接受返回的结束时间
        Date endTime = getEndTime(year, month);
        map.put("endTime", sdf.format(endTime));//将结束时间存到map中
        return map;//将数据返回出去
    }

    /**
     * 获取这一周第一天的时间
     *
     * @return 戴辆
     */
    public static String getFirstDayOfWeek() {
        //创建date来获取时间
        Date date = new Date();
        // 设置时间的格式为yyyy-MM-dd HH:mm:ss
        SimpleDateFormat newformatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        // 获取指定的时间点
        Calendar cal = Calendar.getInstance();
        try {
            // 获取当前的时间
            cal.setTime(date);
            // 取出这周的第二天的时间，星期日为第一天，星期一是第二天
            cal.set(Calendar.DAY_OF_WEEK, 2);
            // 将当天的时间重新规划成00:00:00
            cal.set(cal.get(Calendar.YEAR), cal.get(Calendar.MONTH), cal.get(Calendar.DAY_OF_MONTH), 0, 0, 0);
        } catch (Exception e) {
            // 出现异常的时候 报错
            e.printStackTrace();
        }
        // 将当前获取的时间返回
        return newformatter.format(cal.getTime());
    }

    /**
     * 获取这一周最后一天的时间
     *
     * @return 戴辆
     */
    public static String getLastDayOfWeek() {
        //创建date函数来获取时间
        Date date = new Date();
        // 设置时间的格式为yyyy-MM-dd HH:mm:ss
        SimpleDateFormat newformatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        // 获取指定的时间点
        Calendar cal = Calendar.getInstance();
        try {
            // 获取当前的时间
            cal.setTime(date);
            // 取出这周的第二天的时间，星期日为第二天，星期一十第二天
            cal.set(Calendar.DAY_OF_WEEK, 2);
            // 在当前日期的时间上加6为，这周的最后一天
            cal.set(Calendar.DATE, cal.get(Calendar.DATE) + 6);
            // 将最后一天+1的时间设置成00:00:00
            cal.set(cal.get(Calendar.YEAR), cal.get(Calendar.MONTH), cal.get(Calendar.DAY_OF_MONTH) + 1, 0, 0, 0);
        } catch (Exception e) {
            // 出现异常的时候 报错
            e.printStackTrace();
        }
        // 将当前获取的时间返回
        return newformatter.format(cal.getTime());
    }

    /**
     * 查询这个月的第一天是哪一天
     *
     * @return
     */
    public static String getFirsDayOfMonthly() {
        // 获取当前年份、月份、日期
        Calendar cal = Calendar.getInstance();
        // 获取当月的第一天
        SimpleDateFormat formatTemp = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        // 获取当前月的第一天
        cal = Calendar.getInstance();
        //将当前天数设置为1
        cal.add(Calendar.MONTH, 0);
        //用户获得这一天是这个月的第几天
        cal.set(Calendar.DAY_OF_MONTH, 1);
        // 将日期的格式设置成00:00:00
        cal.set(cal.get(Calendar.YEAR), cal.get(Calendar.MONTH), cal.get(Calendar.DAY_OF_MONTH), 00, 00, 00);
        String firstday = formatTemp.format(cal.getTime());
        //返回结果
        return firstday;

    }

    /**
     * 查询这个月的最后一天是哪一天
     *
     * @return
     */
    public static String getLastDayOfMonthly() {
        // 获取当前年份、月份、日期
        Calendar cal = Calendar.getInstance();
        // 设置日期的编码格式
        SimpleDateFormat formatTemp = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        // 获取当前月的最后一天
        cal.add(Calendar.MONTH, 1);
        //用户获得这一天是这个月的第几天
        cal.set(Calendar.DAY_OF_MONTH, 0);
        // 将日期的格式设置成23:59:59
        cal.set(cal.get(Calendar.YEAR), cal.get(Calendar.MONTH), cal.get(Calendar.DAY_OF_MONTH), 23, 59, 59);
        // 将时间转换成string格式接受
        String lastday = formatTemp.format(cal.getTime());
        // 返回结果
        return lastday;
    }

    /**
     * 获取这一年的第一天的时间
     *
     * @return 戴辆
     */
    public static String getFirsDayOfYear() {
        // 获取当前年份、月份、日期
        Calendar cal = Calendar.getInstance();
        // 获取当前年份是多少
        int currentYear = cal.get(Calendar.YEAR);
        cal.clear();
        cal.set(Calendar.YEAR, currentYear);
        Date currYearFirst = cal.getTime();
        // 设置日期的编码格式
        SimpleDateFormat formatTemp = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        // 将数据返回出去
        return formatTemp.format(currYearFirst);
    }

    /**
     * 获取这一年的最后一天的时间
     *
     * @return 戴辆
     */
    public static String getLastDayOfYear() {
        // 获取当前年份、月份、日期
        Calendar cal = Calendar.getInstance();
        // 设置日期的编码格式
        SimpleDateFormat formatTemp = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        // 获取当前的年份是多少
        int currentYear = cal.get(Calendar.YEAR);
        // 此方法设置此Calendar的所有日历字段值和时间值（毫秒从历元至偏移量）未定义。
        cal.clear();
        // 根据年份日期设置函数
        cal.set(Calendar.YEAR, currentYear);
        // 将日期的格式设置成23:59:59
        cal.set(cal.get(Calendar.YEAR), cal.get(Calendar.MONTH), cal.get(Calendar.DAY_OF_MONTH), 23, 59, 59);
        // 获取新的一年的最后一天-1天就是最后一年
        cal.roll(Calendar.DAY_OF_YEAR, -1);
        Date currYearLast = cal.getTime();
        // 将数据返回出去
        return formatTemp.format(currYearLast);
    }

    /**
     * 获取当前的时间
     *
     * @return 戴辆
     */
    public static String getCurrent() {
        Date date = new Date();
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//设置日期格式
        return df.format(date);
    }

    /**
     * 获取对应月数的起始时间
     *
     * @param year  年份
     * @param month 月数
     * @return 戴辆
     */
    public static Date getBeginTime(int year, int month) {
        YearMonth yearMonth = YearMonth.of(year, month);
        LocalDate localDate = yearMonth.atDay(1);
        LocalDateTime startOfDay = localDate.atStartOfDay();
        ZonedDateTime zonedDateTime = startOfDay.atZone(ZoneId.of("Asia/Shanghai"));
        return Date.from(zonedDateTime.toInstant());
    }

    /**
     * 获取对应月数的结束时间
     *
     * @param year  年份
     * @param month 月份
     * @return 戴辆
     */
    public static Date getEndTime(int year, int month) {
        YearMonth yearMonth = YearMonth.of(year, month);
        LocalDate endOfMonth = yearMonth.atEndOfMonth();
        LocalDateTime localDateTime = endOfMonth.atTime(23, 59, 59, 999);
        ZonedDateTime zonedDateTime = localDateTime.atZone(ZoneId.of("Asia/Shanghai"));
        return Date.from(zonedDateTime.toInstant());
    }
}
