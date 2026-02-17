import java.util.*;

class Solution1 {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            //System.out.println(map);
            int complement = target - nums[i];
            if (map.containsKey(complement)) {
                return new int[]{map.get(complement), i}; // return indices
            }
            map.put(nums[i], i);
        }

        return new int[0]; // no solution found
    }
}

class Solution2 {
    public int[] twoSum(int[] nums, int target) {
        // Check all pairs
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    // Return indices if sum matches
                    return new int[]{i, j};
                }
            }
        }
        // If no pair found (LeetCode guarantees one)
        return new int[0];
    }
}

public class TwoSum {
    public static void main(String[] args) {
        int[] arr = {2,7, 8, 3,6, 4, 5};
        int target = 8;

        Solution1 obj1 = new Solution1();
        Solution2 ob1 = new Solution2();
        int[] result = obj1.twoSum(arr, target);

        System.out.println("Indices: " + Arrays.toString(result));
        if (result.length == 2)
            System.out.println("Values: " + arr[result[0]] + ", " + arr[result[1]]);
    }
}
