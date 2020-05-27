package a.code.jmm;

public class PassingByReference2 {

  static void swap(int[] x, int[] y) {
    int z = x[0];
    x[0] = y[0];
    y[0] = z;
  }

  public static void main(String[] args) {
    int[] i = {5};
    int[] k = {7};
    System.out.printf("i=%d, k=%d\n", i[0], k[0]);
    swap(i, k);
    System.out.printf("i=%d, k=%d\n", i[0], k[0]);
  }
}
