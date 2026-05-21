class Solution {
    public int sumOfPrimesInRange(int n) {
        int rev = 0,num=n;
        while (num > 0) {
            int rem = num % 10;
            rev = rev * 10 + rem;
            num = num / 10;
        }

        System.out.println("Rev="+rev);
        
        int min = Math.min(n, rev);
        int max = Math.max(n, rev);

        System.out.println("Min="+min);
        System.out.println("Max="+max);

        int sum = 0;

        System.out.print("Primes=");

        for (int i = min; i <= max; i++) {
            int c = 0;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    c++;
                    break;
                }
            }
            if (c == 0 && i>1) {
                System.out.print(i+" ");
                sum = sum + i;
            }
        }
        System.out.println("\nSum"+sum);
        return sum;
    }
}

public class SumOfPrime_NandrevN_LC_3918 {
     public static void main(String[] args) {
        Solution s1=new Solution();

       System.out.println("Res="+s1.sumOfPrimesInRange(10))  ;
     }
}
