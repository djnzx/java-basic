package a.tasks.arrays;

import java.util.Arrays;
import java.util.stream.IntStream;

public class ArrayRotate2 {

  private static int[] generate(int size) {
    return IntStream.range(0, size)
        .map(n -> (int)(Math.random()*200-100))
        .toArray();
  }

  private static int[] rotate_right(int[] origin) {
    int[] rotated = origin.clone();
    int firstPosIndex = 0;
    for (int i = 0; i < rotated.length; i++) {
      if(rotated[i]>0){
        firstPosIndex = i;
        break;
      }
    }
    for (int i = 1; i < rotated.length; i++) {
      if(rotated[i]>0) {
        int c = rotated[firstPosIndex];
        rotated[firstPosIndex] = rotated[i];
        rotated[i] = c;
      }
    }
    return rotated;
  }

  public static void main(String[] args) {
    int[] origin = generate(10);
    int[] rotated = rotate_right(origin);
    System.out.printf("Original: %s\n", Arrays.toString(origin));
    System.out.printf("Rotated : %s\n", Arrays.toString(rotated));
  }

}
