class Solution {
    public boolean consecutiveSetBits(int n) {
        int num=n;
        int y=0;
        int c=0;
         while(num>0){
             int rem=num%2;
        
             if(rem==1 && c==1) y++;
             c=rem;
             num/=2;
         }
        if(y==1){
            return true;
        }
        return false;
    }
}

public class LC_3950_bitOneConsecutive {
    public static void main(String[] args) {
       Solution s1=new Solution();
       System.out.println(s1.consecutiveSetBits(6));
    }
}
