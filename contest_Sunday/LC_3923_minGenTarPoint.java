
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

class Solution {
    public int minGenerations(int[][] points, int[] target) {
        int k = 0, n = 0;
        int f = 0;

        HashSet<String> check = new HashSet<>();

        if (points.length < 2) {
            return -1;
        }

        ArrayList<int[]> newarr = new ArrayList<>();
        for (int i = 0; i < points.length; i++) {
            newarr.add(Arrays.copyOf(points[i], points[i].length));
             check.add(Arrays.toString(points[i]));
        }
        int j = 0;

        while (true) {
            n = newarr.size();
            for (int i = 0; i < n; i++) {
                int[] r = newarr.get(i);
                // //System.out.println("r1=" + r[0]);
                // //System.out.println("t1=" + target[0]);
                if (r[0] == target[0] && r[1] == target[1] && r[2] == target[2]) {
                    // //System.out.println("Inside 1");
                    return k;
                }
            }

            //System.out.println("list=" +
                    java.util.Arrays.deepToString(newarr.toArray()));

             if(points.length < 2){
                return 0;
            }

          ArrayList<int[]> newgen = new ArrayList<>();

            //System.out.println("N=" + n);
            for (int i = 0; i < n - 1; i++) {
                for (int l = i + 1; l < n; l++) {
                    int[] c = new int[3];
                    c[0] = (int) Math.floor((newarr.get(l)[0] + newarr.get(i)[0]) / 2);
                    c[1] = (int) Math.floor((newarr.get(l)[1] + newarr.get(i)[1]) / 2);
                    c[2] = (int) Math.floor((newarr.get(l)[2] + newarr.get(i)[2]) / 2);

                    //System.out.println("hashset="+check);

                    if (!check.contains(Arrays.toString(c))) {
                         newgen.add(c);
                        check.add(Arrays.toString(c));
                    } else {
                        //System.out.println("already");
                    }

                }

            }

            if(newgen.size()==0){
                return -1;
            }

            for(int i=0;i<newgen.size();i++){
                newarr.add(newgen.get(i));
            }

            k++;
            j++;

        }

    }
}

public class LC_3923_minGenTarPoint {

    public static void main(String[] args) {
        Solution s1 = new Solution();

        int mat[][] = { { 0, 0, 0 }, { 6, 6, 6 } };
        int t[] = { 3, 3, 3 };

        int mat2[][] = { { 0, 0, 0 }, { 5, 5, 5 } };
        int t2[] = { 1, 1, 1 };

        int mat3[][] = { { 0, 0, 0 }, { 2, 2, 2 }, { 3, 3, 3 } };
        int t3[] = { 2, 2, 2 };

        
        System.out.println("res=" + s1.minGenerations(mat, t));

        
    }
}



    public int minGenerations(int[][] points, int[] target) {

        int k = 0;

        HashSet<String> check = new HashSet<>();


        // all available points
        ArrayList<int[]> newarr = new ArrayList<>();


        // copy initial points
        for (int i = 0; i < points.length; i++) {

            newarr.add(Arrays.copyOf(points[i], points[i].length));

            check.add(Arrays.toString(points[i]));
        }


        while (true) {

            // ===== check target =====

            for (int i = 0; i < newarr.size(); i++) {

                int[] r = newarr.get(i);

                if (r[0] == target[0] &&
                    r[1] == target[1] &&
                    r[2] == target[2]) {

                    return k;
                }
            }


            // impossible
            if (newarr.size() < 2) {
                return -1;
            }


            // store only newly generated points
            ArrayList<int[]> nextGen = new ArrayList<>();


            int n = newarr.size();


            // ===== generate new points =====

            for (int i = 0; i < n - 1; i++) {

                for (int l = i + 1; l < n; l++) {

                    int[] c = new int[3];

                    c[0] =
                        (newarr.get(l)[0] + newarr.get(i)[0]) / 2;

                    c[1] =
                        (newarr.get(l)[1] + newarr.get(i)[1]) / 2;

                    c[2] =
                        (newarr.get(l)[2] + newarr.get(i)[2]) / 2;


                    // skip duplicates
                    if (!check.contains(Arrays.toString(c))) {

                        nextGen.add(c);

                        check.add(Arrays.toString(c));
                    }
                }
            }


            // no new points possible
            if (nextGen.size() == 0) {
                return -1;
            }


            // add new generation AFTER finishing generation
            for (int[] p : nextGen) {

                newarr.add(p);
            }


            k++;
        }
    }
}