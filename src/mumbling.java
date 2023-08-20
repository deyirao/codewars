public class Accumul {  
  public static String accum(String s) {
    StringBuilder sb = new StringBuilder();
    
    // Iterate through each char of the string
    for (int i = 0; i < s.length(); i++) {
      
      // For each char, increase the amount of chars in each iteration
      for (int j = 1; j <= i + 1; j++) {
        
        // The first character is in upper case
        if (j == 1) {
          sb.append(Character.toUpperCase(s.charAt(i)));
        } 
        
        // Any following characters are in lower case
        else {
          sb.append(Character.toLowerCase(s.charAt(i)));
        }
      }
      
      // If it's not the last character, add a "-"
      if (i != s.length() - 1) {
        sb.append("-");
      }
    }
    
    return sb.toString();
  }
}
