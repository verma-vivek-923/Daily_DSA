import java.util.*;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement)) {
                return new int[]{map.get(complement), i}; // return indices
            }
            map.put(nums[i], i);
        }

        return new int[0]; // no solution found
    }
}

public class TwoSum {
    public static void main(String[] args) {
        int[] arr = {2, 6, 7, 8, 3, 4, 5};
        int target = 8;

        Solution obj1 = new Solution();
        int[] result = obj1.twoSum(arr, target);

        System.out.println("Indices: " + Arrays.toString(result));
        if (result.length == 2)
            System.out.println("Values: " + arr[result[0]] + ", " + arr[result[1]]);
    }
}
