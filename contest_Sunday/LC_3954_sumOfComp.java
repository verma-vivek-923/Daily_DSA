class Solution {
    public int sumOfGoodIntegers(int n, int k) {
         int m= (n-k>=0) ? n-k : 1;
         int sum=0;

         for(int i=m;i<=n+k;i++ ){
           if(Math.abs(n-i)<=k && (n & i)==0){
               sum+=i;
           }
         }
         return sum;
    }
}

public class LC_3954_sumOfComp {
    public static void main(String[] args) {
        Solution s1=new Solution();

        System.out.println(s1.sumOfGoodIntegers(2, 3));
        System.out.println(s1.sumOfGoodIntegers(5, 1));
    }
}
