package a.code.jmm;

public class StaticApp {

  public static void main(String[] args) {
    Pizza p1 = new Pizza();
    Pizza p2 = new Pizza();
    p1.name = "Quatroformaggi";
    p2.name = "Cheese";
    System.out.printf("p1: %s, %d\n", p1.name, p1.price);
    System.out.printf("p2: %s, %d\n", p2.name, p2.price);
    p1.price = 10;
    p2.price = 20;
    System.out.printf("p1: %s, %d\n", p1.name, p1.price);
    System.out.printf("p2: %s, %d\n", p2.name, p2.price);
    p1.print();
  }
}
