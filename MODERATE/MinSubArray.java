class Solution {
    public int minSubArrayLen(int target, int[] nums) {
     int left=0;
     int minilength=Integer.MAX_VALUE;
     int sum=0;
     for(int rigth=0;rigth<nums.length;rigth++){
        sum=sum+nums[rigth];
        while(sum>=target){
            int length=rigth-left+1;
            if(length<minilength){
                minilength=length;
            }
            sum=sum-nums[left];
            left++;
        }
     }
     if(minilength==Integer.MAX_VALUE){
        return 0;
     }  
     return minilength; 
    }
}
public class MinSubArray{
    public static void main(String args){
        Solution s=new Solution();
        int a[]={2,3,1,2,4,3};
        int x=2;
        System.out.println(s.minSubArrayLen(x,a));
    }
}