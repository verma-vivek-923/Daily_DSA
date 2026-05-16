import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

class Solution {
    public int[] countWordOccurrences(String[] chunks, String[] queries) {

        // Write your logic here
        String str = String.join("", chunks);

        Map<String, Integer> s = new HashMap();

        StringBuilder sb = new StringBuilder();

        ArrayList<Integer> res = new ArrayList<>();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            boolean isLetter = Character.isLetter(ch);

            boolean isHyphenValid = false;

            // if (ch == '-') {
            //     Character.isLowerCase(ch-1);
            //     Character.isLowerCase(ch+1);
            // }

            if (isLetter) {
                sb.append(ch);
            } else {
                if (sb.length() > 0) {
                    // s.add(sb.toString());
                    s.put(sb.toString(), s.getOrDefault(sb.toString(), 0) + 1);
                    sb.setLength(0);
                }
            }
        }
        if (sb.length() > 0) {
            s.put(sb.toString(), s.getOrDefault(sb.toString(), 0) + 1);
            sb.setLength(0);
        }

        int[] ans = new int[queries.length];

        for (int i = 0; i < queries.length; i++) {
            ans[i] = s.getOrDefault(queries[i], 0);
        }

        System.out.println(str);
        System.out.println(sb);
        System.out.println(s);
        return ans;

    }
}

public class LC_3926 {

    public static void main(String[] args) {

        Solution obj = new Solution();

        // Sample Input
        String[] chunks = { "hello wor", "ld hello" };
        String[] queries = { "hello", "world", "wor" };

        String[] chunks2 = { "a-b a--b ", "a-", "b" };
        String[] queries2 = { "a-b", "a", "b" };

        String[] chunks3 = { "-cat dog- mouse" };
        String[] queries3 = { "cat", "dog", "mouse", "cat-dog" };

        // Function Call
        int[] ans = obj.countWordOccurrences(chunks2, queries2);

        // Print Output
        System.out.println(Arrays.toString(ans));
    }
}