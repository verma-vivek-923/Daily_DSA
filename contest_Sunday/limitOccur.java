import java.util.Arrays;

class Solution {
    public int[] limitOccurrences(int[] nums, int k) {
       int[] arr=new int[nums.length];
        int n=nums.length;
         int l=0;
         int c=1;
         arr[l++]=nums[0];
        
        for(int i=1;i<n;i++){
                if(nums[i]==nums[i-1]){
                    c++;  
                }else{
                    c=1;
                }

                if(c<=k){
                    arr[l]=nums[i];
                    l++;
                }
            
        }
        
        return Arrays.copyOf(arr, l);
    }
}

public class limitOccur {
    public static void main(String[] args) {
        Solution s1=new Solution();

        System.out.println(Arrays.toString(s1.limitOccurrences(new int[]{1,1,1,2,2,3},2)));
    }
}
