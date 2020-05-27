package a.tasks.envelope;

public class EnvelopeApp1 {
  public static void main(String[] args) {
    int width = 22;
    int height = 8;
    double tan = (double)width / height;
    System.out.printf("Width: %d, Height: %d, tan: %.2f\n", width, height, tan);

    // vertical loop
    for (int y = 0; y < height; y++) {
      // horizontal loop
      for (int x = 0; x < width; x++) {
        if (    y == 0                                // first horizontal line
            || y == height - 1                    // last horizontal line
            || x == 0                             // left vertical line
            || x == width - 1                     // right vertical line
            || x == Math.round(y * tan)           // diagonal line #1
            || width - 1 - x == Math.round(y*tan) // diagonal line #2
        ) {
          System.out.print("*");
        } else {
          System.out.print(" ");
        }
      }
      System.out.println(); // print an empty line or more caret to the new line
    }
  }
}
