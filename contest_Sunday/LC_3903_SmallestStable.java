

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

// Optimized
class Solution {
    public int firstStableIndex(int[] nums, int k) {
        int n = nums.length;
        int max = nums[0], min = Integer.MAX_VALUE, minIdx=0;
        for (int i = 0; i < n; i++) {
            if (nums[i] < min) {
                min = nums[i];
                minIdx = i;
            }
        }
        for (int i = 0; i < n; i++) {
            if (nums[i] > max) {
                max = nums[i];
            }
            if (i > minIdx) {
                min=Integer.MAX_VALUE;
                for (int j = i; j < n; j++) {
                    if (nums[j] < min) {
                        min = nums[j];
                    }
                }
            }
            int instb = max - min;
            if (instb <= k) {
                return i;
            }
        }
        return -1;
    }
}

// More Optimize
class Solution_t{
    public int firstStableIndex(int[] nums,int k){
        int n=nums.length;
        int max=0;
        int[] min=new int[n];
        min[n-1]=nums[n-1];
        ArrayList<Integer> stable=new ArrayList<>();

        for(int i=n-2;i>=0;i--){
            min[i]=Math.min(nums[i],min[i+1]);
        }
        
        for(int i=0;i<n;i++){
                max=Math.max(nums[i], max);
            int instb=max-min[i];
            if(instb<=k){   
                return i; 
            }
        }
    
        return -1;
    }
}



public class LC_3903_SmallestStable {
     public static void main(String[] args) {
        Solution_t s1=new Solution_t();

        System.out.println(s1.firstStableIndex(new int[]{5,0,1,4}, 3));
        System.out.println(s1.firstStableIndex(new int[]{3,2,1}, 1));
        System.out.println(s1.firstStableIndex(new int[]{0}, 1));
     }
}
