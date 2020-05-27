package a.code.generics;

import a.code.jmm.Pizza;

public class GenericsApp {

  void process(SmartBox<Pizza> x) {
    Pizza value = x.getValue();
    // ...
  }

  public static void main(String[] args) {
    new SmartBox<Integer>();
    new SmartBox<String>();
    new SmartBox<Pizza>();

    XRandom<Integer> x1 = new XRandom<Integer>();
    Integer integer = x1.get();

    XRandom<Pizza> x2 = new XRandom<Pizza>();
    Pizza pizza = x2.get();
  }

}
