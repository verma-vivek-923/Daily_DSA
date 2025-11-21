class Solution {
    public int searchInsert(int[] nums, int target) {
        int left = 0, right = nums.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return left;
    }
}


//Solve problem in almost all cases but cant keep time complexity O(logn)
class Solution2{
    public int foundIndex(int[] arr,int target){
          for(int i=0;i<arr.length;i++){
               if(arr[i]==target){
                return i;
               }
               if(arr[i]>target ){
                return i;
               }else if(i==arr.length-1 && arr[i]<target){
                return i+1;
               }
          }

        return 0;
     }
}

public class searchInser_35 {
    public static void main(String[] args){
         int[] arr={1,3,5,6};
         int[] arr2={5,7,9};
         int t=4;
         
         Solution s1=new Solution();
         int r=s1.searchInsert(arr, t);
         System.out.println(r);

        System.out.println(s1.searchInsert(arr2, 7)); 
        System.out.println(s1.searchInsert(arr2, 4)); 
    }
}
