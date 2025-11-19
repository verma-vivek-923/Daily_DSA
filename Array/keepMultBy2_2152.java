class Solution {
    public int findAns(int[] arr, int original) {
        boolean found = true;

        while (found) {

            for (int i = 0; i < arr.length; i++) {
                if (arr[i] == original) {
                    original = original * 2;
                    found = true;
                    break;
                }
                found = false;
            }

        }

        return original;
    }
}

class Solution2 {
    public int findAns(int[] arr, int original) {

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == original) {
                original = original * 2;
            }
        }

        return original;
    }
}

public class keepMultBy2_2152 {
    public static void main(String[] args) {
        int[] arr = { 5, 3, 6, 1, 12 };

        Solution s1 = new Solution();
        int r = s1.findAns(arr, 3);
        System.out.println(r);
    }
}
