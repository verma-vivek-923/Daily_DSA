
import java.util.Arrays;

//OPtimized
class Solution {
    public int[] countBits(int n) {
        int ans[] = new int[n + 1];
        ans[0] = 0;

        for (int i = 1; i <= n; i++) {
            int rem = i % 2;
            ans[i] = ans[i / 2] + rem;
        }

        return ans;

    }
}


//Brute Force Approach
class Solution2 {
    public int[] countBits(int n) {
         int ans[]=new int[n+1];
        for(int i=0;i<=n;i++){
            int k=0,m=i;
                while(m>0){
                    int rem=m%2;
                      if(rem==1) k++;
                      m/=2; 
                }
                ans[i]=k;
        }
        return ans;
        
    }
}

public class LC_338_countingBit {
    public static void main(String[] args) {
        Solution s1=new Solution();
       System.out.println(Arrays.toString(s1.countBits(5)));
       System.out.println(Arrays.toString(s1.countBits(2)));
    }
}
