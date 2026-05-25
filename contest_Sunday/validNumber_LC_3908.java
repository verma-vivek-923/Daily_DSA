import java.util.ArrayList;

class Solution {
    public boolean validDigit(int n, int x) {

        String str = String.valueOf(n);

        char ch = (char) (x + '0');

        System.out.println(str);

        if (str.charAt(0) == ch) {
            return false;
        }

        if(str.contains(String.valueOf(ch))){
            return true;
        }

        // for (int i = 1; i < str.length(); i++) {
        //     if (str.charAt(i) == ch) {
        //         System.out.println(str.charAt(i));
        //         System.out.println(x);
        //         return true;
        //     }
        // }

        return false;
    }
}

public class validNumber_LC_3908 {
    public static void main(String[] args) {
        Solution s1 = new Solution();

        System.out.println(s1.validDigit(101, 0));
        System.out.println(s1.validDigit(232, 2));
        System.out.println(s1.validDigit(5, 1));
    }
}
