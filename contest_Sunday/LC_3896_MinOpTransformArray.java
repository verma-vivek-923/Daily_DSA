class Solution {

    boolean isPrime(int n) {
        if (n == 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public int minOperations(int[] nums) {
        int op = 0;
        int n = nums.length;

        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                while (!isPrime(nums[i])) {
                    nums[i] += 1;
                    op++;
                }
            } else {
                if (i % 2 != 0) {
                    while (isPrime(nums[i])) {
                        nums[i] += 1;
                        op++;
                    }
                }

            }
        }
        return op;
    }
}

public class LC_3896_MinOpTransformArray {
    public static void main(String[] args) {
        Solution s1 = new Solution();
        System.out.println(s1.minOperations(new int[]{1,2,3,4}));

    }
}
