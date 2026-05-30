class Solution {
    public int minAbsoluteDifference(int[] nums) {
        int n=nums.length;
        int absl=0;
        int Minabsl=Integer.MAX_VALUE;

        for(int i=0;i<n;i++){
            if(i==0) continue;
            for(int j=i+1;j<n;j++){
                if(j==0) continue;
                if(nums[i]==1 && nums[j]==2){
                    absl=Math.abs(i-j);
                    if(absl<Minabsl){
                        Minabsl=absl;
                    }
                }
                
            }
        }
        return Minabsl;
    }
}

public class LC_3880_MinAbsDiffVal {
    public static void main(String[] args) {
        Solution s1=new Solution();

        System.out.println(s1.minAbsoluteDifference(new int[]{1,0,0,2,0,1}));
        System.out.println(s1.minAbsoluteDifference(new int[]{1,0,1,0}));
        // System.out.println(s1.minAbsoluteDifference(new int[]{1,0,0,2,0,1}));
    }
}
