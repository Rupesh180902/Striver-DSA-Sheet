package Day1;

import java.util.Arrays;

/*
 Sort an array of 0s, 1s and 2s
Problem Statement: Given an array consisting of only 0s, 1s, and 2s. Write a program to in-place sort the array without using inbuilt sort functions. ( Expected: Single pass-O(N) and constant space)

Examples
Input: nums = [2,0,2,1,1,0]
Output: [0,0,1,1,2,2]

Input: nums = [2,0,1]
Output: [0,1,2]

Input: nums = [0]
Output: [0]
 */
public class DutchNationalFlag {

  public static void bruteforce(int[] arr) {
    Arrays.sort(arr);
  }

  public static void better(int[] arr) {
    int[] temp = new int[3];
    for (int i = 0; i < arr.length; i++) {
      temp[arr[i]]++;
    }
    for (int i = 0; i < temp[0]; i++) {
      arr[i] = 0;
    }
    for (int i = temp[0]; i < temp[0] + temp[1]; i++) {
      arr[i] = 1;
    }
    for (int i = temp[0] + temp[1]; i < temp[0] + temp[1] + temp[3]; i++) {
      arr[i] = 2;
    }
  }

  public static void DNF(int[] arr) {
    int low = 0, mid = 0, high = arr.length - 1;
    while (mid <= high) {
      if (arr[mid] == 0) {
        int temp = arr[mid];
        arr[mid] = arr[low];
        arr[low] = temp;
        mid++;
        low++;
      } else if (arr[mid] == 1) {
        mid++;
      } else {
        int temp = arr[mid];
        arr[mid] = arr[high];
        arr[high] = temp;
        high--;
      }
    }
  }

  public static void main(String[] args) {}
}
