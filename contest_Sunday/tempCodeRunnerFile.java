class Solution {
    public int maxBottlesDrunk(int numBottles, int numExchange) {
        int full = numBottles;
        int empty = 0;
        int drunk = 0;
        int bt=0;

        while (full != 0 || empty != 0 ) {
            System.out.println("inside"+ full +" "+ empty);
            if (full != 0) {
                drunk += full;
                empty = full;
                full = 0;
                continue;
            }   
            if (numExchange <= empty) {
                System.out.println(empty);
                empty -= numExchange;
                bt++;
                System.out.println(empty);
                numExchange++;
            } else if(numExchange>empty ){
                drunk+=bt;
                empty+=bt;
                bt=0;
            }
             if(empty==0){
                drunk+=bt;
                return drunk;
            }
        }
        return drunk;
    }
}

