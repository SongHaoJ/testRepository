/*
package com.bean.util;

import java.security.MessageDigest;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

import com.bean.model.DbShop;
public class Sys {

    public static int interval = 1000 * 60 * 60 * 3;
    public static HashMap<String, String> expresstypeJoom = new HashMap<String, String>();
    public static HashMap<String, DbShop> shopMap = new HashMap<String, DbShop>();
    public static String getMD5(String text, String encoding) throws Exception {
        if(text == null){
            return "";
        }else{
            StringBuffer hexString = new StringBuffer();
            try{

                MessageDigest md = MessageDigest.getInstance("MD5");
                md.update(text.getBytes(encoding));

                byte[] digest = md.digest();

                for(int i = 0;i <digest.length;i++){
                    text = Integer.toHexString(0xFF&digest[i]);
                    if(text.length()<2){
                        text = "0"+text;
                    }
                    hexString.append(text);
                }
            }catch(Exception e){
                return "";
            }
            return hexString.toString();
        }
    }

    public static String getYearMonth() {
        Calendar dt = Calendar.getInstance();
        dt.setTime(new Date());
        String tmp = String.valueOf(dt.get(Calendar.YEAR));
        int m = dt.get(Calendar.MONTH) + 1;
        String mm = "";
        if (m < 10)
            mm += "0";
        mm += String.valueOf(m);
        return tmp + mm;
    }

    public static String convertL2Date(long longDt) {
        Calendar dt = Calendar.getInstance();
        dt.setTime(new Date(longDt));
        String tmp = String.valueOf(dt.get(Calendar.YEAR));
        int m = dt.get(Calendar.MONTH) + 1;
        String mm = "";
        if (m < 10)
            mm += "0";
        mm += String.valueOf(m);

        int day = dt.get(Calendar.DAY_OF_MONTH);
        String dd = "";
        if (day < 10)
            dd += "0";
        dd += String.valueOf(day);

        int h = dt.get(Calendar.HOUR_OF_DAY);
        String hh = "";
        if (h < 10)
            hh += "0";
        hh += String.valueOf(h);

        int min = dt.get(Calendar.MINUTE);
        String minute = "";
        if (min < 10)
            minute += "0";
        minute += String.valueOf(min);

        int s = dt.get(Calendar.SECOND);
        String ss = "";
        if (s < 10)
            ss += "0";
        ss += String.valueOf(s);

        return tmp + "-" + mm + "-" + dd + " " + hh + ":" + minute;
    }

    public static String convertL2YYMMDDHHMM(long longDt) {
        Calendar dt = Calendar.getInstance();
        dt.setTime(new Date(longDt));
        String tmp = String.valueOf(dt.get(Calendar.YEAR));
        int m = dt.get(Calendar.MONTH) + 1;
        String mm = "";
        if (m < 10)
            mm += "0";
        mm += String.valueOf(m);

        int day = dt.get(Calendar.DAY_OF_MONTH);
        String dd = "";
        if (day < 10)
            dd += "0";
        dd += String.valueOf(day);

        int h = dt.get(Calendar.HOUR_OF_DAY);
        String hh = "";
        if (h < 10)
            hh += "0";
        hh += String.valueOf(h);

        int min = dt.get(Calendar.MINUTE);
        String minute = "";
        if (min < 10)
            minute += "0";
        minute += String.valueOf(min);

        int s = dt.get(Calendar.SECOND);
        String ss = "";
        if (s < 10)
            ss += "0";
        ss += String.valueOf(s);

        return tmp + mm + dd + hh + minute;
    }

    public static String getCtime() {
        Calendar dt = Calendar.getInstance();
        dt.setTime(new Date());
        String tmp = String.valueOf(dt.get(Calendar.YEAR));
        int m = dt.get(Calendar.MONTH) + 1;
        String mm = "";
        if (m < 10)
            mm += "0";
        mm += String.valueOf(m);

        int d = dt.get(Calendar.DAY_OF_MONTH);
        String dd = "";
        if (d < 10)
            dd += "0";
        dd += String.valueOf(d);

        int h = dt.get(Calendar.HOUR_OF_DAY);
        String hh = "";
        if (h < 10)
            hh += "0";
        hh += String.valueOf(h);

        int min = dt.get(Calendar.MINUTE);
        String minute = "";
        if (min < 10)
            minute += "0";
        minute += String.valueOf(min);

        int s = dt.get(Calendar.SECOND);
        String ss = "";
        if (s < 10)
            ss += "0";
        ss += String.valueOf(s);

        return tmp + mm + dd + hh + minute + ss;
    }

    public static String getCtime2() {//返回类似2008-3-13 15:51:23
        Calendar dt = Calendar.getInstance();
        dt.setTime(new Date());
        String tmp = String.valueOf(dt.get(Calendar.YEAR));
        int m = dt.get(Calendar.MONTH) + 1;
        String mm = "";
        mm += String.valueOf(m);

        int d = dt.get(Calendar.DAY_OF_MONTH);
        String dd = "";
        dd += String.valueOf(d);

        int h = dt.get(Calendar.HOUR_OF_DAY);
        String hh = "";
        hh += String.valueOf(h);

        int min = dt.get(Calendar.MINUTE);
        String minute = "";
        minute += String.valueOf(min);

        int s = dt.get(Calendar.SECOND);
        String ss = "";
        ss += String.valueOf(s);

        return tmp + "-" + mm + "-" + dd + " " + hh + ":" + minute + ":" + ss;
    }

    public static String getDate(Date mydate) {//返回类似2008-3-13 15:51:23
        Calendar dt = Calendar.getInstance();
        dt.setTime(mydate);
        String tmp = String.valueOf(dt.get(Calendar.YEAR));
        int m = dt.get(Calendar.MONTH) + 1;
        String mm = "";
        mm += String.valueOf(m);

        int d = dt.get(Calendar.DAY_OF_MONTH);
        String dd = "";
        dd += String.valueOf(d);

        int h = dt.get(Calendar.HOUR_OF_DAY);
        String hh = "";
        hh += String.valueOf(h);

        int min = dt.get(Calendar.MINUTE);
        String minute = "";
        minute += String.valueOf(min);

        int s = dt.get(Calendar.SECOND);
        String ss = "";
        ss += String.valueOf(s);

        return tmp + "-" + mm + "-" + dd;
    }

    public static String getCtime3() {//返回类似2008-3-13 15:51
        Calendar dt = Calendar.getInstance();
        dt.setTime(new Date());
        String tmp = String.valueOf(dt.get(Calendar.YEAR));
        int m = dt.get(Calendar.MONTH) + 1;
        String mm = "";
        mm += String.valueOf(m);

        int d = dt.get(Calendar.DAY_OF_MONTH);
        String dd = "";
        dd += String.valueOf(d);

        int h = dt.get(Calendar.HOUR_OF_DAY);
        String hh = "";
        hh += String.valueOf(h);

        int min = dt.get(Calendar.MINUTE);
        String minute = "";
        minute += String.valueOf(min);

        int s = dt.get(Calendar.SECOND);
        String ss = "";
        ss += String.valueOf(s);
        if (mm.length() <= 1) {
            mm = "0" + mm;
        }
        if (dd.length() <= 1) {
            dd = "0" + dd;
        }
        if (minute.length() <= 1) {
            minute = "0" + minute;
        }

        return tmp + "-" + mm + "-" + dd + " " + hh + ":" + minute;
    }

    public static String getDateLate(int days) {//获取当前日期days后的日期
        Calendar dt = Calendar.getInstance();
        dt.setTime(new Date());
        dt.add(Calendar.DAY_OF_MONTH, days);
        String tmp = String.valueOf(dt.get(Calendar.YEAR));
        int m = dt.get(Calendar.MONTH) + 1;
        String mm = "";
        if (m < 10)
            mm += "0";
        mm += String.valueOf(m);

        int d = dt.get(Calendar.DAY_OF_MONTH);
        String dd = "";
        if (d < 10)
            dd += "0";
        dd += String.valueOf(d);

        return tmp + mm + dd;
    }

    public static String getYYYYMMDD() {
        Calendar dt = Calendar.getInstance();
        dt.setTime(new Date());
        String tmp = String.valueOf(dt.get(Calendar.YEAR));
        int m = dt.get(Calendar.MONTH) + 1;
        String mm = "";
        if (m < 10)
            mm += "0";
        mm += String.valueOf(m);

        int d = dt.get(Calendar.DAY_OF_MONTH);
        String dd = "";
        if (d < 10)
            dd += "0";
        dd += String.valueOf(d);

        return tmp + mm + dd;
    }

    public static String getDateLateMMdd(int days) {//获取当前日期days后的日期
        Calendar dt = Calendar.getInstance();
        dt.setTime(new Date());
        dt.add(Calendar.DAY_OF_MONTH, days);
        int m = dt.get(Calendar.MONTH) + 1;
        String mm = "";
        if (m < 10)
            mm += "0";
        mm += String.valueOf(m);

        int d = dt.get(Calendar.DAY_OF_MONTH);
        String dd = "";
        if (d < 10)
            dd += "0";
        dd += String.valueOf(d);

        return mm + dd;
    }

    public static String getHHMMSS() {
        Calendar dt = Calendar.getInstance();
        dt.setTime(new Date());

        int h = dt.get(Calendar.HOUR_OF_DAY);
        String hh = "";
        if (h < 10)
            hh += "0";
        hh += String.valueOf(h);

        int min = dt.get(Calendar.MINUTE);
        String minute = "";
        if (min < 10)
            minute += "0";
        minute += String.valueOf(min);

        int s = dt.get(Calendar.SECOND);
        String ss = "";
        if (s < 10)
            ss += "0";
        ss += String.valueOf(s);

        return hh + ":" + minute + ":" + ss;
    }

    public static String convertDtFormat(String strDt) {
        StringTokenizer st = new StringTokenizer(strDt, "-");
        String[] actions = new String[5];
        int i = 0;
        while (st.hasMoreElements() && i < 5) {
            actions[i++] = st.nextToken().trim();
        }
        if (actions.length < 3)
            return Sys.getYYYYMMDD();

        if (Integer.valueOf(actions[1]).intValue() < 10)
            actions[1] = "0" + actions[1];
        if (Integer.valueOf(actions[2]).intValue() < 10)
            actions[2] = "0" + actions[2];

        return actions[0] + actions[1] + actions[2];
    }

    public static String cCheckMobile(String mobile) {
        String flag = "ok";
        int slen = mobile.length();
        if (slen != 11) {
            return "用户号码位数不对";
        }
        if (!Sys.isDigit(mobile)) {
            return "用户号码含非数字的字符";
        }
        //		String str3 = mobile.substring(0,3);
        if (mobile.startsWith("130") == true
                || mobile.startsWith("131") == true
                || mobile.startsWith("132") == true
                || mobile.startsWith("155") == true
                || mobile.startsWith("156") == true
                || mobile.startsWith("186") == true) {//如果是前三位
            return "ok";
        } else {
            return "该号码不是联通手机用户";
        }
    }

    public static boolean isNull(String str) {//判定是否为空值
        //		System.out.println("!!!");
        if (null == str || str.length() <= 0 || str.equals("null")) {
            return true;
        }
        return false;
    }

    public static boolean isNull(Double str) {//判定是否为空值
        //		System.out.println("!!!");
        if (null == str || str.equals("null")) {
            return true;
        }
        return false;
    }

    public static boolean isNotNull(String str) {//判定是否为空值
        //      System.out.println("!!!");
        if (null == str || str.length() <= 0 || str.equals("null")) {
            return false;
        }
        return true;
    }

    public static String isCheckNull(String str) {//判定是否为空值
        //      System.out.println("!!!");
        if (null == str || str.length() <= 0 || str.equals("null") || str.equals("NULL")) {
            return "";
        }
        str = str.trim();
        return str;
    }

    public static String isCheckNull2(String str) {//判定是否为空值,如果是空，则返回一个空格
        //      System.out.println("!!!");
        if (null == str || str.length() <= 0 || str.equals("null") || str.equals("NULL")) {
            return " ";
        }
        return str;
    }

    public static Double isCheckNull(Double str) {//判定是否为空值
        //      System.out.println("!!!");
        if (null == str) {
            return 0D;
        }
        return str;
    }

    public static Long isCheckNull(Long str) {//判定是否为空值
        //      System.out.println("!!!");
        if (null == str) {
            return 0L;
        }
        return str;
    }

    public static Integer isCheckNull(Integer str) {//判定是否为空值
        //      System.out.println("!!!");
        if (null == str) {
            return 0;
        }
        return str;
    }

    public static String checkPayDay(String stock1) {
        String flag = "ok";
        //System.out.println(stock1);
        int slen = stock1.length();
        if (slen != 8) {
            return "日期位数不对:" + stock1 + "</b>";
        }
        if (Integer.parseInt(stock1.substring(4, 6)) > 12) {
            return "月份输入有误:" + stock1 + "</b>";
        }
        if (Integer.parseInt(stock1.substring(6, 8)) > 31
                || stock1.substring(4, 8).equals("0230")
                || stock1.substring(4, 8).equals("0231")
                || stock1.substring(4, 8).equals("0431")
                || stock1.substring(4, 8).equals("0631")
                || stock1.substring(4, 8).equals("0931")
                || stock1.substring(4, 8).equals("1131"))
            return "日期输入有误:" + stock1 + "</b>";

        for (int j = 0; j < slen; j++) {
            String word = stock1.substring(j, j + 1);
            if (word.equals("0") == true || word.equals("1") == true
                    || word.equals("2") == true || word.equals("3") == true
                    || word.equals("4") == true || word.equals("5") == true
                    || word.equals("6") == true || word.equals("7") == true
                    || word.equals("8") == true || word.equals("9") == true) {
                //flag="ok";
            } else {
                return "日期含非数字的字符";
            }
        }
        return "ok";
    }

    public static String getTimeStr(String timestr) {//返回时间格式
        if (timestr == null) {
            timestr = "";
        }
        if (timestr.length() == 8) {//如果是8位的时间
            return timestr.substring(0, 4) + "-" + timestr.substring(4, 6)
                    + "-" + timestr.substring(6);
        } else if (timestr.length() == 14) {
            return timestr.substring(0, 4) + "-" + timestr.substring(4, 6)
                    + "-" + timestr.substring(6, 8) + " "
                    + timestr.substring(8, 10) + ":"
                    + timestr.substring(10, 12) + ":"
                    + timestr.substring(12, 14);
        } else if (timestr.length() == 12) {//如果是12位时间
            return timestr.substring(0, 4) + "-" + timestr.substring(4, 6)
                    + "-" + timestr.substring(6, 8) + " "
                    + timestr.substring(8, 10) + ":"
                    + timestr.substring(10, 12);
        } else {
            return timestr;
        }
    }

    public static boolean isDigit(String Str) {//判断是否为数字
        for (int i = 0; i < Str.length(); i++) {
            if (!Character.isDigit(Str.charAt(i)))
                return false;

        }
        return true;

    }
    //生成6位随机数
    public static String getRand() {
        //String ASCII = "AB2C3D4E5F6G7H8J9KLM2N34P5R6S7T8U9VWX2Y3Z4A5B6C7D8E9F";
        String ASCII = "1234567890";
        Date d = new Date();
        long lseed = d.getTime();
        Random r = new Random(lseed); // 设置随机种子
        StringBuffer str = new StringBuffer();
        for (int i = 0; i < 6; i++) {
            int index = r.nextInt(100);
            index = index % ASCII.length();
            char c = ASCII.charAt(index);
            str.append(c); // 生成随机数字
        }
        String rand = str.toString();
        return rand;

    }
    //生成num位随机数
    public static String getRand(int num) {
        if(num<= 0){num = 6;}
        //String ASCII = "AB2C3D4E5F6G7H8J9KLM2N34P5R6S7T8U9VWX2Y3Z4A5B6C7D8E9F";
        String ASCII = "1234567890";
        Date d = new Date();
        long lseed = d.getTime();
        Random r = new Random(lseed); // 设置随机种子
        StringBuffer str = new StringBuffer();
        for (int i = 0; i < num; i++) {
            int index = r.nextInt(100);
            index = index % ASCII.length();
            char c = ASCII.charAt(index);
            str.append(c); // 生成随机数字
        }
        String rand = str.toString();
        return rand;

    }
    //获取stime晚hours小时后的时间
    public static Date getTimeAfterHours(Date time1,int hoursdiff){
        try{
            Calendar time2 = Calendar.getInstance();
            time2.setTime(time1);
            time2.add(Calendar.HOUR_OF_DAY, hoursdiff);
            return time2.getTime();
        }catch(Exception e){
            return new Date();
        }
    }

    public static Date TransStrToDate(String timestr) {//将14位字符串时间转成Date类型
        SimpleDateFormat df = new SimpleDateFormat("yyyyMMddHHmmss");
        Date mydate = new Date();
        try {
            mydate = df.parse(timestr);
        } catch (Exception ex) {
            ;
        }
        return mydate;
    }

    public static String str2YMD(String strdt) {
        if (null == strdt)
            return "";
        if (strdt.length() < 14)
            return strdt;
        int[] formatlen = { 4, 2, 2, 2, 2, 2 };
        String[] unit = { "年", "月", "日", "时", "分", "秒" };
        String tmp = strdt, result = "";
        if (tmp.length() > 14)
            tmp = tmp.substring(0, 14);
        int len = tmp.length();
        for (int i = 0; i < formatlen.length && 0 < len; i++) {
            int index = formatlen[i] <= len ? formatlen[i] : len;
            String dt = tmp.substring(0, index);
            result += dt + unit[i];
            tmp = tmp.substring(index, tmp.length());
            len = tmp.length();
        }
        return result;
    }

    public static String str2YM(String strdt) {
        if (null == strdt)
            return "";
        if (strdt.length() < 6)
            return strdt;
        int[] formatlen = { 4, 2 };
        String[] unit = { "年", "月" };
        String tmp = strdt, result = "";
        if (tmp.length() > 6)
            tmp = tmp.substring(0, 6);
        int len = tmp.length();
        for (int i = 0; i < formatlen.length && 0 < len; i++) {
            int index = formatlen[i] <= len ? formatlen[i] : len;
            String dt = tmp.substring(0, index);
            result += dt + unit[i];
            tmp = tmp.substring(index, tmp.length());
            len = tmp.length();
        }
        return result;
    }

    public static String str2date(String strdt) {
        if (null == strdt)
            return "";
        if (strdt.length() < 14)
            return strdt;
        int[] formatlen = { 4, 2, 2, 2, 2, 2 };
        String[] unit = { "/", "/", " ", ":", ":", " " };
        String tmp = strdt, result = "";
        if (tmp.length() > 14)
            tmp = tmp.substring(0, 14);
        int len = tmp.length();
        for (int i = 0; i < formatlen.length && 0 < len; i++) {
            int index = formatlen[i] <= len ? formatlen[i] : len;
            String dt = tmp.substring(0, index);
            result += dt + unit[i];
            tmp = tmp.substring(index, tmp.length());
            len = tmp.length();
        }
        return result;
    }

    static public String NullAs(String strSrc, String stead) {

        return (null == strSrc || strSrc.equals("") || strSrc
                .equalsIgnoreCase("NULL")) ? stead : strSrc;
    }

    public static String DateAdd(int field, int amonnt) {//取得给定日历字段添加或减去指定的时间量
        Calendar cal = Calendar.getInstance();
        cal.setTime(new Date());
        cal.add(field, amonnt);
        int y = cal.get(Calendar.YEAR);
        int d = cal.get(Calendar.DAY_OF_MONTH);
        int m = cal.get(Calendar.MONTH) + 1;
        String yy = String.valueOf(y);
        String mm = "";
        if (m < 10)
            mm += "0";
        mm += String.valueOf(m);
        String dd = "";
        if (d < 10)
            dd += "0";
        dd += String.valueOf(d);
        return yy + mm + dd;
    }

    public static String DateFristDay(int field, int amonnt) {//取得给定日历字段添加或减去指定的时间量,能为出某月的1号;如,20070101
        Calendar cal = Calendar.getInstance();
        Calendar calPayDay = (Calendar) cal.clone(); //复制实例
        Calendar calThisMonth = (Calendar) cal.clone(); //复制实例
        calThisMonth.setTime(new Date());
        int tm = calThisMonth.get(Calendar.MONTH) + 1; //得到未经过计算的当月月份
        //      System.out.print(tm);
        calPayDay.setTime(new Date());
        calPayDay.add(field, amonnt);
        int y = calPayDay.get(Calendar.YEAR);
        int d = calPayDay.get(Calendar.DAY_OF_MONTH);
        int m = calPayDay.get(Calendar.MONTH) + 1; //经过计算的月份
        String yy = String.valueOf(y);
        String mm = "";
        if (m < 10)
            mm += "0";
        mm += String.valueOf(m);
        String dd = "";
        if (d < 10)
            dd += "0";
        dd += String.valueOf(d);
        //	    System.out.print(m);
        //	    System.out.print("------");
        if (String.valueOf(tm).equals(String.valueOf(m))) { //月份比对,返回相应的结果值
            return yy + mm + dd;
        } else {
            return String.valueOf(y) + mm + "01";
        }
    }

    public static java.sql.Timestamp StringToDate(String StringDate) {
        if (StringDate == null) {
            return null;
        }
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date d = null;
        try {
            d = df.parse(StringDate);
        } catch (ParseException e) {
        }

        Calendar calendar = Calendar.getInstance();
        calendar.setTime(d);

        java.sql.Timestamp date = new java.sql.Timestamp(calendar
                .getTimeInMillis());

        return date;
    }

    public static Date stringToDate(String StringDate) {
        if (StringDate == null) {
            return null;
        }
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date d = null;
        try {
            d = df.parse(StringDate);
        } catch (ParseException e) {
            ;
        }
        return d;
    }

    public static java.sql.Timestamp StringToDate1(String StringDate) {
        if (StringDate == null) {
            return null;
        }
        DateFormat df = new SimpleDateFormat("MM/dd/yyyy HH:mm:ss");
        Date d = null;
        try {
            d = df.parse(StringDate);
        } catch (ParseException e) {
        }

        Calendar calendar = Calendar.getInstance();
        calendar.setTime(d);

        java.sql.Timestamp date = new java.sql.Timestamp(calendar
                .getTimeInMillis());

        return date;
    }
    public static String date2str6(Date aDate) {
        if (aDate == null)
            return "";

        SimpleDateFormat theFormat = new SimpleDateFormat("yyyyMMdd");
        return theFormat.format(aDate);
    }

    public static String time2str6(Date aDate) {
        if (aDate == null)
            return "";

        SimpleDateFormat theFormat = new SimpleDateFormat("HHmmss");
        return theFormat.format(aDate);
    }

    public static String date2str(Date aDate) {
        if (aDate == null)
            return "";

        SimpleDateFormat theFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        return theFormat.format(aDate);
    }
    public static String date2strCN(Date aDate) {
        if (aDate == null)
            return "";

        SimpleDateFormat theFormat = new SimpleDateFormat("yyyy年MM月dd日HH时mm分ss");
        return theFormat.format(aDate);
    }

    public static String date2str14(Date aDate) {
        if (aDate == null)
            return "";

        SimpleDateFormat theFormat = new SimpleDateFormat("yyyyMMddHHmmss");
        return theFormat.format(aDate);
    }
    public static String date2strMis(Date aDate) {
        if (aDate == null)
            return "";

        SimpleDateFormat theFormat = new SimpleDateFormat("yyyyMMddHHmmssSSS");
        return theFormat.format(aDate);
    }

    public static String dataToString(Date theDate) {
        DateFormat df = new SimpleDateFormat("yyyyMMdd");
        return df.format(theDate);
    }

    public static String dataToString2(Date theDate) {
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        if (theDate == null) {
            theDate = new Date();
        }
        return df.format(theDate);
    }

    public static String getDateBefore(String date, int days){//获取指定日期days后的日期
        String result = "";
        try{
            Calendar dt = Calendar.getInstance();
            String pattern = "MMdd";
            if (date.length() == 8)
                pattern = "yyyyMMdd";
            SimpleDateFormat formater = new SimpleDateFormat(pattern);
            //		String str2 = "2003-10-18 13:15:45";
            Date date2 = formater.parse(date);

            dt.setTime(date2);
            dt.add(Calendar.DAY_OF_MONTH, -days);
            int m = dt.get(Calendar.MONTH) + 1;
            String mm = "";
            if (m < 10)
                mm += "0";
            mm += String.valueOf(m);
            int d = dt.get(Calendar.DAY_OF_MONTH);
            String dd = "";
            if (d < 10)
                dd += "0";
            dd += String.valueOf(d);
            String yyyy = ""+dt.get(Calendar.YEAR);
            if (date.length() == 8)
                return yyyy + mm + dd;
            else
                return mm + dd;
        }catch(Exception e){
            result = Sys.getCtime().substring(0,8);
            return result;
        }
    }

    */
/**
     * 添加日志内容
     * @param content 为栏目名称
     * @param operType 为日志类型　１：新增；　２：删除；３修改；４查询
     * @return　
     *//*

    public static String getSysLogContent(String content, Long operType) {

        StringBuffer buf = new StringBuffer();

        if (operType.equals(1L)) {
            buf.append("新增－");
            buf.append(content);
        } else if (operType.equals(2L)) {
            buf.append("删除－");
            buf.append(content);
        } else if (operType.equals(3L)) {
            buf.append("修改－");
            buf.append(content);
        } else if (operType.equals(4L)) {
            buf.append("查询－");
            buf.append(content);
        }

        return buf.toString();

    }

    public static String checkDay(String stock1) {
        String flag = "ok";
        //System.out.println(stock1);
        int slen = stock1.length();
        if (slen != 4) {
            return "日期位数不对:" + stock1;
        }
        if (!Sys.isDigit(stock1))
            return "日期输入有误";
        if (Integer.parseInt(stock1.substring(0, 2)) > 12) {
            return "月份输入有误:" + stock1;
        }
        if (stock1.equals("0230") || stock1.equals("0231")
                || stock1.equals("0431") || stock1.equals("0631")
                || stock1.equals("0931") || stock1.equals("1131"))
            return "日期输入有误:" + stock1;
        return "ok";
    }

    public static String getBeforeYYYYMM(int beforem){//获得beforem月前的日期,如果beforem=0则返回当前月
        Calendar dt = Calendar.getInstance();
        dt.setTime(new Date());
        //dt.add(Calendar.DAY_OF_MONTH,-1);
        dt.add(Calendar.MONTH,-beforem);//提前beforem个月的日期
        String tmp = String.valueOf(dt.get(Calendar.YEAR));
        int m = dt.get(Calendar.MONTH) + 1;
        String mm = "";
        if(m < 10) mm += "0";
        mm += String.valueOf(m);
        */
/*
        int d = dt.get(Calendar.DAY_OF_MONTH);
        String dd = "";
        if(d < 10) dd += "0";
        dd += String.valueOf(d);
        *//*

        //时分秒都用默认的
        return tmp + mm;
    }

    public static String getTimeBeforeMinite(int diffmin){//获得diffmin分钟前的yyyymmddhhmmss
        if(diffmin <= 0){diffmin = 0;}
        Date stime = new Date();
        stime.setMinutes(stime.getMinutes()-diffmin);//提前diffmin分钟

        Calendar dt = Calendar.getInstance();
        dt.setTime(stime);
        String tmp = String.valueOf(dt.get(Calendar.YEAR));
        int m = dt.get(Calendar.MONTH) + 1;
        String mm = "";
        if (m < 10)
            mm += "0";
        mm += String.valueOf(m);

        int d = dt.get(Calendar.DAY_OF_MONTH);
        String dd = "";
        if (d < 10)
            dd += "0";
        dd += String.valueOf(d);

        int h = dt.get(Calendar.HOUR_OF_DAY);
        String hh = "";
        if (h < 10)
            hh += "0";
        hh += String.valueOf(h);

        int min = dt.get(Calendar.MINUTE);
        String minute = "";
        if (min < 10)
            minute += "0";
        minute += String.valueOf(min);

        int s = dt.get(Calendar.SECOND);
        String ss = "";
        if (s < 10)
            ss += "0";
        ss += String.valueOf(s);

        return tmp + mm + dd + hh + minute + ss;
    }

    public static Long dateDiff(Date time1,Date time2){
        SimpleDateFormat df = new SimpleDateFormat( "yyyy-MM-dd" );
        if(time1 == null){time1 = new Date();}
        if(time2 == null){time2 = new Date();}

        Long datediff = 0L;
        try {
            Long DAY = 24L * 60L * 60L * 1000L;
            Date d1 = df.parse(df.format(time1));
            Date d2 = df.parse(df.format(time2));
            datediff = (d1.getTime()-d2.getTime())/DAY;
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return datediff;
    }

    public static String getNexttime(String stime,int hoursdiff){
        String nexttime = null;
        DateFormat df = new SimpleDateFormat("yyyyMMddHHmmss");
        Date d = null;
        try {
            d = df.parse(stime);
        } catch (ParseException e) {
            ;
        }
        d.setTime((d.getTime()/1000 + hoursdiff*60*60)*1000);
        System.out.println(d);
        SimpleDateFormat format1 = new SimpleDateFormat("yyyyMMddHHmmss");
        nexttime = format1.format(d);
        return nexttime;
    }

    public static String transCalendarToString(Calendar dt) {
        if(dt == null){return null;}
        String tmp = String.valueOf(dt.get(Calendar.YEAR));
        int m = dt.get(Calendar.MONTH) + 1;
        String mm = "";
        if (m < 10)
            mm += "0";
        mm += String.valueOf(m);

        int day = dt.get(Calendar.DAY_OF_MONTH);
        String dd = "";
        if (day < 10)
            dd += "0";
        dd += String.valueOf(day);

        int h = dt.get(Calendar.HOUR_OF_DAY);
        String hh = "";
        if (h < 10)
            hh += "0";
        hh += String.valueOf(h);

        int min = dt.get(Calendar.MINUTE);
        String minute = "";
        if (min < 10)
            minute += "0";
        minute += String.valueOf(min);

        int s = dt.get(Calendar.SECOND);
        String ss = "";
        if (s < 10)
            ss += "0";
        ss += String.valueOf(s);

        return tmp + "-" + mm + "-" + dd + " " + hh + ":" + minute;
    }
    //转换Calendar类型为字符串,14位格式为YYYYMMDDHHMMSS
    public static String getTimeFromCalendar(Calendar dt) {
        if(dt == null){return "";}
        String tmp = String.valueOf(dt.get(Calendar.YEAR));
        int m = dt.get(Calendar.MONTH) + 1;
        String mm = "";
        if (m < 10)
            mm += "0";
        mm += String.valueOf(m);

        int day = dt.get(Calendar.DAY_OF_MONTH);
        String dd = "";
        if (day < 10)
            dd += "0";
        dd += String.valueOf(day);

        int h = dt.get(Calendar.HOUR_OF_DAY);
        String hh = "";
        if (h < 10)
            hh += "0";
        hh += String.valueOf(h);

        int min = dt.get(Calendar.MINUTE);
        String minute = "";
        if (min < 10)
            minute += "0";
        minute += String.valueOf(min);

        int s = dt.get(Calendar.SECOND);
        String ss = "";
        if (s < 10)
            ss += "0";
        ss += String.valueOf(s);

        return tmp + mm + dd + hh + minute + "00";
    }

    public static String sortStr(String str) {
        String result = ",";
        try{
            str = str.replace("，", ",");
            while(str.indexOf(",,")>=0){
                str = str.replace(",,", ",");
            }

            if(",".equals(str) == true)return ",";

            if(str.indexOf(",") == 0){
                str = str.substring(1);
            }

            if(str.lastIndexOf(",") == (str.length() -1)){
                str = str.substring(0,str.length()-1);
            }

            if(str.length() > 0){
                String[] strs = str.split(",");
                Arrays.sort(strs);
                for(int i = 0;i < strs.length;i++){
                    if(Sys.isNull(strs[i]) == false){
                        if(result.indexOf(","+strs[i]+",")<0){
                            result = result + strs[i] +",";
                        }else{
                            ;//已存在
                        }
                    }
                }
            }
            if(result.length()>=100){result = result.substring(0,99);}//不超过99字节
        }catch(Exception e){
            ;
        }

        return result;
    }

    //如果遇到@#,则截取第1个@#之前的字符串为sku
    public static String findSku(String sku){
        String result = sku;
        try{
            if(result.lastIndexOf("@#")>=0){
                result = result.substring(0,result.lastIndexOf("@#"));
                if(result.lastIndexOf("@#")>=0){
                    //result = result.substring(result.lastIndexOf("@#")+2);
                    result = result.substring(0,result.indexOf("@#"));
                }
            }
        }catch(Exception e){
            result = sku;
        }

        return result;
    }
    //如果遇到@#,则截取第1个@#之后的字符串为sku(如果后面还有第2个@#,那么取第2个之前的) by qinli 20131222
    public static String findSkuFromMid(String sku){
        String result = sku;
        try{
            if(result.indexOf("@#")>=0){//如果有@#,则截取@#后面的后半部分
                result = result.substring(result.indexOf("@#")+2);
                if(result.indexOf("@#")>=0){//如果截取的后半部分还有@#,则截取后半部分的前半部分
                    result = result.substring(0,result.indexOf("@#"));
                }
                if(result == null || result.length()<=0){//出现这种情况sku可能是ABC@#或ABC@#@#123,如果是这种情况,那sku就等于ABC吧
                    result = sku.substring(0,sku.indexOf("@#"));
                }
            }
        }catch(Exception e){
            result = sku;
        }

        return result;
    }
    //粗略验证是否手机号码
    //基本上就是验证一下telephone串中包含几个数字,如果数字超过6位,那基本可以认定是电话号码
    public static boolean isCheckPhone(String telephone){
        if(Sys.isNull(telephone) == true || telephone.length()<=4){return false;}//如果长度小于等于4位,肯定不是真电话号码
        int originLength = telephone.length();//整个串的个数
        int charLength = 0;//字符的个数
        String tel = telephone;
        try{
            tel = tel.replace("0", "");
            tel = tel.replace("1", "");
            tel = tel.replace("2", "");
            tel = tel.replace("3", "");
            tel = tel.replace("4", "");
            tel = tel.replace("5", "");
            tel = tel.replace("6", "");
            tel = tel.replace("7", "");
            tel = tel.replace("8", "");
            tel = tel.replace("9", "");
        }catch(Exception e){
            return true;//如果出现异常,返回true
        }

        charLength = tel.length();
        if(originLength-charLength>=5){//如果至少包含5个以上的数字,那证明号码可能是真的
            return true;
        }else{
            return false;
        }
    }

    //根据英文国家全称获取国家简称(用于解析Excel文件时将excel文件中的国家改成缩写)
    public static String getCountryCodeFromCountryname(String countryname) {
        if(Sys.isNull(countryname) == true){return "";}
        if(countryname != null && countryname.length()>0){countryname = countryname.toLowerCase();}//转换成小写,便于比较
        if("russian federation".equals(countryname) == true){return "RU";}
        if("sweden".equals(countryname) == true){return "SE";}
        if("sri lanka".equals(countryname) == true){return "LK";}
        if("belarus".equals(countryname) == true){return "BY";}
        if("ireland".equals(countryname) == true){return "IE";}
        if("lithuania".equals(countryname) == true){return "LT";}
        if("bosnia and herzegovina".equals(countryname) == true){return "BA";}
        if("moldova".equals(countryname) == true){return "MD";}
        if("fiji".equals(countryname) == true){return "FJ";}
        if("andorra".equals(countryname) == true){return "AD";}
        if("vietnam".equals(countryname) == true){return "VN";}
        if("espa?a".equals(countryname) == true){return "ES";}
        if("american samoa".equals(countryname) == true){return "AS";}
        if("lettland".equals(countryname) == true){return "LV";}
        if("guam".equals(countryname) == true){return "GU";}
        if("algeria".equals(countryname) == true){return "DZ";}
        if("土耳其".equals(countryname) == true){return "TR";}
        if("großbritannien".equals(countryname) == true){return "GB";}
        if("turkmenistan".equals(countryname) == true){return "TM";}
        if("montenegro".equals(countryname) == true){return "ME";}
        if("ru".equals(countryname) == true){return "RU";}
        if("united states".equals(countryname) == true){return "US";}
        if("ukraine".equals(countryname) == true){return "UA";}
        if("?sterreich".equals(countryname) == true){return "AT";}
        if("luxembourg".equals(countryname) == true){return "LU";}
        if("serbia".equals(countryname) == true){return "RS";}
        if("paraguay".equals(countryname) == true){return "PY";}
        if("tschechische republik".equals(countryname) == true){return "CZ";}
        if("kyrgyzstan".equals(countryname) == true){return "KG";}
        if("ecuador".equals(countryname) == true){return "EC";}
        if("hong kong".equals(countryname) == true){return "HK";}
        if("griechenland".equals(countryname) == true){return "GR";}
        if("taiwan".equals(countryname) == true){return "TW";}
        if("frankreich".equals(countryname) == true){return "FR";}
        if("méxico".equals(countryname) == true){return "MX";}
        if("finlande".equals(countryname) == true){return "FI";}
        if("bermuda".equals(countryname) == true){return "BM";}
        if("spain".equals(countryname) == true){return "ES";}
        if("czech republic".equals(countryname) == true){return "CZ";}
        if("hungary".equals(countryname) == true){return "HU";}
        if("singapore".equals(countryname) == true){return "SG";}
        if("cyprus".equals(countryname) == true){return "CY";}
        if("japan".equals(countryname) == true){return "JP";}
        if("belgium".equals(countryname) == true){return "BE";}
        if("oman".equals(countryname) == true){return "OM";}
        if("united state".equals(countryname) == true){return "US";}
        if("cambodia".equals(countryname) == true){return "KH";}
        if("jordan".equals(countryname) == true){return "JO";}
        if("yemen".equals(countryname) == true){return "YE";}
        if("spanien".equals(countryname) == true){return "ES";}
        if("finnland".equals(countryname) == true){return "FI";}
        if("australien".equals(countryname) == true){return "AU";}
        if("marshall islands".equals(countryname) == true){return "MH";}
        if("uk".equals(countryname) == true){return "GB";}
        if("tanzania".equals(countryname) == true){return "TZ";}
        if("españa".equals(countryname) == true){return "ES";}
        if("russische föderation".equals(countryname) == true){return "RU";}
        if("hongrie".equals(countryname) == true){return "HU";}
        if("norway".equals(countryname) == true){return "NO";}
        if("united kingdom".equals(countryname) == true){return "GB";}
        if("deutschland".equals(countryname) == true){return "DE";}
        if("greece".equals(countryname) == true){return "GR";}
        if("switzerland".equals(countryname) == true){return "CH";}
        if("malaysia".equals(countryname) == true){return "MY";}
        if("slovenia".equals(countryname) == true){return "SI";}
        if("kazakhstan".equals(countryname) == true){return "KZ";}
        if("armenia".equals(countryname) == true){return "AM";}
        if("apo/fpo".equals(countryname) == true){return "AA";}
        if("bolivia".equals(countryname) == true){return "BO";}
        if("greenland".equals(countryname) == true){return "GL";}
        if("belgique".equals(countryname) == true){return "BE";}
        if("norwegen".equals(countryname) == true){return "NO";}
        if("seychelles".equals(countryname) == true){return "SC";}
        if("roumanie".equals(countryname) == true){return "RO";}
        if("au".equals(countryname) == true){return "AU";}
        if("états-unis".equals(countryname) == true){return "US";}
        if("fr".equals(countryname) == true){return "FR";}
        if("germany".equals(countryname) == true){return "DE";}
        if("croatia, republic of".equals(countryname) == true){return "HR";}
        if("mexico".equals(countryname) == true){return "MX";}
        if("india".equals(countryname) == true){return "IN";}
        if("italy".equals(countryname) == true){return "IT";}
        if("france métropolitaine".equals(countryname) == true){return "FR";}
        if("schweiz".equals(countryname) == true){return "CH";}
        if("peru".equals(countryname) == true){return "PE";}
        if("bahrain".equals(countryname) == true){return "BH";}
        if("mauritius".equals(countryname) == true){return "MU";}
        if("suisse".equals(countryname) == true){return "CH";}
        if("nigeria".equals(countryname) == true){return "NG";}
        if("italien".equals(countryname) == true){return "IT";}
        if("virgin islands (u.s.)".equals(countryname) == true){return "VI";}
        if("中国".equals(countryname) == true){return "CN";}
        if("us".equals(countryname) == true){return "US";}
        if("ca".equals(countryname) == true){return "CA";}
        if("dänemark".equals(countryname) == true){return "DK";}
        if("egypt".equals(countryname) == true){return "EG";}
        if("saint lucia".equals(countryname) == true){return "LC";}
        if("niederlande".equals(countryname) == true){return "NL";}
        if("bhutan".equals(countryname) == true){return "BT";}
        if("aruba".equals(countryname) == true){return "AW";}
        if("russie".equals(countryname) == true){return "RU";}
        if("российская федерация".equals(countryname) == true){return "RU";}
        if("denmark".equals(countryname) == true){return "DK";}
        if("finland".equals(countryname) == true){return "FI";}
        if("canada".equals(countryname) == true){return "CA";}
        if("bulgaria".equals(countryname) == true){return "BG";}
        if("brunei darussalam".equals(countryname) == true){return "BN";}
        if("indonesia".equals(countryname) == true){return "ID";}
        if("de".equals(countryname) == true){return "DE";}
        if("argentina".equals(countryname) == true){return "AR";}
        if("uruguay".equals(countryname) == true){return "UY";}
        if("maldives".equals(countryname) == true){return "MV";}
        if("albania".equals(countryname) == true){return "AL";}
        if("qatar".equals(countryname) == true){return "QA";}
        if("usa".equals(countryname) == true){return "US";}
        if("schweden".equals(countryname) == true){return "SE";}
        if("united arab emirates".equals(countryname) == true){return "AE";}
        if("brasilien".equals(countryname) == true){return "BR";}
        if("bangladesh".equals(countryname) == true){return "BD";}
        if("kuwait".equals(countryname) == true){return "KW";}
        if("kroatien".equals(countryname) == true){return "HR";}
        if("slowenien".equals(countryname) == true){return "SI";}
        if("reunion".equals(countryname) == true){return "RE";}
        if("norvège".equals(countryname) == true){return "NO";}
        if("latvija".equals(countryname) == true){return "LV";}
        if("united kindom".equals(countryname) == true){return "GB";}
        if("croatia".equals(countryname) == true){return "HR";}
        if("jamaica".equals(countryname) == true){return "JM";}
        if("slowakei".equals(countryname) == true){return "SK";}
        if("israël".equals(countryname) == true){return "IL";}
        if("thailand".equals(countryname) == true){return "TH";}
        if("puerto rico".equals(countryname) == true){return "PR";}
        if("estonia".equals(countryname) == true){return "EE";}
        if("portugal".equals(countryname) == true){return "PT";}
        if("turkey".equals(countryname) == true){return "TR";}
        if("france".equals(countryname) == true){return "FR";}
        if("romania".equals(countryname) == true){return "RO";}
        if("slovakia".equals(countryname) == true){return "SK";}
        if("malta".equals(countryname) == true){return "MT";}
        if("new zealand".equals(countryname) == true){return "NZ";}
        if("austria".equals(countryname) == true){return "AT";}
        if("chile".equals(countryname) == true){return "CL";}
        if("vereinigte staaten von amerika".equals(countryname) == true){return "US";}
        if("uzbekistan".equals(countryname) == true){return "UZ";}
        if("d?nemark".equals(countryname) == true){return "DK";}
        if("colombia".equals(countryname) == true){return "CO";}
        if("mongolia".equals(countryname) == true){return "MN";}
        if("russische f?deration".equals(countryname) == true){return "RU";}
        if("macau".equals(countryname) == true){return "MO";}
        if("polen".equals(countryname) == true){return "PL";}
        if("guernsey".equals(countryname) == true){return "GG";}
        if("kenya".equals(countryname) == true){return "KE";}
        if("jersey".equals(countryname) == true){return "JE";}
        if("netherlands antilles".equals(countryname) == true){return "AN";}
        if("russia".equals(countryname) == true){return "RU";}
        if("österreich".equals(countryname) == true){return "AT";}
        if("papua new guinea".equals(countryname) == true){return "PG";}
        if("australia".equals(countryname) == true){return "AU";}
        if("israel".equals(countryname) == true){return "IL";}
        if("latvia".equals(countryname) == true){return "LV";}
        if("brazil".equals(countryname) == true){return "BR";}
        if("poland".equals(countryname) == true){return "PL";}
        if("netherlands".equals(countryname) == true){return "NL";}
        if("saudi arabia".equals(countryname) == true){return "SA";}
        if("south africa".equals(countryname) == true){return "ZA";}
        if("azerbaijan republic".equals(countryname) == true){return "AZ";}
        if("korea, south".equals(countryname) == true){return "KR";}
        if("iceland".equals(countryname) == true){return "IS";}
        if("macedonia".equals(countryname) == true){return "MK";}
        if("philippines".equals(countryname) == true){return "PH";}
        if("ungarn".equals(countryname) == true){return "HU";}
        if("georgia".equals(countryname) == true){return "GE";}
        if("el salvador".equals(countryname) == true){return "SV";}
        if("pakistan".equals(countryname) == true){return "PK";}
        if("belgien".equals(countryname) == true){return "BE";}
        if("morocco".equals(countryname) == true){return "MA";}
        if("barbados".equals(countryname) == true){return "BB";}
        if("gibraltar".equals(countryname) == true){return "GI";}
        if("venezuela".equals(countryname) == true){return "VE";}
        if("zambia".equals(countryname) == true){return "ZM";}
        if("costa rica".equals(countryname) == true){return "CR";}
        if("tajikistan".equals(countryname) == true){return "TJ";}
        if("laos".equals(countryname) == true){return "LA";}
        if("ie".equals(countryname) == true){return "IE";}
        if("sa".equals(countryname) == true){return "SA";}
        if(countryname.length()>=8){countryname = countryname.substring(0,8);}
        return countryname.toUpperCase();//如果实在不知道什么国家,就返回全称
    }


    //根据英文国家简称,获取英文国家全称
    public static String getCountry(String countrycode) {
        if(Sys.isNull(countrycode) == true){countrycode = "";}
        if(countrycode != null && countrycode.length()>0){countrycode = countrycode.toUpperCase();}//转换成大写
        if("UK".equals(countrycode) == true){return "united kingdom";}
        if("BL".equals(countrycode) == true){return "palestine";}
        if("BA".equals(countrycode) == true){return "bosnia herzegovina";}
        if("CZ".equals(countrycode) == true){return "czech republic";}
        if("CRO".equals(countrycode) == true){return "the republic of croatia";}
        if("HR".equals(countrycode) == true){return "the republic of croatia";}
        if("GU".equals(countrycode) == true){return "guam";}
        if("MDV".equals(countrycode) == true){return "maldives";}
        if("MV".equals(countrycode) == true){return "maldives";}
        if("ME".equals(countrycode) == true){return "montenegro";}
        if("MNE".equals(countrycode) == true){return "montenegro";}
        if("AA".equals(countrycode) == true){return "united states";}
        if("AN".equals(countrycode) == true){return "antilles";}
        if("MK".equals(countrycode) == true){return "macedonia";}
        if("NC".equals(countrycode) == true){return "new caledonia";}
        if("PF".equals(countrycode) == true){return "french polynesia";}
        if("PM".equals(countrycode) == true){return "saint pierre and miquelon";}
        if("PR".equals(countrycode) == true){return "puerto rico";}
        if("RE".equals(countrycode) == true){return "reunion";}
        if("RS".equals(countrycode) == true){return "serbia";}
        if("SV".equals(countrycode) == true){return "el salvador";}
        if("TT".equals(countrycode) == true){return "trinidad and tobago";}
        if("AE".equals(countrycode) == true){return "unitedemirates";}
        if("AF".equals(countrycode) == true){return "afghanistan";}
        if("AG".equals(countrycode) == true){return "antigua and barbuda";}
        if("AL".equals(countrycode) == true){return "albania";}
        if("AM".equals(countrycode) == true){return "armenia";}
        if("AO".equals(countrycode) == true){return "angola";}
        if("AR".equals(countrycode) == true){return "argentina";}
        if("AT".equals(countrycode) == true){return "austria";}
        if("AU".equals(countrycode) == true){return "australia";}
        if("AZ".equals(countrycode) == true){return "azerbaijan republic";}
        if("BB".equals(countrycode) == true){return "barbados";}
        if("BD".equals(countrycode) == true){return "bangladesh";}
        if("BE".equals(countrycode) == true){return "belgium";}
        if("BF".equals(countrycode) == true){return "burkinafaso";}
        if("BG".equals(countrycode) == true){return "bulgaria";}
        if("BH".equals(countrycode) == true){return "bahrein";}
        if("BI".equals(countrycode) == true){return "burundi";}
        if("BJ".equals(countrycode) == true){return "benin";}
        if("BN".equals(countrycode) == true){return "bruneidarussalam";}
        if("BO".equals(countrycode) == true){return "bolivia";}
        if("BR".equals(countrycode) == true){return "brazil";}
        if("BS".equals(countrycode) == true){return "bahamas";}
        if("BW".equals(countrycode) == true){return "botswana";}
        if("BY".equals(countrycode) == true){return "byelorussia";}
        if("BZ".equals(countrycode) == true){return "belize";}
        if("CA".equals(countrycode) == true){return "canada";}
        if("CF".equals(countrycode) == true){return "centralafrica";}
        if("CG".equals(countrycode) == true){return "congo";}
        if("CH".equals(countrycode) == true){return "switzerland";}
        if("CI".equals(countrycode) == true){return "cote divoire";}
        if("CL".equals(countrycode) == true){return "chile";}
        if("CM".equals(countrycode) == true){return "cameroon";}
        if("CN".equals(countrycode) == true){return "china";}
        if("CO".equals(countrycode) == true){return "colombia";}
        if("CR".equals(countrycode) == true){return "costarica";}
        if("CS".equals(countrycode) == true){return "czechrepubic";}
        if("CU".equals(countrycode) == true){return "cuba";}
        if("CV".equals(countrycode) == true){return "cape verde";}
        if("CY".equals(countrycode) == true){return "cyprus";}
        if("DE".equals(countrycode) == true){return "germany";}
        if("DK".equals(countrycode) == true){return "denmark";}
        if("DO".equals(countrycode) == true){return "dominicanrepublic";}
        if("DZ".equals(countrycode) == true){return "algeria";}
        if("EC".equals(countrycode) == true){return "ecuador";}
        if("EE".equals(countrycode) == true){return "estonia";}
        if("EG".equals(countrycode) == true){return "egypt";}
        if("ES".equals(countrycode) == true){return "spain";}
        if("ET".equals(countrycode) == true){return "ethiopia";}
        if("FI".equals(countrycode) == true){return "finland";}
        if("FJ".equals(countrycode) == true){return "fiji";}
        if("FO".equals(countrycode) == true){return "faroe islands";}
        if("FR".equals(countrycode) == true){return "france";}
        if("GA".equals(countrycode) == true){return "gabon";}
        if("GB".equals(countrycode) == true){return "united kingdom";}
        if("GD".equals(countrycode) == true){return "grenada";}
        if("GE".equals(countrycode) == true){return "georgia";}
        if("GF".equals(countrycode) == true){return "french guiana";}
        if("GH".equals(countrycode) == true){return "ghana";}
        if("GI".equals(countrycode) == true){return "gibraltar";}
        if("GL".equals(countrycode) == true){return "greenland";}
        if("GN".equals(countrycode) == true){return "guinea";}
        if("GP".equals(countrycode) == true){return "guadeloup";}
        if("GR".equals(countrycode) == true){return "greece";}
        if("GT".equals(countrycode) == true){return "guatemala";}
        if("HK".equals(countrycode) == true){return "hongkong";}
        if("HN".equals(countrycode) == true){return "honduras";}
        if("HU".equals(countrycode) == true){return "hungary";}
        if("ID".equals(countrycode) == true){return "indonesia";}
        if("IE".equals(countrycode) == true){return "ireland";}
        if("IL".equals(countrycode) == true){return "israel";}
        if("IN".equals(countrycode) == true){return "india";}
        if("IQ".equals(countrycode) == true){return "iraq";}
        if("IR".equals(countrycode) == true){return "iran";}
        if("IS".equals(countrycode) == true){return "iceland";}
        if("IT".equals(countrycode) == true){return "italy";}
        if("JM".equals(countrycode) == true){return "jamaica";}
        if("JO".equals(countrycode) == true){return "jordan";}
        if("JP".equals(countrycode) == true){return "japan";}
        if("KE".equals(countrycode) == true){return "kenya";}
        if("KG".equals(countrycode) == true){return "kyrgyzstan";}
        if("KH".equals(countrycode) == true){return "kampuchea cambodia";}
        if("KN".equals(countrycode) == true){return "saint kitts and nevis";}
        if("KR".equals(countrycode) == true){return "republicofkorea";}
        if("KY".equals(countrycode) == true){return "cayman islands";}
        if("KT".equals(countrycode) == true){return "coteo ivoire";}
        if("KW".equals(countrycode) == true){return "kuwati";}
        if("KZ".equals(countrycode) == true){return "kazakhstan";}
        if("LA".equals(countrycode) == true){return "laos";}
        if("LB".equals(countrycode) == true){return "lebanon";}
        if("LC".equals(countrycode) == true){return "saintlueia";}
        if("LI".equals(countrycode) == true){return "liechtenstein";}
        if("LK".equals(countrycode) == true){return "srilanka";}
        if("LR".equals(countrycode) == true){return "liberia";}
        if("LT".equals(countrycode) == true){return "lithuania";}
        if("LU".equals(countrycode) == true){return "luxembourg";}
        if("LV".equals(countrycode) == true){return "latvia";}
        if("LY".equals(countrycode) == true){return "libyan";}
        if("MA".equals(countrycode) == true){return "morocco";}
        if("MC".equals(countrycode) == true){return "monaco";}
        if("MD".equals(countrycode) == true){return "moldova republicof";}
        if("MG".equals(countrycode) == true){return "madagascar";}
        if("ML".equals(countrycode) == true){return "mali";}
        if("MM".equals(countrycode) == true){return "burma";}
        if("MN".equals(countrycode) == true){return "mongolia";}
        if("MO".equals(countrycode) == true){return "macau";}
        if("MQ".equals(countrycode) == true){return "martiniqu";}
        if("MT".equals(countrycode) == true){return "malta";}
        if("MU".equals(countrycode) == true){return "mauritius";}
        if("MW".equals(countrycode) == true){return "malawi";}
        if("MX".equals(countrycode) == true){return "mexico";}
        if("MY".equals(countrycode) == true){return "malaysia";}
        if("MZ".equals(countrycode) == true){return "mozambique";}
        if("NA".equals(countrycode) == true){return "namibia";}
        if("NE".equals(countrycode) == true){return "niger";}
        if("NG".equals(countrycode) == true){return "nigeria";}
        if("NI".equals(countrycode) == true){return "nicaragua";}
        if("NL".equals(countrycode) == true){return "netherlands";}
        if("NO".equals(countrycode) == true){return "norway";}
        if("NP".equals(countrycode) == true){return "nepal";}
        if("NZ".equals(countrycode) == true){return "newzealand";}
        if("OM".equals(countrycode) == true){return "oman";}
        if("PA".equals(countrycode) == true){return "panama";}
        if("PE".equals(countrycode) == true){return "peru";}
        if("PG".equals(countrycode) == true){return "papuanewguinea";}
        if("PH".equals(countrycode) == true){return "philippines";}
        if("PK".equals(countrycode) == true){return "pakistan";}
        if("PL".equals(countrycode) == true){return "poland";}
        if("PT".equals(countrycode) == true){return "portugal";}
        if("PY".equals(countrycode) == true){return "paraguay";}
        if("QA".equals(countrycode) == true){return "qatar";}
        if("RO".equals(countrycode) == true){return "romania";}
        if("RU".equals(countrycode) == true){return "russianfederation";}
        if("SA".equals(countrycode) == true){return "saudiarabia";}
        if("SC".equals(countrycode) == true){return "seychelles";}
        if("SD".equals(countrycode) == true){return "sudan";}
        if("SE".equals(countrycode) == true){return "sweden";}
        if("SG".equals(countrycode) == true){return "singapore";}
        if("SI".equals(countrycode) == true){return "slovenia";}
        if("SK".equals(countrycode) == true){return "slovakia";}
        if("SL".equals(countrycode) == true){return "sierra leone";}
        if("SM".equals(countrycode) == true){return "sanmarino";}
        if("SN".equals(countrycode) == true){return "senegal";}
        if("SO".equals(countrycode) == true){return "somalia";}
        if("SR".equals(countrycode) == true){return "suriname";}
        if("SRB".equals(countrycode) == true){return "serbia";}
        if("SY".equals(countrycode) == true){return "syria";}
        if("SZ".equals(countrycode) == true){return "swaziland";}
        if("TC".equals(countrycode) == true){return "turks and caicos islands";}
        if("TD".equals(countrycode) == true){return "chad";}
        if("TG".equals(countrycode) == true){return "togo";}
        if("TH".equals(countrycode) == true){return "thailand";}
        if("TJ".equals(countrycode) == true){return "tajikistan";}
        if("TM".equals(countrycode) == true){return "turkmenistan";}
        if("TN".equals(countrycode) == true){return "tunisia";}
        if("TR".equals(countrycode) == true){return "turkey";}
        if("TW".equals(countrycode) == true){return "taiwan";}
        if("TZ".equals(countrycode) == true){return "tanzania";}
        if("UA".equals(countrycode) == true){return "ukraine";}
        if("UG".equals(countrycode) == true){return "uganda";}
        if("US".equals(countrycode) == true){return "united states";}
        if("UY".equals(countrycode) == true){return "uruguay";}
        if("UA".equals(countrycode) == true){return "vatican";}
        if("UZ".equals(countrycode) == true){return "uzbekistan";}
        if("UI".equals(countrycode) == true){return "virgin islands,U.S.";}
        if("VE".equals(countrycode) == true){return "venezuela";}
        if("VG".equals(countrycode) == true){return "virgin islands, british";}
        if("VN".equals(countrycode) == true){return "vietnam";}
        if("WS".equals(countrycode) == true){return "samoa";}
        if("YE".equals(countrycode) == true){return "yemen";}
        if("YU".equals(countrycode) == true){return "yugoslavia";}
        if("ZA".equals(countrycode) == true){return "southafrica";}
        if("ZM".equals(countrycode) == true){return "zambia";}
        if("ZR".equals(countrycode) == true){return "zaire";}
        if("ZW".equals(countrycode) == true){return "zimbabwe";}
        return countrycode;//如果实在不知道什么国家,就返回缩写
    }
    //根据英文国家简称获取国家中文名
    public static String getCountryCNByJc(String countrycode) {
        if(Sys.isNull(countrycode) == true){countrycode = "";}
        if(countrycode != null && countrycode.length()>0){countrycode = countrycode.toUpperCase();}//转换成大写
        if("UK".equals(countrycode) == true){return "英国";}
        if("BA".equals(countrycode) == true){return "波黑";}
        if("CZ".equals(countrycode) == true){return "捷克";}
        if("CRO".equals(countrycode) == true){return "克罗地亚";}
        if("HR".equals(countrycode) == true){return "克罗地亚";}
        if("GU".equals(countrycode) == true){return "关岛";}
        if("MDV".equals(countrycode) == true){return "马尔代夫";}
        if("MV".equals(countrycode) == true){return "马尔代夫";}
        if("ME".equals(countrycode) == true){return "黑山共和国";}
        if("MNE".equals(countrycode) == true){return "黑山共和国";}
        if("AA".equals(countrycode) == true){return "美国";}
        if("AN".equals(countrycode) == true){return "安的列斯";}
        if("MK".equals(countrycode) == true){return "马其顿";}
        if("NC".equals(countrycode) == true){return "新喀里多尼亚";}
        if("PF".equals(countrycode) == true){return "波利尼西亚";}
        if("PM".equals(countrycode) == true){return "圣皮埃尔和密克隆";}
        if("PR".equals(countrycode) == true){return "波多黎各";}
        if("RE".equals(countrycode) == true){return "留尼旺岛";}
        if("RS".equals(countrycode) == true){return "塞尔维亚";}
        if("SV".equals(countrycode) == true){return "萨尔瓦多";}
        if("TT".equals(countrycode) == true){return "特立尼达和多巴哥";}
        if("AE".equals(countrycode) == true){return "阿联酋";}
        if("AF".equals(countrycode) == true){return "阿富汗";}
        if("AG".equals(countrycode) == true){return "安提瓜和巴布达";}
        if("AL".equals(countrycode) == true){return "阿尔巴尼亚";}
        if("AM".equals(countrycode) == true){return "亚美尼亚";}
        if("AO".equals(countrycode) == true){return "安哥拉";}
        if("AR".equals(countrycode) == true){return "阿根廷";}
        if("AT".equals(countrycode) == true){return "奥地利";}
        if("AU".equals(countrycode) == true){return "澳大利亚";}
        if("AZ".equals(countrycode) == true){return "阿塞拜疆";}
        if("BB".equals(countrycode) == true){return "巴巴多斯";}
        if("BD".equals(countrycode) == true){return "孟加拉";}
        if("BE".equals(countrycode) == true){return "比利时";}
        if("BF".equals(countrycode) == true){return "布基纳法索";}
        if("BG".equals(countrycode) == true){return "保加利亚";}
        if("BH".equals(countrycode) == true){return "巴林";}
        if("BI".equals(countrycode) == true){return "布隆迪";}
        if("BJ".equals(countrycode) == true){return "贝宁";}
        if("BL".equals(countrycode) == true){return "巴勒斯坦";}
        if("BN".equals(countrycode) == true){return "文莱";}
        if("BO".equals(countrycode) == true){return "玻利维亚";}
        if("BR".equals(countrycode) == true){return "巴西";}
        if("BS".equals(countrycode) == true){return "巴哈马";}
        if("BW".equals(countrycode) == true){return "博茨瓦纳";}
        if("BY".equals(countrycode) == true){return "白俄罗斯";}
        if("BZ".equals(countrycode) == true){return "伯利兹";}
        if("CA".equals(countrycode) == true){return "加拿大";}
        if("CF".equals(countrycode) == true){return "中非";}
        if("CG".equals(countrycode) == true){return "刚果";}
        if("CH".equals(countrycode) == true){return "瑞士";}
        if("CI".equals(countrycode) == true){return "科特迪瓦";}
        if("CL".equals(countrycode) == true){return "智利";}
        if("CM".equals(countrycode) == true){return "喀麦隆";}
        if("CN".equals(countrycode) == true){return "中国";}
        if("CO".equals(countrycode) == true){return "哥伦比亚";}
        if("CR".equals(countrycode) == true){return "哥斯达黎加";}
        if("CS".equals(countrycode) == true){return "捷克";}
        if("CU".equals(countrycode) == true){return "古巴";}
        if("CV".equals(countrycode) == true){return "佛得角";}
        if("CY".equals(countrycode) == true){return "塞浦路斯";}
        if("DE".equals(countrycode) == true){return "德国";}
        if("DK".equals(countrycode) == true){return "丹麦";}
        if("DO".equals(countrycode) == true){return "多米尼加共和国";}
        if("DZ".equals(countrycode) == true){return "阿尔及利亚";}
        if("EC".equals(countrycode) == true){return "厄瓜多尔";}
        if("EE".equals(countrycode) == true){return "爱沙尼亚";}
        if("EG".equals(countrycode) == true){return "埃及";}
        if("ES".equals(countrycode) == true){return "西班牙";}
        if("ET".equals(countrycode) == true){return "埃塞俄比亚";}
        if("FI".equals(countrycode) == true){return "芬兰";}
        if("FJ".equals(countrycode) == true){return "斐济";}
        if("FO".equals(countrycode) == true){return "法罗群岛";}
        if("FR".equals(countrycode) == true){return "法国";}
        if("GA".equals(countrycode) == true){return "加蓬";}
        if("GB".equals(countrycode) == true){return "英国";}
        if("GD".equals(countrycode) == true){return "格林纳达";}
        if("GE".equals(countrycode) == true){return "格鲁吉亚";}
        if("GF".equals(countrycode) == true){return "法属圭亚那";}
        if("GH".equals(countrycode) == true){return "加纳";}
        if("GI".equals(countrycode) == true){return "直布罗陀";}
        if("GL".equals(countrycode) == true){return "格陵兰";}
        if("GN".equals(countrycode) == true){return "几内亚";}
        if("GP".equals(countrycode) == true){return "瓜德罗普";}
        if("GR".equals(countrycode) == true){return "希腊";}
        if("GT".equals(countrycode) == true){return "危地马拉";}
        if("HK".equals(countrycode) == true){return "香港特别行政区";}
        if("HN".equals(countrycode) == true){return "洪都拉斯";}
        if("HU".equals(countrycode) == true){return "匈牙利";}
        if("ID".equals(countrycode) == true){return "印度尼西亚";}
        if("IE".equals(countrycode) == true){return "爱尔兰";}
        if("IL".equals(countrycode) == true){return "以色列";}
        if("IN".equals(countrycode) == true){return "印度";}
        if("IQ".equals(countrycode) == true){return "伊拉克";}
        if("IR".equals(countrycode) == true){return "伊朗";}
        if("IS".equals(countrycode) == true){return "冰岛";}
        if("IT".equals(countrycode) == true){return "意大利";}
        if("JM".equals(countrycode) == true){return "牙买加";}
        if("JO".equals(countrycode) == true){return "约旦";}
        if("JP".equals(countrycode) == true){return "日本";}
        if("KE".equals(countrycode) == true){return "肯尼亚";}
        if("KG".equals(countrycode) == true){return "吉尔吉斯坦";}
        if("KH".equals(countrycode) == true){return "柬埔寨";}
        if("KN".equals(countrycode) == true){return "圣基茨和尼维斯";}
        if("KR".equals(countrycode) == true){return "韩国";}
        if("KY".equals(countrycode) == true){return "开曼群岛";}
        if("KT".equals(countrycode) == true){return "科特迪瓦共和国";}
        if("KW".equals(countrycode) == true){return "科威特";}
        if("KZ".equals(countrycode) == true){return "哈萨克";}
        if("LA".equals(countrycode) == true){return "老挝";}
        if("LB".equals(countrycode) == true){return "黎巴嫩";}
        if("LC".equals(countrycode) == true){return "圣卢西亚";}
        if("LI".equals(countrycode) == true){return "列支敦士登";}
        if("LK".equals(countrycode) == true){return "斯里兰卡";}
        if("LR".equals(countrycode) == true){return "利比里亚";}
        if("LT".equals(countrycode) == true){return "立陶宛";}
        if("LU".equals(countrycode) == true){return "卢森堡";}
        if("LV".equals(countrycode) == true){return "拉脱维亚";}
        if("LY".equals(countrycode) == true){return "利比亚";}
        if("MA".equals(countrycode) == true){return "摩洛哥";}
        if("MC".equals(countrycode) == true){return "摩纳哥";}
        if("MD".equals(countrycode) == true){return "摩尔多瓦";}
        if("MG".equals(countrycode) == true){return "马达加斯加";}
        if("ML".equals(countrycode) == true){return "马里";}
        if("MM".equals(countrycode) == true){return "缅甸";}
        if("MN".equals(countrycode) == true){return "蒙古";}
        if("MO".equals(countrycode) == true){return "澳门地区";}
        if("MQ".equals(countrycode) == true){return "马提尼克";}
        if("MT".equals(countrycode) == true){return "马耳他";}
        if("MU".equals(countrycode) == true){return "毛里求斯";}
        if("MW".equals(countrycode) == true){return "马拉维";}
        if("MX".equals(countrycode) == true){return "墨西哥";}
        if("MY".equals(countrycode) == true){return "马来西亚";}
        if("MZ".equals(countrycode) == true){return "莫桑比克";}
        if("NA".equals(countrycode) == true){return "纳米比亚";}
        if("NE".equals(countrycode) == true){return "尼日尔";}
        if("NG".equals(countrycode) == true){return "尼日利亚";}
        if("NI".equals(countrycode) == true){return "尼加拉瓜";}
        if("NL".equals(countrycode) == true){return "荷兰";}
        if("NO".equals(countrycode) == true){return "挪威";}
        if("NP".equals(countrycode) == true){return "尼泊尔";}
        if("NZ".equals(countrycode) == true){return "新西兰";}
        if("OM".equals(countrycode) == true){return "阿曼";}
        if("PA".equals(countrycode) == true){return "巴拿马";}
        if("PE".equals(countrycode) == true){return "秘鲁";}
        if("PG".equals(countrycode) == true){return "巴布亚新几内亚";}
        if("PH".equals(countrycode) == true){return "菲律宾";}
        if("PK".equals(countrycode) == true){return "巴基斯坦";}
        if("PL".equals(countrycode) == true){return "波兰";}
        if("PT".equals(countrycode) == true){return "葡萄牙";}
        if("PY".equals(countrycode) == true){return "巴拉圭";}
        if("QA".equals(countrycode) == true){return "卡塔尔";}
        if("RO".equals(countrycode) == true){return "罗马尼亚";}
        if("RU".equals(countrycode) == true){return "俄罗斯";}
        if("SA".equals(countrycode) == true){return "沙特阿拉伯";}
        if("SC".equals(countrycode) == true){return "塞舌尔";}
        if("SD".equals(countrycode) == true){return "苏丹";}
        if("SE".equals(countrycode) == true){return "瑞典";}
        if("SG".equals(countrycode) == true){return "新加坡";}
        if("SI".equals(countrycode) == true){return "斯洛文尼亚";}
        if("SK".equals(countrycode) == true){return "斯洛伐克";}
        if("SL".equals(countrycode) == true){return "塞拉利昂";}
        if("SM".equals(countrycode) == true){return "圣马力诺";}
        if("SN".equals(countrycode) == true){return "塞内加尔";}
        if("SO".equals(countrycode) == true){return "索马里";}
        if("SR".equals(countrycode) == true){return "苏里南";}
        if("SRB".equals(countrycode) == true){return "塞尔维亚";}
        if("SY".equals(countrycode) == true){return "叙利亚";}
        if("SZ".equals(countrycode) == true){return "斯威士兰";}
        if("TC".equals(countrycode) == true){return "特克斯和凯科斯群岛";}
        if("TD".equals(countrycode) == true){return "乍得";}
        if("TG".equals(countrycode) == true){return "多哥";}
        if("TH".equals(countrycode) == true){return "泰国";}
        if("TJ".equals(countrycode) == true){return "塔吉克斯坦";}
        if("TM".equals(countrycode) == true){return "土库曼";}
        if("TN".equals(countrycode) == true){return "突尼斯";}
        if("TR".equals(countrycode) == true){return "土耳其";}
        if("TW".equals(countrycode) == true){return "台湾省";}
        if("TZ".equals(countrycode) == true){return "坦桑尼亚";}
        if("UA".equals(countrycode) == true){return "乌克兰";}
        if("UG".equals(countrycode) == true){return "乌干达";}
        if("US".equals(countrycode) == true){return "美国";}
        if("UY".equals(countrycode) == true){return "乌拉圭";}
        if("UA".equals(countrycode) == true){return "梵蒂冈";}
        if("UZ".equals(countrycode) == true){return "乌兹别克";}
        if("UI".equals(countrycode) == true){return "美属维尔京群岛";}
        if("VE".equals(countrycode) == true){return "委内瑞拉";}
        if("VG".equals(countrycode) == true){return "英属维尔京群岛";}
        if("VN".equals(countrycode) == true){return "越南";}
        if("WS".equals(countrycode) == true){return "萨摩亚";}
        if("YE".equals(countrycode) == true){return "也门";}
        if("YU".equals(countrycode) == true){return "南斯拉夫联盟";}
        if("ZA".equals(countrycode) == true){return "南非";}
        if("ZM".equals(countrycode) == true){return "赞比亚";}
        if("ZR".equals(countrycode) == true){return "扎伊尔";}
        if("ZW".equals(countrycode) == true){return "津巴布韦";}

        return "未知国家";
    }


    */
/**
     * @param args
     *//*

    public static void main(String[] args) {
        //		System.out.print(Sys.str2YMD("200703201430") + "\n");
        //		System.out.print(Sys.str2YM("20070") + "\n");
        //		System.out.print(Sys.str2YMD("2007032014") + "\n");
        //		System.out.print(Sys.str2YMD("200703201430197878") + "\n");
        //		System.out.print(Sys.str2YMD("20070320143019") + "\n");
        //		System.out.print(Sys.str2YMD("20070320143019") + "\n");
        //		System.out.print(Sys.str2YMD("20070320143019") + "\n");
        //		System.out.println(Sys.cCheckMobile("15212345678"));
        //		System.out.println(Sys.cCheckMobile1("152123"));
        //		System.out.println(Sys.DateFristDay(Calendar.MONTH,0));
        //		System.out.println(Sys.DateFristDay(Calendar.MONTH,1));
        //		System.out.println(Sys.DateFristDay(Calendar.MONTH,2));
        //		System.out.println(Sys.checkPayDay("20071910"));
        System.out.println(Sys.StringToDate("2007-01-01 00:00:00") + "ss");
    }
    public static Date getDateAfter(int days) {//获取当前时间之前days的日期,返回date格式
        Calendar dt = Calendar.getInstance();
        dt.setTime(new Date());
        dt.add(Calendar.DAY_OF_MONTH, days);

        return dt.getTime();
    }
    //获取几天后的时间
    public static Date getDateAfter(Date d, int day) {
        Calendar now = Calendar.getInstance();
        now.setTime(d);
        now.set(Calendar.DATE, now.get(Calendar.DATE) + day);
        return now.getTime();
    }
    //获取几天前的时间
    public static Date getDateBefore(Date d, int day) {
        Calendar now = Calendar.getInstance();
        now.setTime(d);
        now.set(Calendar.DATE, now.get(Calendar.DATE) - day);
        return now.getTime();
    }

    //获取几 小时后的时间
    public static Date getHourAfter(Date d, int hour) {
        Calendar now = Calendar.getInstance();
        now.setTime(d);
        now.set(Calendar.HOUR_OF_DAY, now.get(Calendar.HOUR_OF_DAY) + hour);
        return now.getTime();
    }
    //获取几小时前的时间
    public static Date getHourBefore(Date d, int hour) {
        Calendar now = Calendar.getInstance();
        now.setTime(d);
        now.set(Calendar.HOUR_OF_DAY, now.get(Calendar.HOUR_OF_DAY) - hour);
        return now.getTime();
    }

    //获取几 分钟后的时间
    public static Date getMinAfter(Date d, int min) {
        Calendar now = Calendar.getInstance();
        now.setTime(d);
        now.set(Calendar.MINUTE, now.get(Calendar.MINUTE) + min);
        return now.getTime();
    }
    //获取几分钟前的时间
    public static Date getMinBefore(Date d, int min) {
        Calendar now = Calendar.getInstance();
        now.setTime(d);
        now.set(Calendar.MINUTE, now.get(Calendar.MINUTE) - min);
        return now.getTime();
    }
}*/
