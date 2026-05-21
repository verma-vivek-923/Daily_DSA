// Brute Force
class Solution {
    public int[] countOppositeParity(int[] nums) {
        int n = nums.length;
        int[] newarr = new int[n];
        for (int i = 0; i < n; i++) {
            int k = 0;
            for (int j = i + 1; j < n; j++) {
                if ((nums[i] % 2 == 0 && nums[j] % 2 != 0) || (nums[i] % 2 != 0 && nums[j] % 2 == 0)) {
                    k++;
                }
            }
            newarr[i] = k;
        }
        return newarr;
    }
}



public class CountOppParity_LC_3917 {
    public static void main(String[] args) {

    }
}
