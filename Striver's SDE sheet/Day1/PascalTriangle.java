package Day1;

import java.util.ArrayList;
import java.util.List;

/*
 * Program to generate Pascal’s Triangle
Problem Statement: This problem has 3 variations. They are stated below:

Variation 1: Given row number r and column number c. Print the element at position (r, c) in Pascal’s triangle.

Variation 2: Given the row number n. Print the n-th row of Pascal’s triangle.

Variation 3: Given the number of rows n. Print the first n rows of Pascal’s triangle.
 */
public class PascalTriangle {

  // Variation 1 will be directly like nCr
  /*
  int res=1;
      for (int i = 0; i < r; i++) {
      res = res * (n - i);
      res = res / (i+1);
    }
    return res;
     */
  public static List<Integer> variation2(int numRow) {
    List<Integer> ans = new ArrayList<>();
    int currEl = 1;
    ans.add(currEl);
    for (int i = 1; i < numRow; i++) {
      currEl = currEl * (numRow - i);
      currEl = currEl / i;
      ans.add(currEl);
    }

    return ans;
  }

  public static List<List<Integer>> variation3(int numRows) {
    List<List<Integer>> ans = new ArrayList<>();
    ans.add(List.of(1));
    for (int i = 1; i < numRows; i++) {
      List<Integer> li = new ArrayList<>();
      int prev = 1;
      for (int j = 0; j <= i; j++) {
        li.add(prev);
        prev = prev * (i - j) / (j + 1);
      }
      ans.add(li);
    }
    return ans;
  }

  public static void main(String[] args) {}
}
