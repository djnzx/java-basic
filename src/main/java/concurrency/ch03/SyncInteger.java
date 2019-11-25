package concurrency.ch03;

import net.jcip.annotations.ThreadSafe;

@ThreadSafe
public class SyncInteger {
  private int value;

  public synchronized int get() {
    return value;
  }

  public synchronized void set(int value) {
    this.value = value;
  }

}
