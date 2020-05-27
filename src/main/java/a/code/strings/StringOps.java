package a.code.strings;

public class StringOps {

  public boolean isCapital(char c) {
    return c >= 'A' && c <= 'Z';
  }

  public boolean isSmall(char c) {
    return c >= 'a' && c <= 'z';
  }

  public boolean isLetter(char c) {
    return isCapital(c) || isSmall(c);
  }

  public boolean isVowel(char c) {
    final String vowels = "aeoiu";
    return vowels.indexOf(Character.toLowerCase(c)) >= 0;
  }

  public boolean isConsonant(char c) {
    return !isVowel(c);
  }

  public String alphabetSmall() {
    StringBuilder alpha = new StringBuilder();
    for (char i = 'a'; i <= 'z'; i++) {
      alpha.append(i);
    }
    return alpha.toString();
  }

  public String alphabetCapital() {
    return alphabetSmall().toUpperCase();
  }

  public char randomSmallLetter() {
    String alpha = alphabetSmall();
    return alpha.charAt((int) (Math.random()*alpha.length()));
  }

  public char randomCapitalLetter() {
    String alpha = alphabetCapital();
    return alpha.charAt((int) (Math.random()*alpha.length()));
  }

  public char randomLetter() {
    return ((int)(Math.random()*2)==0) ? // 0 or 1
        randomSmallLetter() : randomCapitalLetter();
  }

  public static void main(String[] args) {
    StringOps so = new StringOps();
    System.out.println(so.alphabetSmall());
  }
}
