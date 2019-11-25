package concurrency.ch03;

import net.jcip.annotations.NotThreadSafe;

@NotThreadSafe
public class NoVisibility {
  private static boolean ready;
  private static int number;

  // https://javarevisited.blogspot.com/2011/12/difference-between-wait-sleep-yield.html
  private static class Reader extends Thread {
    @Override
    public void run() {
    // whenever we want to access to shared data we need to use synchronize !
      while (!ready) {
        Thread.yield();
      }
      System.out.println(number);
    }
  }

  /**
   * there is no any guarantee 42 to be printed
   */
  public static void main(String[] args) throws InterruptedException {
    new Reader().start();
    number = 42;
    ready = true;
  }
}
