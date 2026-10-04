class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int count=0;
        int maxcount=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=1){
                count=0;
            }
            else{
                count++;
            }
            if(count>maxcount){
                maxcount=count;
            }
        }
        return maxcount;
    }
}
public class ConsecutiveOnes{
    public static void main(String args[]){
        Solution s=new Solution();
        int a[]={1,0,1,1,0,1};
        System.out.println(s.findMaxConsecutiveOnes(a));
    }
}