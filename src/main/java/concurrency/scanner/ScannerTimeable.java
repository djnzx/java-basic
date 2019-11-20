package concurrency.scanner;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.*;

public class ScannerTimeable {

  /**
   * @param timeout - milliseconds
   * @return string
   */
  String readLn(final int timeout, ExecutorService es) throws InterruptedException, ExecutionException {

    Callable<String> callable = () -> {
      Scanner scanner = new Scanner(System.in);
      return scanner.nextLine();
    };

    List<Future<String>> futures = es.invokeAll(Arrays.asList(callable), timeout, TimeUnit.MILLISECONDS);

    Future<String> stringFuture = futures.get(0);
    String s;
    if (!stringFuture.isCancelled()) s = stringFuture.get();
    else s = "Timeout, Default Value";
    return s;
  }
}
