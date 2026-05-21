
// Optimized
class Solution2 {
    public int[] countOppositeParity(int[] nums) {
        int even=0,odd=0;
        int n=nums.length;

       int[] newarr=new int[n];

        for(int i:nums){
            if(i%2==0) even++;
            else odd++;
        }

        for(int i=0;i<n;i++){
            if(nums[i]%2==0){
                if(odd>0)newarr[i]=odd;
                else newarr[i]=0;
                even--;
            }else{
                if(even>0) newarr[i]=even;
                else newarr[i]=0;
                odd--;
            }
        }

        return newarr;
    }
}

// Brute Force
class Solution {
    public int[] countOppositeParity(int[] nums) {
        int n = nums.length;
        int[] newarr = new int[n];
        for (int i = 0; i < n; i++) {
            int k = 0;
            for (int j = i + 1; j < n; j++) {
                if ((nums[i] % 2 == 0 && nums[j] % 2 != 0) || (nums[i] % 2 != 0 && nums[j] % 2 == 0)) {
                    k++;
                }
            }
            newarr[i] = k;
        }
        return newarr;
    }
}
