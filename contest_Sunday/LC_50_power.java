class Solution {
    public double myPow(double x, int n) {
        double pow=1;

        // if(n<0){
        //     x=1/x;
        //     n=-n;
        // }
        
        // for(double i=0;i<n;i++){
        //     pow*=x;
        // }

        pow=Math.pow(x, n);
        return pow;
    }
}

public class LC_50_power {
    public static void main(String[] args) {
        Solution s1=new Solution();
        System.out.println(s1.myPow(2, 3));
        System.out.println(s1.myPow(2, -2));
    }
}
