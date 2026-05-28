class Solution {
    public String trafficSignal(int timer) {
        // if(timer==0){
        //     return "Green";
        // }else if(timer==30){
        //     return "Orange";
        // }else if(timer<=90 && timer>30){
        //     return "Red";
        // }else {return "Invalid";}

        switch(timer){
            case 0 :return "Green";
            case 30 :return "Orange";
            default :{
                if(timer<=90 && timer >30){
                    return "Red";
                }else{
                    return "Invalid";
                }
            }
        }
    }
}

public class LC_3894_trafficSignal {
    public static void main(String[] args) {
        Solution s1=new Solution();
        System.out.println(s1.trafficSignal(60));
    }
}
