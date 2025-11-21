import java.util.*;

class Solution1 {
    public String solution(String[] arr) {
         //Reverse slice 
            String prifix=arr[0];

            System.err.println(prifix);

            for(int i=1;i<arr.length;i++){

                while(arr[i].indexOf(prifix) !=0){        
                        // System.err.println("yes");
                        prifix=prifix.substring(0, prifix.length()-1);
                        System.err.println("prefeee : "+prifix);
                       
                }
                   
                    
            }
               return prifix;
    }
}

public class longestPrefic {
    public static void main(String[] args) {
        String[] strs = { "flower", "flow", "flew" };
        int target = 8;

        Solution1 obj1 = new Solution1();
        String result = obj1.solution(strs);

    }
}
