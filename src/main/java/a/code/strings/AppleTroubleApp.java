package a.code.strings;

public class AppleTroubleApp {
  public static void main(String[] args) {
    // problem
    System.out.println("This apple "+
        "costs " +
        + '2'
        + " USD");

    // solution #1
    System.out.printf("Apple costs %d USD\n", 2);

    // solution #2
    int price = 2;
    System.out.printf("Apple costs %d USD\n", price);
  }
}
