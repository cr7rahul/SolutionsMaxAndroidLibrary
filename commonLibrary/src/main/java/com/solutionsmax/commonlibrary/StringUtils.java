package com.solutionsmax.commonlibrary;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringUtils {
  public static String getAlphaNumericString(int n) {

    // chose a Character random from this String
    String AlphaNumericString = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"
        + "0123456789"
        + "abcdefghijklmnopqrstuvxyz";

    // create StringBuffer size of AlphaNumericString
    StringBuilder sb = new StringBuilder(n);

    for (int i = 0; i < n; i++) {

      // generate a random number between
      // 0 to AlphaNumericString variable length
      int index
          = (int) (AlphaNumericString.length()
          * Math.random());

      // add Character one by one in end of sb
      sb.append(AlphaNumericString
          .charAt(index));
    }

    return sb.toString();
  }

  // Password Validation
  public static boolean isValidPassword(final String password) {

    Pattern pattern;
    Matcher matcher;

    final String PASSWORD_PATTERN = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=])(?=\\S+$).{4,}$";

    pattern = Pattern.compile(PASSWORD_PATTERN);
    matcher = pattern.matcher(password);

    return !matcher.matches();

  }
}
