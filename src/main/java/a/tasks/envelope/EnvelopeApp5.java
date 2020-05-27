package a.tasks.envelope;

public class EnvelopeApp5 {

  static void print_asterisk() {
    System.out.print("*");
  }

  static void print_space() {
    System.out.print(" ");
  }

  static void print_newline() {
    System.out.println();
  }

  static double calc_ratio(int width, int height) {
    return (double)width / height;
  }

  static boolean isLeft(int x) {
    return x == 0;
  }

  static boolean isRight(int x, int width) {
    return x == width - 1;
  }

  static boolean isUp(int y) {
    return y == 0;
  }

  static boolean isDown(int y, int height) {
    return y == height - 1;
  }

  static boolean isDiagonal(int x, int y, int width, double tan) {
    return x == Math.round(y * tan)           // diagonal line #1
        || width - 1 - x == Math.round(y*tan);
  }

  static boolean isEligibleToBeFilled(int x, int y, int width, int height, double tan) {
    return isUp(y) || isDown(y, height) || isLeft(x) || isRight(x, width) || isDiagonal(x, y, width, tan);
  }

  public static void main(String[] args) {
    int width = 22;
    int height = 8;
    double tan = calc_ratio(width, height);
    System.out.printf("Width: %d, Height: %d, tan: %.2f\n", width, height, tan);

    // vertical loop
    for (int y = 0; y < height; y++) {
      // horizontal loop
      for (int x = 0; x < width; x++) {
        if ( isEligibleToBeFilled(x, y, width, height, tan)) {
          print_asterisk();
        } else {
          print_space();
        }
      }
      print_newline(); // print an empty line or more caret to the new line
    }
  }
}
