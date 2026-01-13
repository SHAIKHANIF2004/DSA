

class StockBuyAndSell {
    public int maxProfit(int[] prices) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for (int num : prices) {
            min = Math.min(min, num);        // minimum buying price so far
            max = Math.max(max, num - min);  // maximum profit so far
        }
        return max;
    }

    // Main method
    public static void main(String[] args) {
        StockBuyAndSell sol = new StockBuyAndSell();

        int[] prices = {7, 1, 5, 3, 6, 4};

        int profit = sol.maxProfit(prices);
        System.out.println("Maximum Profit: " + profit);
    }
}