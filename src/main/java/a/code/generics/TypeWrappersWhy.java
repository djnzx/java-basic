package a.code.generics;

import a.code.jmm.Pizza;

import java.util.ArrayList;

public class TypeWrappersWhy {
  public static void main(String[] args) {
    ArrayList<Integer> a1 = new ArrayList<>();
    ArrayList<String> a2 = new ArrayList<>();
    ArrayList<Pizza> a3 = new ArrayList<>();
  }
}
