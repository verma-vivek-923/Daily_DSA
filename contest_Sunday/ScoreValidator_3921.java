class Solution {
    public int[] scoreValidator(String[] events) {
        int score = 0;
        int counter = 0;
        for (int i = 0; i < events.length; i++) {
            String ch = events[i];

            if(counter>=10){
                break;
            }

            if (ch.equals("WD") || ch.equals("NB")) {
                score++;
            } else if (ch.equals("W")) {
                counter++;
            } else {
                char c=ch.charAt(0);
                score = score + (c - '0');
            }
        }

        int[] arr = new int[] { score, counter };

        return arr;
    }
}

public class ScoreValidator_3921 {
    public static void main(String[] args) {
         Solution s1=new Solution();

         int res[]=s1.scoreValidator(new String[]{"1","4","W","6","WD"});
         int res2[]=s1.scoreValidator(new String[]{"WD","NB","0","4","4"});
         int res3[]=s1.scoreValidator(new String[]{"W","W","W","W","W","W","W","W","W","W","W"});

         System.out.println("ReSult="+res3[0]+" "+res3[1]);
    }
}
