package a.code.variables;

public class VariableDeclarationApp {
  public static void main(String[] args) {
    byte b1 = 100;   // -128..127
    short s = 32000; // -32768..32767
    int age = 30;    // -2147483648..2147483647
    // way 1
    long card_number1 = 1234567810111213L; // -9223372036854775808..9223372036854775807
    // way 2
    long card_number2 = 1234_5678_1011_1213L;
    String name = "Alex";
    String name2 = new String("Jim");
    char letterA = 'A';
    char letterB = 66;
    char letterC = 'B' + 1;
    int distance = 'Z' - 'A';
    boolean valid = true;

    final float k = 1.5F;
    // won't compile because of final
    // k = 1.6F;
    double pi = 3.14159265358979323846;
    double tan = 0.367;
  }
}
