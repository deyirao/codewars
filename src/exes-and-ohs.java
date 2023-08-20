public class XO {
  
  public static boolean getXO (String str) {
    int os = 0;
    int xs = 0;
    
    for (int i = 0; i < str.length(); i++) {
      if (str.charAt(i) == 'o' || str.charAt(i) == 'O') os++;
      if (str.charAt(i) == 'x' || str.charAt(i) == 'X') xs++;
    }
    
    return os == xs;
  }
}
