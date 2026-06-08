class Solution {
    public int hammingWeight(int n) {
        int num=n,k=0;

        while(num>0){
            int rem=num%2;
            if(rem==1){
                k++;
            }
            num/=2;
        }
        return k;
    }
}

public class LC_191_NoOfOneBit{
    public static void main(String[] args) {
        Solution s1=new Solution();
        System.out.println(s1.hammingWeight(11));
        System.out.println(s1.hammingWeight(128));
        System.out.println(s1.hammingWeight(2147483645));
    }
}
