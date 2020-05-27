package a.tasks.arrays;

import java.util.Arrays;

public class ArrayFilter1 {
  public static void main(String[] args) {
    // random data generation
    final int LEN = 30;
    final int[] origin = new int[LEN];
    for (int i = 0; i < origin.length; i++) {
      origin[i] = (int)(Math.random()*200-100);
    }
    // counting
    int count_pe = 0;
    int count_po = 0;
    int count_ne = 0;
    int count_no = 0;
    for (int i = 0; i < origin.length; i++) {
      if (origin[i] < 0) {
        if (origin[i] % 2 == 0) {
          count_ne++;
        } else {
          count_no++;
        }
      } else if (origin[i] % 2 == 0) {
        count_pe++;
      } else {
        count_po++;
      }
    }
    // memory allocation for target arrays
    int[] ne = new int[count_ne];
    int[] no = new int[count_no];
    int[] pe = new int[count_pe];
    int[] po = new int[count_po];
    // copying data to target arrays
    for (int i = 0; i < origin.length; i++) {
      if (origin[i] < 0) {
        if (origin[i] % 2 == 0) {
          ne[ne.length - count_ne--] = origin[i];
        } else {
          no[no.length - count_no--] = origin[i];
        }
      } else if (origin[i] % 2 == 0) {
        pe[pe.length - count_pe--] = origin[i];
      } else {
        po[po.length - count_po--] = origin[i];
      }
    }
    // printing
    String originAsString = Arrays.toString(origin);
    System.out.println(originAsString);
    System.out.println(Arrays.toString(ne));
    System.out.println(Arrays.toString(no));
    System.out.println(Arrays.toString(pe));
    System.out.println(Arrays.toString(po));
  }
}
