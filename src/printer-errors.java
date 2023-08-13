import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Printer {
  public static String printerError(String s) {
    // Define a regex for non-error colors
    Pattern p = Pattern.compile("[a-m]");
    
    // Count the errors in a variable
    int failures = 0;
    
    // Iterate through the characters of the string
    for (int i = 0; i < s.length(); i++) {
      
      // If the character is not in [a-m], then increment failures
      if (p.matcher(String.valueOf(s.charAt(i))).matches()) {
        continue;
      } 
      failures++;
    }
    
    return String.format("%d/%d", failures, s.length());
  }
}
