

import java.util.ArrayList;
import java.util.HashMap;


// Brute Force
class Solution{
    public int firstStableIndex(int[] nums,int k){
        int n=nums.length;
        ArrayList<Integer> stable=new ArrayList<>();

        for(int i=0;i<n;i++){
            int max=0,min=Integer.MAX_VALUE;

            for(int j=0;j<=i;j++){
                if(nums[j]>max){
                    max=nums[j];
                }
            }
            for(int j=i;j<n;j++){
                if(nums[j]<min){
                    min=nums[j];
                }
            }
            // System.out.println("MAX="+max+" | MIn="+min);
            int instb=max-min;
            // System.out.println("I="+instb);
            if(instb<=k){   
                return i; 
            }
        }
        return -1;
    }
}



public class LC_3903_SmallestStable {
     public static void main(String[] args) {
        Solution s1=new Solution();

        System.out.println(s1.firstStableIndex(new int[]{5,0,1,4}, 3));
        System.out.println(s1.firstStableIndex(new int[]{3,2,1}, 1));
        System.out.println(s1.firstStableIndex(new int[]{0}, 1));
     }
}
