class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
        int full = numBottles;
        int empty = 0;
        int drunk = 0;

        if (full != 0) {
            empty = full;
            drunk += full;
            full = 0;
        }
        while (empty > numExchange) {
            System.out.println("inside");
            int rem = empty / numExchange;
            empty = empty % numExchange;
            drunk+=rem;
            empty+=rem;
            empty+=rem/numExchange;
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
    }
}