package a.code.jmm;

public class PassingByReference1 {

  private static void swap(final BoxInHeap one, final BoxInHeap two) {
    int tmp = one.value;
    one.value = two.value;
    two.value = tmp;
  }

  public static void main(String[] args) {
    final BoxInHeap box1 = new BoxInHeap(5);
    final BoxInHeap box2 = new BoxInHeap(7);
    System.out.printf("i=%d, k=%d\n", box1.value, box2.value);
    swap(box1, box2);
    System.out.printf("i=%d, k=%d\n", box1.value, box2.value);
  }

}
