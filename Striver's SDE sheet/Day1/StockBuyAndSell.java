package Day1;

/*
 Stock Buy And Sell
Problem Statement: You are given an array of prices where prices[i] is the price of a given stock on an ith day.

You want to maximize your profit by choosing a single day to buy one stock and choosing a different day in the future to sell that stock. Return the maximum profit you can achieve from this transaction. If you cannot achieve any profit, return 0.

Examples
Example 1:

Input: prices = [7,1,5,3,6,4]
Output: 5
Explanation: Buy on day 2 (price = 1) and 
sell on day 5 (price = 6), profit = 6-1 = 5.

Note: That buying on day 2 and selling on day 1 
is not allowed because you must buy before 
you sell.

Example 2:

Input: prices = [7,6,4,3,1]
Output: 0
Explanation: In this case, no transactions are 
done and the max profit = 0.
 */
public class StockBuyAndSell {

  public static int stockBrute(int[] arr) {
    int maxProfit = 0;
    for (int i = 0; i < arr.length; i++) {
      for (int j = i + 1; j < arr.length; j++) {
        maxProfit = Math.max(maxProfit, arr[j] - arr[i]);
      }
    }
    return maxProfit;
  }

  public static int stock(int[] arr) {
    int maxProfit = 0, buyPrice = arr[0];
    for (int i = 1; i < arr.length; i++) {
      maxProfit = Math.max(maxProfit, arr[i] - buyPrice);
      if (buyPrice > arr[i]) {
        buyPrice = arr[i];
      }
    }

    return maxProfit;
  }

  public static void main(String[] args) {}
}
