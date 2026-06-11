import java.util.Arrays;

class Solution {
    public String longestCommonPrefix(String[] strs) {
        
        Arrays.sort(strs);
        int n=Math.min(strs[0].length(), strs[strs.length-1].length());

        System.out.println(Arrays.toString(strs));
        StringBuilder st=new StringBuilder();

        for(int i=0;i<n;i++){
               if(strs[0].charAt(i)!=strs[strs.length-1].charAt(i)){
                return String.valueOf(st);
               }
            st.append(strs[0].charAt(i));
        }

        return String.valueOf(st);
    }
}

class Solution2 {
    public String longestCommonPrefix(String[] strs) {
        int n = strs.length;
        StringBuilder st = new StringBuilder();
        st.append(strs[0]);

        for (int i = 1; i < n; i++) {
            StringBuilder temp = new StringBuilder();
            int j = 0;

            while (j < strs[i].length() && j < st.length() && strs[i].charAt(j) == st.charAt(j)) {
                temp.append(strs[i].charAt(j));
                System.out.println(strs[i].charAt(j) + "==" + st.charAt(j));
                j++;
            }
            st = temp;
        }
        return String.valueOf(st);
    }
}

public class LC_14_longestPre {
    public static void main(String[] args) {
        Solution s1 = new Solution();

        System.out.println(s1.longestCommonPrefix(new String[] { "flower", "flow", "flight" }));
        System.out.println(s1.longestCommonPrefix(new String[] { "dog", "racecar", "car" }));
        System.out.println(s1.longestCommonPrefix(new String[] {"preheat","ovengyugy","prehistoric" }));
    }
}
