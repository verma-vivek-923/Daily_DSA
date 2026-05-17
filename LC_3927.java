class Solution {
    public long minArraySum(int[] nums) {
        for(int i=0;i<nums.length;i++){
             for(int j=0;j<nums.length;j++){
                if(nums[i]%nums[j]==0){
                    if(nums[i]>nums[j]){
                        nums[i]=nums[j];
                    }else{
                        nums[j]=nums[i];
                    }
                }
             }
        }
        int sum=0;
        
        for(int i=0;i<nums.length;i++){ System.out.print(nums[i] + " ");
            sum=sum+nums[i];
        }
        return sum;
    }
}

public class LC_3927{
    public static void main(String[] args) {

        int[] arr={3,6,2};
        Solution s1=new Solution();

        System.out.println("Sum="+s1.minArraySum(arr)); 
    }
}