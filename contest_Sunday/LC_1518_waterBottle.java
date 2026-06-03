class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
        int empty =numBottles;
        int drunk = numBottles;
        while (empty >= numExchange) {
            int bt = empty / numExchange;
             int rem=empty% numExchange;
            empty = bt;
            empty+=rem;
            drunk+=bt;
        }
        return drunk;
    }
}


class LC_1518_waterBottle {
    public static void main(String[] args) {
        Solution s1 = new Solution();
        System.out.println(s1.numWaterBottles(9,3));
        System.out.println(s1.numWaterBottles(15,4));
        System.out.println(s1.numWaterBottles(25, 4));
        System.out.println(s1.numWaterBottles(65, 3));
    }
}
