class Solution {
    public int passwordStrength(String password) {
        int n = password.length();
        int strength = 0;

        String pass = "";
        String sym = "!@#$";

        for(int i=0;i<n;i++){
            if(!pass.contains(String.valueOf(password.charAt(i)))){
                pass+=password.charAt(i);
            }
        }
        System.out.println(pass);

        for (int i = 0; i < pass.length(); i++) {
            char ch = pass.charAt(i);
            if (ch >= 'a' && ch <= 'z') {
                strength += 1;
            } else if (ch >= 'A' && ch <= 'Z') {
                strength += 2;
            } else if (ch >= '0' && ch <= '9') {
                strength += 3;
            } else if (sym.contains(String.valueOf(ch))) {
                strength += 5;
            } else {
                strength += 0;
            }
        }
        return strength;

    }
}

class Solution2 {
    public int passwordStrength(String password) {
        int n = password.length();
        int strength = 0;

        String symbol="!@#$";
        String pass="";

        for(int i=0;i<n;i++){
            if(!pass.contains(String.valueOf(password.charAt(i)))){
                pass+=password.charAt(i);
            }
        }

        for (int i = 0; i < pass.length(); i++) {
            if (pass.charAt(i) >= 'a' && pass.charAt(i) <= 'z') {
                strength += 1;
            } else if (pass.charAt(i) >= 'A' && pass.charAt(i) <= 'Z') {
                strength += 2;
            } else if (pass.charAt(i) >= '0' && pass.charAt(i) <= '9') {
                strength += 3;
            } else if (symbol.contains( String.valueOf(pass.charAt(i)) )) {
                strength += 5;
            } else {
                strength += 0;
            }
        }
        return strength;

    }
}

public class passwordStrength {
    public static void main(String[] args) {
        Solution s1 = new Solution();
        // int r = s1.passwordStrength("aA1!");
        System.out.println(s1.passwordStrength("aA1!"));
        System.out.println(s1.passwordStrength("bbB11#"));
    }
}
