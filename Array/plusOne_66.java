


class Solution {
    public int[] plus(int arr[]) {
        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i] < 9 || i==0 && arr[0]==9 ) {      
                arr[i] = arr[i] + 1;
                return arr;
            }
            arr[i] = 0;
        }
        int[] newArr=new int[arr.length+1];
        newArr[0]=1;
        return newArr;
    }
}

// give ans correct but if  all are 9 , then it convert once placed 9 to 10, but we need to created another array of 1 more sapce than previos in this condition
class Solution2 {
    public int[] plus(int arr[]) {
        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i] < 9 || i==0 && arr[0]==9 ) {      
                arr[i] = arr[i] + 1;
                return arr;
            }
            arr[i] = 0;
        }
        return arr;
    }
}

public class plusOne_66 {
    public static void main(String[] args) {
        int[] num = { 9, 8, 9, 9 };

        for (int i = 0; i < num.length; i++) {

            System.out.print(num[i]);

        }
        System.out.println();

        Solution s1 = new Solution();
        int[] newArr = s1.plus(num);
        System.out.println();
        for (int i = 0; i < num.length; i++) {

            System.out.print(newArr[i]);

        }

    }
}
