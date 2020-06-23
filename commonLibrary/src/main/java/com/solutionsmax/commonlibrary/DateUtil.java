package com.solutionsmax.citizensplus.util;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class DateUtil {
  /**
   * Get Current Date
   *
   * @return - Current Date
   */
  public static String getCurrentDate() {
    return new SimpleDateFormat("yyyy-MM-dd", Locale.getDefault()).format(new Date());
  }

  public static String getCurrentDataTime() {
    DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.US);
    Calendar cal = Calendar.getInstance();
    return dateFormat.format(cal.getTime());
  }

  /**
   * Get Previous Date
   *
   * @param dateString - Current Date
   * @return - Previous Date
   */
  public static String getPreviousDate(String dateString) throws ParseException {
    // Create a date formatter using your format string
    DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd", Locale.ENGLISH);

    // Parse the given date string into a Date object.
    // Note: This can throw a ParseException.
    Date myDate = dateFormat.parse(dateString);

    // Use the Calendar class to subtract one day
    Calendar calendar = Calendar.getInstance();
    calendar.setTime(myDate);
    calendar.add(Calendar.DAY_OF_YEAR, -1);

    // Use the date formatter to produce a formatted date string
    Date previousDate = calendar.getTime();

    return dateFormat.format(previousDate);
  }
}
