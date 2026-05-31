import java.util.HashMap;

class Solution {
    public int digitFrequencyScore(int n) {
        int l = 0, k = n, m = n;
        String str = String.valueOf(n);
        HashMap<Integer, Integer> map = new HashMap<>();

        while (k > 0) {
            int rem = k % 10;
            map.put(rem, map.getOrDefault(rem, 0) + 1);
            k = k / 10;
        }
        while (m > 0) {
            int rem = m % 10;
            if (map.containsKey(rem)) {
                l += rem * map.get(rem);
                map.remove(rem);
            }
            m=m/10;
        }
        return l;
    }
}

public class LC_3945_freqScore {
    public static void main(String[] args) {
        Solution s1 = new Solution();

        System.out.println(s1.digitFrequencyScore(122));
        System.out.println(s1.digitFrequencyScore(101));
    }
}
