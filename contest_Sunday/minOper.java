class Solution {
    public int minOperations(int[] nums, int k) {

        int[] arr = nums;

        int n = nums.length;

        int ans = Integer.MAX_VALUE;

        for (int i = 0; i < k; i++) {

            for (int j = 0; j < k; j++) {

                if (i == j) {
                    continue;
                }

                int cost = 0;

                for (int l = 0; l < n; l++) {

                    int rem = nums[l] % k;

                    int t;

                    if (l % 2 == 0) {
                        t = i;
                    } else {
                        t = j;
                    }

                    int diff = Math.abs(rem - t);

                    cost += Math.min(diff, k - diff);
                }

                ans = Math.min(ans, cost);
            }
        }

        return ans;
    }
}

class minOper{
    public static void main(String[] args) {
        Solution s1=new Solution();
        System.out.println(s1.minOperations(new int[]{1,4,2,8}, 3));
    }
}