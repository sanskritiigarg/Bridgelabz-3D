class Printer {
  void print(String message) {
    System.out.println(message);
  }

  void print(int message) {
    System.out.println(message);
  }
}

class ColorPrinter extends Printer {
  void print(String msg) {
    System.out.println(msg + " in color");
  }
}

public class Color {
  public static void main(String[] args) {
    ColorPrinter cp = new ColorPrinter();
    cp.print("HIHIHIH");
  }  
}
