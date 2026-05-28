class Solution {
    public int countDigitOccurrences(int[] nums, int digit) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            while (nums[i] > 0) {
                int rem = nums[i] % 10;
                if (rem == digit) {
                    count++;
                }
                nums[i] /= 10;
            }
        }
        return count;
    }
}

// String str=String.valueOf(nums[i]);

// System.out.println(str);

// if(str.contains(String.valueOf(digit))){
// System.out.println(digit+" inside");
// count ++;
// }

public class LC_3895_CountOccurence {
    public static void main(String[] args) {
        Solution s1 = new Solution();

        System.out.println(s1.countDigitOccurrences(new int[] { 12, 54, 32, 22 }, 2));
    }
}
