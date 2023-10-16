public class SumArray {

  public static double sum(double[] numbers) {
    double sum = 0;
    for (double element: numbers)
      sum += element;
    return sum;
  }
}