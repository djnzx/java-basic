package a.code.array;

public class ArraysComprehensionApp {
  public static void main(String[] args) {
    // array declaration
    int[] a = new int[10];
    // elements a[0]..a[9]
    int len = a.length; // len = 10;

    // automatically filled by zeroes
    for (int i = 0; i < a.length; i++) {
      System.out.printf("%d ", a[i]);
    }
    System.out.println();

    // assign new random values
    for (int i = 0; i < a.length; i++) {
      a[i] = (int) (Math.random()* 10);
    }

    // print way #1, accessing by index
    for (int i = 0; i < a.length; i++) {
      System.out.printf("%d ", a[i]);
    }
    System.out.println();

    // print way #2, without index
    for (int val: a) {
      System.out.printf("%d ", val);
    }

  }
}
