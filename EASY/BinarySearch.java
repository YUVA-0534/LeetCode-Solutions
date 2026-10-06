class Solution {
    public int search(int[] nums, int target) {
        int left=0;
        int right=nums.length-1;
        while(left<=right){
           int mid=(left+right)/2;
            if(nums[mid]==target){
                return mid;
            }
            else if(nums[mid]>=target){
                right=mid-1;
            }
            else{
                left=mid+1;
            }
        }
        return -1;
    }
}
class BinarySearch{
    public static void main(String args[]){
        Solution s=new Solution();
        int a[]={-1,0,3,5,9,12};
        System.out.println("found at:"+s.search(a,9));
    }
}