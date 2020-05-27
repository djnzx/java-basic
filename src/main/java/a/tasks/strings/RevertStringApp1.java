package a.tasks.strings;

public class RevertStringApp1 {
  public static void main(String[] args) {
    String origin = "Hello World";
    String reverted = new StringBuilder(origin).reverse().toString();

    System.out.printf("Original string: %s\n", origin);
    System.out.printf("Reverted string: %s\n", reverted);
  }
}
