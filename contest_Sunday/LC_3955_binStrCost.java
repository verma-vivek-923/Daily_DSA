import java.util.ArrayList;
import java.util.List;

import java.util.*;

class Solution {
    public List<String> generateValidStrings(int n, int k) {

        List<String> ans = new ArrayList<>();

        for (int num = 0; num < (1 << n); num++) {

            int cost = 0;
            boolean valid = true;
            StringBuilder sb = new StringBuilder();

            for (int i = n - 1; i >= 0; i--) {

                int bit = (num >> i) & 1;
                sb.append(bit);

                if (bit == 1) {
                    cost += (n - 1 - i); // actual index
                }

                // Check consecutive 1s
                if (sb.length() >= 2 &&
                    sb.charAt(sb.length() - 1) == '1' &&
                    sb.charAt(sb.length() - 2) == '1') {
                    valid = false;
                    break;
                }
            }

            if (valid && cost <= k) {
                ans.add(sb.toString());
            }
        }

        return ans;
    }
}
public class LC_3955_binStrCost {
    public static void main(String[] args) {
        Solution s1 = new Solution();
        System.out.println(s1.generateValidStrings(3, 1));
        System.out.println(s1.generateValidStrings(1, 0));

    }
}
