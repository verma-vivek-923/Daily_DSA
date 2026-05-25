class Solution {
    public int compareBitonicSums(int[] nums) {
        
        double ascd=0;
        double desc=0;
        int b=0;

        for(int i=0;i<nums.length-1;i++){
                 if(b==0 && nums[i]<nums[i+1]){
                    //  System.out.println("v="+i);
                    ascd+=nums[i];
                    
                 }else if(b==0){
                      ascd+=nums[i];
                        b=1;
                 }

                //  System.out.println("chech "+b+" "+ i);

                 if(b==1){
                    // System.out.println("d="+i);
                    desc+=nums[i];
                 }
        }
        System.out.println("Ascd="+ascd);
        System.out.println("Desc="+desc);

        if(desc>ascd) return 1;
        else if (desc<ascd) return 0;
        else return -1;
    }
}

public class LC_3909_SumBitonicArray {
      public static void main(String[] args) {
        Solution s1=new Solution();

        System.out.println(s1.compareBitonicSums(new int[]{1,3,2,1}));
        System.out.println(s1.compareBitonicSums(new int[]{2,4,5,2}));
        System.out.println(s1.compareBitonicSums(new int[]{1,2,4,3}));
        System.out.println(s1.compareBitonicSums(new int[]{30494606,875031872,850559628,844602130}));
      }
}
