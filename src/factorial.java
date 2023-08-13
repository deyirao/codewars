public class Factorial {
    public static long factorial(int n) {
      long num = 1;
      for (int i = 1; i <= n; i++) {
        num *= i;
      }
      return num;
    }
}
