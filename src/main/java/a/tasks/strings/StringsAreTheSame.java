package a.tasks.strings;

public class StringsAreTheSame {

  /**
   * you have to implement your ONW implementation
   * to compare strings
   *
   * you are allowed to use only:
   * - String.length
   * - String.charAt
   * - any operations with primitives
   *
   */

  public boolean check(String s1, String s2) {
    if (s1 == null) return false;
    if (s2 == null) return false;
    if (s1.length() != s2.length()) return false;

    for (int i = 0; i < s1.length(); i++) {
      if (s1.charAt(i) != s2.charAt(i)) {
        return false;
      }
    }
    return true;
  }
}
