package concurrency.ch01;

import net.jcip.annotations.NotThreadSafe;

@NotThreadSafe
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
