package a.tasks.arrays;

import java.util.Arrays;
import java.util.stream.IntStream;

public class ArrayRotate3 {

  private static int[] generate(int size) {
    return IntStream.range(0, size)
        .map(n -> (int)(Math.random()*200-100))
        .toArray();
  }

  // that code contains mistake for arrays, containing only ONE positive number
  private static int[] rotate_right(int[] origin) {
    int[] rotated = origin.clone();
    int current = 0;
    int last = 0;
    int counter = 0;
    int first_ind = 0;
    for (int i = 0; i < rotated.length; i++) {
      if (rotated[i] >= 0) {
        if (counter != 0) {
          current = rotated[i];
          rotated[i] = last;
          last = current;
        }
        else {
          first_ind = i;
          last = rotated[i];
        }
        counter++;
      }
    }
    rotated[first_ind] = current;
    return rotated;
  }

  public static void main(String[] args) {
//    int[] origin = generate(10);
    int[] origin = {-3, 5, -4};
    int[] rotated = rotate_right(origin);
    System.out.printf("Original: %s\n", Arrays.toString(origin));
    System.out.printf("Rotated : %s\n", Arrays.toString(rotated));
  }

}
