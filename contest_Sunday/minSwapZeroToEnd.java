import java.util.ArrayList;
import java.util.Arrays;

class Solution {
    public int minimumSwaps(int[] nums) {
        int n = nums.length;
        int k = n - 1;
        int c = 0;
        // System.out.println("k="+k);
        for (int i = 0; i < n; i++) {
            while (k > i && nums[k] == 0) {
                k--;
            }
            // for(int j=n-1;j>=0;j--){
            // if(nums[j]==0){
            // k--;
            // }else{
            // k=j;
            // break;
            // }
            // }
            if (k <= i) {
                break;
            }
            if (nums[i] == 0) {
                int t = nums[i];
                nums[i] = nums[k];
                nums[k] = t;
                k--;
                c++;
            }
        }
        return c;
    }
}

class minSwapZeroToEnd {
    public static void main(String[] args) {
        // Solution s1 = new Solution();

        // System.out.println(s1.minimumSwaps(new int[] { 0, 1, 0, 3, 12 }));
        // System.out.println(s1.minimumSwaps(new int[] { 0, 1, 0, 2 }));
        // System.out.println(s1.minimumSwaps(new int[] { 1, 2, 0 }));
        // // System.out.println(s1.minimumSwaps(new int[] { 0, 0 }));
        // System.out.println(s1.minimumSwaps(new int[] { 0, 0, 0, 57 }));

        ArrayList<Integer> arr=new ArrayList<>();

        arr.add(5);
        arr.add(2);
        arr.add(3);
        arr.add(9);

        System.out.println(arr.get(0));
    }
}