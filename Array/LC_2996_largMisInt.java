import java.util.ArrayList;

class Solution {
    public int missingInteger(int[] nums) {
        int n = nums.length;
        int seq = nums[0];
        int lsum = seq, sum = seq;
        ArrayList<Integer> al = new ArrayList<>();
        for (int num : nums) {
            al.add(num);
        }

        for (int i = 1; i < n; i++) {
            if (nums[i] != (nums[i - 1] + 1)) {
                break;
            } 
            sum += nums[i];
        }
        // return Math.max(lsum, sum);
        System.out.println("lsum="+lsum+" sum="+sum);
        int ans=Math.max(lsum, sum);
        while (al.contains(ans)) {
            ans++;
        }
        return ans;
    }
}

public class LC_2996_largMisInt {
    public static void main(String[] args) {
        Solution s1 = new Solution();
        System.out.println(s1.missingInteger(new int[] { 1, 2, 3, 2, 5 }));
        System.out.println(s1.missingInteger(new int[] { 3, 4, 5, 1, 12, 14, 13 }));
        System.out.println(s1.missingInteger(new int[] {29,30,31,32,33,34,35,36,37 }));
        System.out.println(s1.missingInteger(new int[] {14,9,6,9,7,9,10,4,9,9,4,4 }));
    }
}
