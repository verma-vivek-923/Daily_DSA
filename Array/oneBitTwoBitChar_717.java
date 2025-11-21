class Solution{
    public boolean isOneBitCharacter(int[] arr){
        for(int i=0;i<arr.length;){
            if(arr[i]==0){
                if(i==arr.length-1){
                    return true;
                }
              i++;
            }else{
                i+=2;
            }
            
        }
        return false;
    }
}

class SolutionGpt {
    public boolean isOneBitCharacter(int[] bits) {
        int i = 0;

        while (i < bits.length - 1) {  
            if (bits[i] == 1) {
                i += 2; // two-bit character
            } else {
                i += 1; // one-bit character
            }
        }

        // If pointer stops exactly on last index → last is 1-bit
        return i == bits.length - 1;
    }
}


public class oneBitTwoBitChar_717 {
  public static void main(String[] args){
     int[] arr={1,1,0};

     Solution s1=new Solution();
    boolean r= s1.isOneBitCharacter(arr);

    System.out.println(r);

  }
    
}