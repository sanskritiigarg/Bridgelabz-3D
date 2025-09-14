class MathUtils {
  int add(int a, int b) {
    return a+b;
  }

  double add(double a, double b) {
    return a+b;
  }

  float add(float a, float b) {
    return a+b;
  }
 }


public class Math {
  public static void main(String[] args) {
    MathUtils math = new MathUtils();
    System.out.println(math.add(5, 4));
    System.out.println(math.add(2.4f, 4.5f));
    System.out.println(math.add(3.67, 4.678));
  }
}
