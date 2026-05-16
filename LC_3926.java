import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

class Solution {
    public int[] countWordOccurrences(String[] chunks, String[] queries) {

        // Write your logic here
        String str = String.join("", chunks);

        Map<String,Integer> s=new HashMap();

        StringBuilder sb = new StringBuilder();

        ArrayList<Integer> res = new ArrayList<>();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            boolean isLetter = Character.isLetter(ch);

            if (isLetter) {
                sb.append(ch);
            } else {
                if (sb.length() > 0) {
                    // s.add(sb.toString());
                    s.put(sb.toString(), s.getOrDefault(sb.toString(),0)+1);
                    sb.setLength(0);
                }
            }
        }
        if (sb.length() > 0) {
            s.put(sb.toString(), s.getOrDefault(sb.toString(),0)+1);
            sb.setLength(0);
        }

        int[] ans = new int[queries.length];

        for (int i = 0; i < queries.length; i++) {
           ans[i]=s.getOrDefault(queries[i],0);
        }

        return ans;

    }
}

public class LC_3926 {

    public static void main(String[] args) {

        Solution obj = new Solution();

        // Sample Input
        String[] chunks = { "hello wor", "ld hello" };
        String[] queries = { "hello", "world", "wor" };

        // Function Call
        int[] ans = obj.countWordOccurrences(chunks, queries);

        // Print Output
        System.out.println(Arrays.toString(ans));
    }
}