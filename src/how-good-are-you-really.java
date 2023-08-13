public class Kata {
  public static boolean betterThanAverage(int[] classPoints, int yourPoints) {
    double sum = yourPoints;
    for (int i = 0; i < classPoints.length; i++) sum += classPoints[i];
    return (double) yourPoints > sum / (classPoints.length + 1);
  }
}
