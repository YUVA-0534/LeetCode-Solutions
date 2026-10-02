class Solution {
    public int removeDuplicates(int[] nums) {
        int index=1;
        for(int i=1;i<nums.length;i++){
            if(nums[i]!=nums[i-1]){
                nums[index]=nums[i];
                index++;
            }
        }
        for(int i=0;i<index;i++){
            System.out.println(nums[i]);
        }
        return index;
    }
}
class RemoveDuplicates{
	public static void main(String args[]){
		Solution s=new Solution();
		int a[]={1,1,1,2,2,2,3,3,3,4,4,4,5,5,5,5,7,7,7,7};
		System.out.println(s.removeDuplicates(a));
	}
}