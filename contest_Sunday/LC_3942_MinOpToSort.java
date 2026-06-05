class Solution {

    public int minOperations(int[] nums) {

        int n = nums.length;

        // Check rotations of sorted array
        for (int shift = 0; shift < n; shift++) {

            boolean valid = true;

            for (int i = 0; i < n; i++) {

                if (nums[(i + shift) % n] != i) {

                    valid = false;
                    break;
                }
            }

            if (valid) {
                return Math.min(shift, 1 + (n - shift) % n);
            }
        }

        // Check rotations of reversed sorted array
        for (int shift = 0; shift < n; shift++) {

            boolean valid = true;

            for (int i = 0; i < n; i++) {

                int expected = n - 1 - i;

                if (nums[(i + shift) % n] != expected) {

                    valid = false;
                    break;
                }
            }

            if (valid) {
                return Math.min(1 + shift, (n - shift) % n);
            }
        }

        return -1;
    }
}