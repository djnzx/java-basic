package a.code.strings;

public class AlphabetApp1 {
  public static void main(String[] args) {
    StringBuilder alphabet = new StringBuilder();
    for (char letter = 'A'; letter <= 'Z'; letter++) {
      alphabet.append(letter);
    }
    System.out.println(alphabet.toString());
  }
}
