package a.tasks.strings;

public class RandomStringApp {

  public String generate_random_string(int length) {
    int range = 'Z' - 'A' + 1;
    String outcome = "";
    for (int i = 0; i < length; i++) {
      boolean way = (int)((Math.random()*100))%2==0;
      char c = (char) (Math.random()*range + (way ? 'A' : 'a'));
      outcome = outcome + c;
    }
    return outcome;
  }

  public static void main(String[] args) {
    RandomStringApp t = new RandomStringApp();
    String s1 = t.generate_random_string(10);
    String s2 = t.generate_random_string(5);

    System.out.println(s1);
    System.out.println(s2);
  }
}
