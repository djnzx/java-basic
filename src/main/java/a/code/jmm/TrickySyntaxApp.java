package a.code.jmm;

public class TrickySyntaxApp {

  public static void print() {
    System.out.println("Will it be failed?");
  }

  public static void main(String[] args) {
    ((TrickySyntaxApp)null).print();
    TrickySyntaxApp.print();
    print();
  }
}
