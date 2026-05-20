
import java.util.ArrayList;
import java.util.Arrays;

class Solution {
    public int minGenerations(int[][] points, int[] target) {
        int k = 0, n = 0;
        int f = 0;

        if(points.length<2){ return -1;}

        ArrayList<int[]> newarr = new ArrayList<>();
        for (int i = 0; i < points.length; i++) {
            newarr.add(Arrays.copyOf(points[i], points[i].length));
        }
        int j = 0;

        while (j <= n && j<=10) {
            n = newarr.size();
            for (int i = 0; i < n; i++) {
                int[] r = newarr.get(i);
                // System.out.println("r1=" + r[0]);
                // System.out.println("t1=" + target[0]);
                if (r[0] == target[0] && r[1] == target[1] && r[2] == target[2]) {
                    // System.out.println("Inside 1");
                    f++;
                }
            }

            System.out.println("list=" +
            java.util.Arrays.deepToString(newarr.toArray()));

            if (f > 0) {
                // System.out.println("Inside f");
                return k;
            }
            
            for (int i = 0; i < n-1; i++) {
                int[] c = new int[3];

                c[0] = (int) Math.floor((newarr.get(n - 1)[0] + newarr.get(i)[0]) / 2);
                c[1] = (int) Math.floor((newarr.get(n - 1)[1] + newarr.get(i)[1]) / 2);
                c[2] = (int) Math.floor((newarr.get(n - 1)[2] + newarr.get(i)[2]) / 2);
                newarr.add(c);
                
            }
            

            k++;
            j++;

        }

        return -1;
    }
}

public class LC_3923_minGenTarPoint {

    public static void main(String[] args) {
        Solution s1 = new Solution();

        int mat[][] = { { 0, 0, 0 }, { 6, 6, 6 } };
        int t[] = { 3,3,3 };

        int mat2[][] = { { 0, 0, 0 }, { 5, 5, 5 } };
        int t2[] = { 1, 1, 1 };
        
        int mat3[][] = { { 0, 0, 0 }, { 2,2,2 } ,{3,3,3}};
        int t3[] = { 2,2,2 };

        
        System.out.println("res=" + s1.minGenerations(mat7, t7));

        // System.out.println("put="+ Math.floor(2.6));
    }
}