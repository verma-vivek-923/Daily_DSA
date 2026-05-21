import java.util.ArrayList;

class Solution {
    public int[] countOppositeParity(int[] nums) {
        int n=nums.length;
        

        int[] newarr=new int[nums.length];

        for(int i=0;i<n;i++){
            int c=0,ch=0;
                 if(nums[i]==0) ch=1;

                 int j=ch==1 ? i+2 : i+1;

                 while(j<n){
                  c++;
                 }
                 newarr[i]=c;
        }

        return newarr;
    }
}
public class LC_3917 {
    
}
