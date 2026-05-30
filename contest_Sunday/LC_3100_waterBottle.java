class Solution {
    public int maxBottlesDrunk(int numBottles, int numExchange) {
        int full = numBottles;
        int empty = 0;
        int drunk = 0;

        while (full != 0 || empty != 0 ) {
            if (full != 0) {
                drunk += full;
                empty = full;
                full = 0;
                continue;
            }
            
            if (numExchange <= empty) {
                System.out.println(empty);
                empty -= numExchange;


                System.out.println(empty);
                numExchange++;
                 if(empty==0){
                    drunk += empty;
                return drunk;
                 }
            } 
        }
        return drunk;
    }
}

public class LC_3100_waterBottle {
    public static void main(String[] args) {
        Solution s1 = new Solution();
        System.out.println(s1.maxBottlesDrunk(13, 6));
    }
}
