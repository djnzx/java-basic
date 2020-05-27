package a.code.variables;

public class CharAsIntApp {
  public static void main(String[] args) {
    // char
    char letterA = 'A';
    char letterB = 66;
    char letterC = 'B' + 1; // 'C'
    // int
    int distance = 'Z' - 'A'; // 25
    int letA = 'A'; // 65
    // char -> int
    int letB = letterB; // 66
    // int -> char
    char letterA2 = (char) letA; // 'A'
  }
}
