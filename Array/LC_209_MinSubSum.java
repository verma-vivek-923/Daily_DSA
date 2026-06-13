class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int n=nums.length;
        int sum=0;
        int l=0;
        for(int i=0;i<n;i++){
            sum+=nums[i];
            l++;
            if(sum>=target){
                return l;
            }
        }
        l=n;
        for(int i=0;i<n;i++){
            sum-=i;
            if(sum<target){
                return l;
            }
            l--;
        }
        return 0;
    }
}
public class LC_209_MinSubSum {
    public static void main(String[] args) {
        Solution s1=new Solution();
        System.out.println(s1.minSubArrayLen(7,new int[]{ 2,3,1,2,4,3}));
        System.out.println(s1.minSubArrayLen(4,new int[]{ 1,4,4}));
        System.out.println(s1.minSubArrayLen(11,new int[]{ 1,1,1,1,1,1,1,1}));
    }
}
