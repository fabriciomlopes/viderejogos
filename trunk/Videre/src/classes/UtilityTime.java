/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author Diogo
 */
public class UtilityTime {

    /**
     * Formats a date depending on what mask receives at param
     * "dd" - day
     * "MM" - month
     * "yyyy" - year
     * "hh" - hours
     * "mm" - minutes
     * "ss" - seconds
     *
     * @param date  the date to mask
     * @param mask the mask of date
     * @return a String of masked date
     */
    public static String formatDate(Date date, String mask) {
        String outPut;
        DateFormat dateFormat = new SimpleDateFormat(mask);
        outPut = dateFormat.format(date);

        return outPut;
    }

    /**
     * Gets the OS current time by a mask
     *
     *
     * @param mask a mask
     * @return
     */
    public static String getLocalTime(String mask) {
        /*DateFormat dateFormat = new SimpleDateFormat(mask);
        Date date = new Date();
        return dateFormat.format(date);*/
        return formatDate(new Date(), mask);
    }

    /**
     * Gets the OS current time
     *
     * @return the date and current time
     */
    public static String getLocalDateAndTime() {
        return getLocalTime(getDateAndTimeMask());
    }

    /**
     * @return the date in day/month/year mask
     */
    public static String getLocalDate() {
        return getLocalTime(getDateMask());
    }

    /**
     *
     * @return the time in Hour/minute/second mask
     */
    public static String getLocalTime() {
        return getLocalTime(getTimeMask());
    }

    /**
     * return the date mask of something like this
     * 12/30/2100
     *
     * @return the mask of a simple date
     */
    public static String getDateMask() {
        return "dd/MM/yyyy";
    }

    /**
     * return the date mask of something like this
     * 23h59m59s
     *
     * @return the mask of a simple time
     */
    public static String getTimeMask() {
        return "HH'h'mm'm'ss's'";
    }

    /**
     * return the date and time mask of somethink like this
     * 12/30/2100 - 23h59m59s
     *
     * @return the mask of date ant time
     */
    public static String getDateAndTimeMask() {
        return getDateMask() + " - " + getTimeMask();
    }

    /*
    public static String addTime(String date, int year, int month, int day) {
    //dd/MM/yyyy
    String outPut = null;
    if (date.charAt(2) != '/' || date.charAt(6) != '/' || date.length()>10){
    System.err.println("invalid date format to add!("+date+")" );
    return outPut;
    }
    int dateDay = Integer.parseInt(date.substring(0, 2));
    int dateMonth = Integer.parseInt(date.substring(3, 5));
    int dateyear = Integer.parseInt(date.substring(6));
    Calendar.APRIL;

    outPut = String.format("%02/%02/%04", dateDay,dateMonth,dateyear);


    return outPut;
    }
     *
     */
    /**
     * adds day to a date and return the new date
     *
     * @param date the date to add
     * @param day amount of days to increase
     * @return
     */
    public static Date addTime(Date date, int day) {
        Date outPut = null;
        try {
            Calendar c = Calendar.getInstance();
            c.setTime(date);
            c.add(Calendar.DATE, day);

            outPut = c.getTime();
        } catch (Exception e) {
            e.printStackTrace();
            outPut = null;
        }

        return outPut;
    }

    /**
     * adds day to a date and return its string  based on a mask
     *
     * @param date the date to add
     * @param day how many days to add
     * @param mask the mask of time
     * @return
     */
    public static String addTime(Date date, int day, String mask) {
        String outPut = null;
        try {
            date = addTime(date, day);
            SimpleDateFormat sdf = new SimpleDateFormat(mask);
            outPut = formatDate(date, mask);  // dt is now the new date
        } catch (Exception e) {
            e.printStackTrace();
            outPut = null;
        }
        return outPut;
    }

    /**
     * transforms 3 string from param as a date.
     *
     * @param year
     * @param month
     * @param day
     * @return
     */
    public static Date ToDate(String year, String month, String day) {
        Date date = new Date(
                Integer.parseInt(year) - 1900, //year
                Integer.parseInt(month) - 1, //month
                Integer.parseInt(day));     //day
        return date;
    }

    /**
     * transforms 5 string from param as a date.
     *
     * @param year
     * @param month
     * @param day
     * @param hour
     * @param minutes
     * @return
     */
    public static Date ToDate(String year, String month, String day, String hour, String minutes) {
        Date date = new Date(
                Integer.parseInt(year) - 1900, //year
                Integer.parseInt(month) - 1, //month
                Integer.parseInt(day),
                Integer.parseInt(hour),
                Integer.parseInt(minutes));     //day
        return date;
    }

    /**
     * creates a date based on param.
     * the param string should be in this format:
     * year,month,day,hour,minutes.
     * in this case if the regex is "," so a date will be returned.
     * else returns null;
     *
     * @param date
     * @param regex
     * @return
     */
    public static Date ToDate(String date, String regex) {
        if (date.indexOf(regex) == -1) {
            return null;
        }

        String dates[] = date.split(regex);


        return ToDate(dates[4], dates[3], dates[2], dates[1], dates[0]);

    }

    /**
     * returns the time difference between 2 dates in milliseconds.
     * i.e.: endDate = 50secs, startDate = 25secs. return is 25secs, if the same year,day,etc
     *
     * @param endDate
     * @param startDate
     * @return
     */
    public static long getDifMilliseconds(Date endDate, Date startDate) {
        Calendar c1 = Calendar.getInstance();
        Calendar c2 = Calendar.getInstance();
        c1.setTime(startDate);
        c2.setTime(endDate);
        long milli1 = c1.getTimeInMillis();
        long milli2 = c2.getTimeInMillis();
        return milli1 - milli2;
    }

    /**
     * returns the diference between endDate and startDate in seconds
     * @param endDate
     * @param startDate
     * @return
     */
    public static long getDifSecond(Date endDate, Date startDate) {
        return getDifMilliseconds(endDate, startDate) / (1000);
    }

    /**
     * returns the diference between endDate and startDate in minutes
     * @param endDate
     * @param startDate
     * @return
     */
    public static long getDifMinute(Date endDate, Date startDate) {
        return getDifSecond(endDate, startDate) / 60;
    }

    /**
     * returns the diference between endDate and startDate in hours
     * @param endDate
     * @param startDate
     * @return
     */
    public static long getDifHour(Date endDate, Date startDate) {
        return getDifMinute(endDate, startDate) / 60;
    }

    /**
     * returns the diference between endDate and startDate in Days
     * @param endDate
     * @param startDate
     * @return
     */
    public static long getDifDay(Date endDate, Date startDate) {
        return getDifHour(endDate, startDate) / 24;
    }
}
