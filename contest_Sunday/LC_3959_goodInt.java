class Solution {
    public boolean checkGoodInteger(int n) {
      
        int dsum=0,ssum=1,num=n;

        while(num>0){
            int rem=num%10;
            dsum+=rem;
            ssum+=(rem*rem);
            num/=10;
        }
        if(ssum-dsum>=50){
            return true;
        }
        return false;
    }
}

public class LC_3959_goodInt {
     public static void main(String[] args) {
        Solution s1=new Solution();
        System.out.println(s1.checkGoodInteger(1000));
        System.out.println(s1.checkGoodInteger(19));
     }
}
