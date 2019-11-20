package concurrency.scanner;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ScannerTimeableApp {
  public static void main(String[] args) throws ExecutionException, InterruptedException {
    ExecutorService es = Executors.newFixedThreadPool(10);

    ScannerTimeable sc = new ScannerTimeable();
    System.out.println(sc.readLn(3000, es));
    System.out.println("finished");
    es.shutdown();
  }
}
