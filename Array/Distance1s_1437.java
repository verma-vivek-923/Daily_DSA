class Solution {
    public boolean kLen(int arr[]) {
        int gap = 0;
        for (int i = 1; i <= arr.length - 1; i++) {
            // System.out.println(arr[i]);
            for (int j = i + 1; j <= arr.length - 1; j++) {
                if (arr[i] != arr[j]) {
                    gap++;
                } else {
                    gap = 0;
                }
            }
        }
        if (gap >= 2) {
            return true;
        } else {
            return false;
        }
    }
}

class Solution2 {
    public boolean kLen(int arr[]) {
        int gap = 0;
        int k=2;
        boolean isFirst=false;
        for (int i = 0; i <= arr.length - 1; i++) {
            // System.out.println(arr[i]);
            if (arr[i] == 1) {
               if(gap<k && isFirst==true){
                return false;
                // gap=0;
               }gap=0; isFirst=true;
            } else {
                if(isFirst==true){
                    gap++;
                }
                
            }
        }
            return true;
        
    }
}

class Distance1s_1437 {
    public static void main(String args[]) {
        int[] binaryArr = { 0,1, 0, 0, 0, 1, 0, 0, 1 };

        Solution s1 = new Solution();
        s1.kLen(binaryArr);

        Solution2 s2 = new Solution2();
        s1.kLen(binaryArr);

        System.out.println(s2.kLen(binaryArr));

    }
}