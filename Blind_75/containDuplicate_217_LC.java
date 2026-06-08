package Blind_75;

import java.util.Arrays;
import java.util.HashSet;


// BY Hashset method
class Solution3 {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> st = new HashSet<>();

        for (int i = 0; i < nums.length; i++) {
            st.add(nums[i]);
        }

        if (nums.length > st.size()) {
            return true;
        }

        return false;
    }
}

// Sorting Method
class Solution2 {
    public boolean containsDuplicate(int[] nums) {
        int arr[] = nums;

        Arrays.sort(arr);

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == arr[i + 1]) {
                return true;
            }
        }
        return false;
    }
}

public class containDuplicate_217_LC {
    public static void main(String[] args) {
        Solution s1 = new Solution();
        System.out.println(s1.containsDuplicate(new int[] { 1, 2, 3, 1 }));
        System.out.println(s1.containsDuplicate(new int[] { 1, 2, 3, 4 }));
        System.out.println(s1.containsDuplicate(new int[] { 1, 1, 1, 3, 3, 4, 3, 2, 4, 2 }));
    }
}
