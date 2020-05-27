package a.code;

public class ArgumentsListApp {
  public static void main(String[] args) {
    for (int i = 0; i < args.length; i++) {
      System.out.printf("param %d: %s\n", i, args[i]);
    }
  }
}
