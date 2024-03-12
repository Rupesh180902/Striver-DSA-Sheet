package Day1;

import java.util.Collections;
import java.util.List;

/*
next_permutation : find next lexicographically greater permutation
Problem Statement: Given an array Arr[] of integers, rearrange the numbers of the given array into the lexicographically next greater permutation of numbers.

If such an arrangement is not possible, it must rearrange to the lowest possible order (i.e., sorted in ascending order).

Examples
Example 1 :
Input format: Arr[] = {1,3,2}
Output: Arr[] = {2,1,3}
Explanation: All permutations of {1,2,3} are {{1,2,3} , {1,3,2}, {2,1,3} , {2,3,1} , {3,1,2} , {3,2,1}}. So, the next permutation just after {1,3,2} is {2,1,3}.
 */
public class nextPermutation {

  public static List<Integer> next_permutation(List<Integer> arr) {
    int n = arr.size();
    int index = -1;
    for (int i = n - 2; i >= 0; i--) {
      if (arr.get(i) < arr.get(i + 1)) {
        index = i;
        break;
      }
    }
    if (index == -1) {
      Collections.reverse(arr);
      return arr;
    }
    // Step 2: Find the next greater element
    //         and swap it with arr[index]:

    for (int i = n - 1; i > index; i--) {
      if (arr.get(i) > arr.get(index)) {
        int tmp = arr.get(i);
        arr.set(i, arr.get(index));
        arr.set(index, tmp);
        break;
      }
    }

    // Step 3: reverse the right half:(as there is no dip reversing is similar to sorting.)
    List<Integer> sublist = arr.subList(index + 1, n);
    Collections.reverse(sublist);
    return arr;
  }

  public static void main(String[] args) {}
}
