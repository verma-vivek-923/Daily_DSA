class Solution {
    public String longestCommonPrefix(String[] strs) {
        int n=strs.length;
        StringBuilder st=new StringBuilder();
        st.append(strs[0]);

        for(int i=1;i<n;i++){
            StringBuilder temp=new StringBuilder();
            int j=0;

            while( j<strs[i].length() && j < st.length() && strs[i].charAt(j)==st.charAt(j) ){
                temp.append(strs[i].charAt(j));
                System.out.println(strs[i].charAt(j)+"=="+st.charAt(j));
                j++;
            }
            st=temp;   
        }
        return String.valueOf(st) ;
    }
}

public class LC_14_longestPre {
    public static void main(String[] args) {
        Solution s1=new Solution();

        System.out.println(s1.longestCommonPrefix(new String[]{"flower","flow","flight"}));
        System.out.println(s1.longestCommonPrefix(new String[]{"dog","racecar","car"}));
    }
}
