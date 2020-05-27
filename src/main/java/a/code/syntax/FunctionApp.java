package a.code.syntax;

public class FunctionApp {

  int add(int... ints) {
    return 0;
  }

  // (int, int) -> int
  int add(int a, int b) {
    return a + b;
  }

  int add(int a, int b, int c) {
    return a + b + c;
  }

  int add(int a, int b, int c, int d) {
    return add(add(a,b,c),d);
//    return add(a,b,c)+d;
//    return a + b + c + d;
  }

  // Varargs
  int add1(int... vals) {
    int total = 0;
    for(int val: vals) {
      total += val;
    }
    return total;
  }

  int add2(int[] vals) {
    int total = 0;
    for(int val: vals) {
      total += val;
    }
    return total;
  }

  void implement() {
    add1(1,2,3,4,5,6);
    add2(new int[]{1,2,3,4,5,6});
    add(1,1,1,1,1);
  }

  int add5(int a, int b) {
    throw new IllegalArgumentException("not impl");
  }
  int add5(long a, long b) {
    throw new IllegalArgumentException("not impl");
  }
  int add5(byte a, byte b) {
    throw new IllegalArgumentException("not impl");
  }
  int add5(byte a, int b) {
    throw new IllegalArgumentException("not impl");
  }

  String combine(String... strings) {
    add5((byte) 1,1);
    // TODO: should be implemented by Jim by 2020.02.12
    throw new IllegalArgumentException("not impl");
  }


}
