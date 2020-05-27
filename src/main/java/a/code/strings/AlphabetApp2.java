package a.code.strings;

public class AlphabetApp2 {
  public static void main(String[] args) {
    char[] data = new char['Z'-'A'+1];
    for (char b = 'A'; b <= 'Z'; b++) {
      data[b-'A'] = b;
    }
    String alphabet = new String(data);
    System.out.println(alphabet);
  }
}
