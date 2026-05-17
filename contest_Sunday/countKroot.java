class Solution2 {
    public int countKthRoots(int l, int r, int k) {
        int y = 0;

        for (int i = 0;; i++) {
            int res = 1;
            for (int j = 1; j <= k; j++) {
                System.out.print("EX=" + res + " ");
                res = res * i;
            }
            System.out.println("\n"+res);

            if (res > r) {
                break;
            }
            if (res >= l && res <= r) {
                y++;

            }
            System.out.println("res=" + res + "L=" + l + "r=" + r);
        }

        return y;
    }
}


class Solution {
    public int countKthRoots(int l, int r, int k) {
        int y=0;
        
        for(int i=0;;i++){
             int res=1;
            for(int j=1;j<=k;j++){
                res=res*i;
            }
            
           if(res > r) { break;}
            if(res >=l && res <=r){
                y++;
            }
        }
        return y;
    }
}
public class countKroot {
    public static void main(String[] args) {
        Solution s1 = new Solution();

        System.out.println(s1.countKthRoots(1 , 9, 3));
    }
}
