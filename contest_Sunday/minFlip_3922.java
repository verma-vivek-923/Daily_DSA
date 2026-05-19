class Solution {
    public int minFlips(String s) {
        int z = 0, o = 0;
        int n=s.length();

        for (int i = 0; i < n; i++) {
            if (s.charAt(i) == '0')
                z++;
            else
                o++;
        }

        if (z == 0 || o == 0)
            return 0;

        if(s.charAt(0)=='1' && s.charAt(n-1)=='1') o=o-1;

        return Math.min(z, o-1);
    }
}

public class minFlip_3922 {
    public static void main(String[] args) {
        Solution s1 = new Solution();

        System.out.println(s1.minFlips("1010"));
    }
}



// class Solution2 {
//     public int minFlips(String s) {
//         int[] f = { 0, -1 };
//         int n = s.length();

//         for (int i = 0; i < n; i++)
//             f[s.charAt(i) & 1]++;

//         if (f[0] == 0 || f[1] == -1)
//             return 0;

//         return Math.min(
//                 f[0],
//                 f[1] - (s.charAt(0) & s.charAt(n - 1) & 1));
//     }
// }


