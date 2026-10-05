class Solution {
    public int removeElement(int[] nums, int val) {
        int index=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=val){
                nums[index]=nums[i];
                index++;
            }
        }
        return index;
    }
}
public class RemoveElement{
    public static void main(String args[]){
        Solution s=new Solution();
        int a[]={1,2,1,2,33};
        int target=2;
        System.out.println(s.removeElement(a,target));
}
}