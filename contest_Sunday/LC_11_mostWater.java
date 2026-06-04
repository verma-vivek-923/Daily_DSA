 class Solution{
    public int maxArea(int[] height) {
        int n=height.length;
        int l=0 , r=n-1, maxA=0;

        while(l<r){
            int area=Math.min(height[l],height[r]) * (r-l);
            maxA=Math.max(maxA, area);

            if(height[l] < height[r]){
                l++;
            }else{
                r--;
            }
        }
        return maxA;
    }
 }

class Solution2{
     public int maxArea(int[] height) {
        int maxWater=0;
        int n=height.length;

        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                int area=Math.min(height[i], height[j])*(j-i);
                maxWater=Math.max(maxWater, area);
            }
        }
        return maxWater;
    }
}

public class LC_11_mostWater {
    public static void main(String[] args) {
        Solution s1=new Solution();
        System.out.println(s1.maxArea(new int[]{1,8,6,2,5,4,8,3,7}));
    }
}
