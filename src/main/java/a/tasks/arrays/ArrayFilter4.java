package a.tasks.arrays;

import java.util.Random;
import java.util.stream.Collectors;

public class ArrayFilter4 {
  public static void main(String[] args) {
    new Random().ints(-100, 100).limit(30).boxed()
        .collect(Collectors.groupingBy(n -> n<0 ? n%2==0 ? "NE" : "NO" : n%2==0 ? "PE" : "PO"))
        .forEach((k,v) -> System.out.printf("%s: %s\n", k, v));
  }
}
