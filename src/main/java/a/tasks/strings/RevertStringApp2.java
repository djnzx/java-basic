package a.tasks.strings;

public class RevertStringApp2 {
  public static void main(String[] args) {
    String origin = "Hello World";
    String reverted = "";
    for (int i = 0; i < origin.length(); i++) {
      reverted = reverted + origin.charAt(origin.length()-1-i);
    }

    System.out.printf("Original string: %s\n", origin);
    System.out.printf("Reverted string: %s\n", reverted);
  }
}
