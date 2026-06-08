package Blind_75;

import java.util.Arrays;

//Brute Force
class Solution {
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
