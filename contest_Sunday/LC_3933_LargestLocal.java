class Solution {
    public int countLocalMaximums(int[][] matrix) {
        int c = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] != 0) {
                    c++;
                }
            }

        }
        return c;
    }
}

public class LC_3933_LargestLocal {
    public static void main(String[] args) {
          int[][] arr={{0,0,0,0,0,0,0},{0,0,0,0,0,0,0},{0,0,0,0,0,0,0},{0,0,0,2,0,0,0},{0,0,0,0,0,0,0},{0,0,0,0,0,0,0},{0,0,0,0,0,0,0}};
            Solution s1=new Solution();

          System.out.println(s1.countLocalMaximums(arr)) ;
        }

}