package Blind_75;

import java.util.Arrays;

// By PreSum Post Sum method
class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int arr[] = new int[n];
        int pre[]=new int[n],suff[]=new int[n];
        int pref=1,suf=1;

        pre[0]=1;
        
        for(int i=1;i<n;i++){
                pref*=nums[i-1];
                pre[i]=pref;
        }
        System.out.println("Pref="+Arrays.toString(pre));
        
        suff[n-1]=1;
        for(int i=n-2;i>=0;i--){
            suf*=nums[i+1];
            suff[i]=suf;
        }
        
        System.out.println("suffs="+Arrays.toString(suff));
        
        for(int i=0;i<n;i++){
            arr[i]=pre[i]*suff[i];
        }
        
        System.out.println("Res="+Arrays.toString(arr));
        return arr;
    }
}

class Solution2 {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            int m = 1;
            for (int j = 0; j < n; j++) {
                if (i == j)
                    continue;
                m *= nums[j];
            }
            arr[i] = m;
        }
        return arr;
    }
}

public class LC_238_prodArrExcptSelf {
    public static void main(String[] args) {
        Solution s1 = new Solution();
        System.out.println(Arrays.toString(s1.productExceptSelf(new int[] { 1, 2, 3, 4 })));
        System.out.println(Arrays.toString(s1.productExceptSelf(new int[] { -1, 1, 0, -3, 3 })));

    }
}
