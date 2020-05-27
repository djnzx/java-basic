package a.tasks.arrays;

public class ArrayFillWith1 {
  public static void main(String[] args) {
    // creating initial data
    final int WIDTH = 20;
    final int HEIGHT = 13;
    final int a[][] = new int[HEIGHT][WIDTH];
    final int MIN = 1;
    final int MAX = (Math.min(WIDTH, HEIGHT)+1)/2;
    // process
    for (int level=MIN;level<=MAX;level++){
      for (int row = 0; row < HEIGHT; row++) {
        for (int col = 0; col < WIDTH; col++) {
          if ((row + 1      == level && col+1 >= level && WIDTH-col >= level) ||
              (HEIGHT - row == level && col+1 >= level && WIDTH-col >= level) ||
              (false) ||
              (false)
          ) a[row][col]=level;
        }
      }
    }

    // output
    StringBuilder out = new StringBuilder();
    for (int row = 0; row < HEIGHT; row++) {
      for (int col = 0; col < WIDTH; col++) {
        out.append(String.format("%d ", a[row][col]));
      }
      out.append("\n");
    }
    System.out.println(out);
  }
}
