package a.code.jmm;

public class PassingByValues {

  // doesn't work
  private static void swap(int one, int two) {
    int tmp = one;
    one = two;
    two = tmp;
  }

  // passing by values
  public static void main(String[] args) {
    int i = 5;
    int k = 7;
    System.out.printf("i=%d, k=%d\n", i, k);
    swap(i, k);
    System.out.printf("i=%d, k=%d\n", i, k);
  }

}
