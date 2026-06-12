class Solution {
    public boolean isPalindrome(String s) {

        StringBuilder str = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            if ((s.charAt(i) >= 32 && s.charAt(i) <= 47) || (s.charAt(i) >= 58 && s.charAt(i) <= 64) || (s.charAt(i) >= 91 && s.charAt(i) <= 96) || (s.charAt(i) >= 123 && s.charAt(i) <= 127)) {
                continue;
            }
            if (s.charAt(i) >= 'A' && s.charAt(i) <= 'Z') {
                str.append((char) (s.charAt(i) + 32));
                continue;
            }
            str.append(s.charAt(i));
        }
        System.out.println(str);
        int n = str.length();
        for (int i = 0; i < n/2; i++) {
            System.out.println(str.charAt(i) +" =="+str.charAt(n - i - 1));
            if (str.charAt(i) != str.charAt(n - i - 1)) {
                    return false;
            }
        }
        return true;
    }
}

public class LC_125_validPalin {
    public static void main(String[] args) {
        Solution s1=new Solution();
        System.out.println(s1.isPalindrome("A man, a plan, a canal: Panama"));
        System.out.println(s1.isPalindrome("race a car"));
        System.out.println(s1.isPalindrome( " "));
    }
}
