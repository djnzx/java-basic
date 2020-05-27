package a.tasks.strings;

public class AreStringsRotated {

  public boolean check(String one, String two) {
    return one.concat(one).contains(two);
  }

}
