package a.tasks.arrays;

public class ArrayFillWith2 {
  public static void main(String[] args) {
    // creating initial data
    final int WIDTH = 20;
    final int HEIGHT = 13;
    final int a[][] = new int[HEIGHT][WIDTH];
    // process
    for (int row = 0; row < HEIGHT; row++) {
      for (int col = 0; col < WIDTH; col++) {
        a[row][col]=Math.min(
            Math.min(row+1,col+1),
            Math.min(HEIGHT - row, WIDTH - col)
        );
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
