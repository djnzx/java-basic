package concurrency.ch01;

public class Sequence {

  private int value = 0;

  /**
   * i++
   * actually three operations
   */

  public int nextUnsafe() {
    return value++;
  }

  public synchronized int nextSafe() {
    return value++;
  }

}
