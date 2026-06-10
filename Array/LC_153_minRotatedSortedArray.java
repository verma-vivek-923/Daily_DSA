class Solution {
    public int findMin(int[] nums) {
        int n = nums.length;
        int k = 0;
        while(nums[k]>nums[n-1]){
            k++;
        }

        return nums[k];
    }
}

public class LC_153_minRotatedSortedArray {
    public static void main(String[] args) {
        Solution s1 = new Solution();

        System.out.println(s1.findMin(new int[] { 3, 4, 5, 1, 2 }));
        System.out.println(s1.findMin(new int[] { 4, 5, 6, 7, 0, 1, 2 }));
        System.out.println(s1.findMin(new int[] { 11, 13, 15, 17 }));
    }
}
