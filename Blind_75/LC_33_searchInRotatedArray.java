class Solution {
    public int search(int[] nums, int target) {
        int n=nums.length;
        int l=0,r=n-1;
        int left=nums[l], right=nums[r];
        

        while(left > right){
            int mid=(l+r)/2;
            if(nums[mid]==target) return mid;
            if(target < nums[mid] && target > nums[l]) {
                r=mid;
            }else if(target< nums[mid] && target <nums[r]){
                l=mid;
            }
            System.out.println("inside L="+nums[l]+" R="+nums[r]);
        }
        

        return -1;
    }
}
public class LC_33_searchInRotatedArray {
    public static void main(String[] args) {
        Solution s1=new Solution();

        System.out.println(s1.search( new int[]{4,5,6,7,0,1,2}, 0));
        System.out.println(s1.search( new int[]{4,5,6,7,0,1,2}, 3));

    }
}
