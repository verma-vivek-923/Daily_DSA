import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<Integer> findValidElements(int[] nums) {

        ArrayList<Integer> arr = new ArrayList<>();
        int n=nums.length;

        arr.add(nums[0]);
        for (int i = 1; i < n - 1; i++) {
            int c = 0;

            for (int j = 0; j < i; j++) {
                if (nums[i] <= nums[j]) {
                    c++;
                    break;
                }
            }
            if (c != 0) {
                c = 0;
                for (int j = i + 1; j < n; j++) {
                    if (nums[i] <= nums[j]) {
                        c++;
                        break;
                    }
                }
            }
            if (c == 0) {
                arr.add(nums[i]);
            }
        }

        if(n > 1){
            arr.add( (nums[n - 1]));
        }

        return arr;
    }
}

public class LC_3912_ValidElement {
    public static void main(String[] args) {
        Solution s1 = new Solution();

        System.out.println(s1.findValidElements(new int[] { 1, 2, 4, 2, 3, 2 }));
        System.out.println(s1.findValidElements(new int[] { 5,5,5,5 }));
        System.out.println(s1.findValidElements(new int[] { 1}));
        System.out.println(s1.findValidElements(new int[] { 2,10}));
    }
}
