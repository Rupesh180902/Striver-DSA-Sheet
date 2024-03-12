package Day1;

/*
 Kadane’s Algorithm : Maximum Subarray Sum in an Array
Problem Statement: Given an integer array arr, find the contiguous subarray (containing at least one number) which
has the largest sum and returns its sum and prints the subarray.
 */
public class kadanes {

  public static int bruteforce(int[] arr) {
    int maxSum = Integer.MIN_VALUE, currSum;
    for (int i = 0; i < arr.length; i++) {
      for (int j = i; j < arr.length; j++) {
        currSum = 0;
        for (int k = i; k <= j; k++) {
          currSum = currSum + arr[k];
          maxSum = Math.max(maxSum, currSum);
        }
      }
    }
    return maxSum;
  }

  public static int better(int[] arr) {
    int maxSum = Integer.MIN_VALUE, currSum;
    for (int i = 0; i < arr.length; i++) {
      currSum = 0;
      for (int j = i; j < arr.length; j++) {
        currSum = currSum + arr[j];
        maxSum = Math.max(maxSum, currSum);
      }
    }
    return maxSum;
  }

  public static int kadane(int[] arr) {
    int maxSum = 0, currSum = 0;
    for (int i = 0; i < arr.length; i++) {
      currSum += arr[i];
      maxSum = Math.max(maxSum, currSum);
      if (currSum < 0) {
        currSum = 0;
      }
    }
    return maxSum;
  }

  public static void main(String[] args) {}
}
