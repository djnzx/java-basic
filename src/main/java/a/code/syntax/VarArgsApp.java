package a.code.syntax;

public class VarArgsApp {

  public static void main(String[] args) {
    int x = 5;
    int y = 7;
    int z = add(x, y);

    int a = 1;
    int b = 2;
    int c = 3;
    int d = add(a,b,c);

    int h1 = smart_add_(1);
    int h2 = smart_add_(1,2);
    int h3 = smart_add(new int[]{1,3,4});
    int h4 = smart_add_(1,6,7,7);
    int h5 = smart_add(new int[]{});
  }

  // overloading
  private static int add(int a, int b, int c) {
    return add(a,b) + c;
  }

  private static int add(int x, int y) {
    return x + y;
  }

  private static int add(int x, boolean y) {
    return x;
  }

  // varArgs
  private static int smart_add_(int... a) { // an array
    return smart_add(a);
  }

  // varArgs2
  private static int smart_add(int[] a) { // an array
    int result = 0;
    for (int value : a) {
      result = result + value;
    }
    return result;
  }
}
