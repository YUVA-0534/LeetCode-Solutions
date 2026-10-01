class Solution {
    public int majorityElement(int[] nums) {
        int candidate=0;
        int count=0;
        for(int i=0;i<nums.length;i++){
            if(count==0){
                candidate=nums[i];    
            }
            if(candidate==nums[i]){
                count++;
            }
            else{
                count--;
            }
        }
         return candidate;
     }
}
class Melement{
	public static void main(String args[]){
		int arr[]={1,1,1,1,2,2,2,3};
		Solution s=new Solution();
		System.out.println(s.majorityElement(arr));
	}
}
