package Day2;

public class RotateImageBy90 {

  public static void rotateBrute(int[][] matrix) {
    int[][] temp = new int[matrix.length][matrix[0].length];
    for (int i = 0; i < matrix.length; i++) {
      for (int j = 0; j < matrix[0].length; j++) {
        temp[j][matrix.length - i - 1] = matrix[i][j];
      }
    }
  }

  public static void rotate(int[][] mat) {
    for (int i = 0; i < mat.length; i++) {
      for (int j = i; j < mat[0].length; j++) {
        int temp = mat[j][i];
        mat[j][i] = mat[i][j];
        mat[i][j] = temp;
      }
    }
    for (int i = 0; i < mat.length; i++) {
      for (int j = 0; j < mat[0].length / 2; j++) {
        int temp = mat[i][j];
        mat[i][j] = mat[i][mat[0].length - j - 1];
        mat[i][mat[0].length - j - 1] = temp;
      }
    }
  }

  public static void main(String[] args) {}
}
