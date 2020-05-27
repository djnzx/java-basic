package a.code.jmm;

public class Algorithm {
  String name;
  static int MAX = 33;

  /**
   * inside NON-STATIC method
   * we can address to:
   * - non static variables (instance-based, allocated in the HEAP)
   * - static variables (shared, located in the CLASS LOADER)
   */
  public void make() {
    System.out.println(this.name);
    System.out.println(name);
    System.out.println(MAX);
    System.out.println(this.MAX);
    System.out.println(Algorithm.MAX);
  }

  /**
   * inside STATIC method
   * we can address on ONLY to
   * - static variables (shared, located in the CLASS LOADER)
   *
   * we CAN NOT access to
   * non static variables because they are allocated in the HEAP
   * because we don't have
   */
  public static void produce() {
//    System.out.println(name);
//    this.name;
    System.out.println(MAX);
    System.out.println(Algorithm.MAX);
  }


}
