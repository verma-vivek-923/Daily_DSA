class Solution {
    public int maxProfit(int[] prices) {
        int maxp = 0, n = prices.length;
        int minv = prices[n - 1], maxv = 0, mini = n - 1, maxi = 0;

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                int profit = prices[j] - prices[i];
                // System.out.println(profit);
                maxp = Math.max(maxp, profit);
            }
        }
        // for (int i = n - 1; i >= 0; i--) {
        // if (prices[i] < minv) {
        // minv = prices[i];
        // mini = i;
        // }
        // }
        // for(int i=mini;i<n;i++){
        // maxv=Math.max(maxv, prices[i]);
        // }
        // System.out.println("mavx=" + maxv + "| minv= "+ minv + " | mini="+ mini );

        // return maxv-minv;
        return maxp;
    }
}

public class LC_121_daySellStock {
    public static void main(String[] args) {
        Solution s1 = new Solution();

        // System.out.println(s1.maxProfit(new int[] { 7, 1, 5, 3, 6, 4 }));
        // System.out.println(s1.maxProfit(new int[] { 7, 6, 4, 3, 1 }));
        System.out.println(s1.maxProfit(new int[] { 2, 4, 1 }));
    }
}
