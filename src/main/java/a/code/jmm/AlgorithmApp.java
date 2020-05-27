package a.code.jmm;

public class AlgorithmApp {

  public static void main(String[] args) {
    Algorithm p1 = new Algorithm();
    p1.name = "Alex";
    p1.MAX = 33;
    p1.make();

    Algorithm p2 = new Algorithm();
    p2.name = "Sergio";
    p2.MAX = 44;
    p2.make();

    Algorithm.produce();

    System.out.println(p1.name);
    System.out.println(p1.MAX);

    System.out.println(p2.name);
    System.out.println(p2.MAX);

    System.out.println(Algorithm.MAX);
  }
}
