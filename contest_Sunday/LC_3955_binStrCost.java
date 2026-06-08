import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<String> generateValidStrings(int n, int k) {
        List<String> str = new ArrayList<>();

        for(int i = 0; i <= n; i++) {
            int m=i;
            int sum = 0;
            int p = 0;
            // System.out.println("inside"+i);
            StringBuilder s=new StringBuilder();
            while (m > 0) {
                int rem = m % 2;
                if (rem == 1) {
                    sum +=( n - p);
                }
                s.append(rem);
                p++;
                m /= 2;
            }
            System.out.println("str="+s);
            if (sum <= k) {
                str.add(String.valueOf(sum));
            }
        }
        return str;
    }
}

public class LC_3955_binStrCost {
    public static void main(String[] args) {
        Solution s1 = new Solution();
        System.out.println(s1.generateValidStrings(3, 1));
        System.out.println(s1.generateValidStrings(1, 0));

    }
}
