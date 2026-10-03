class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int left=0;
        int sum=0;
        int right=numbers.length-1;
        for(int i=0;i<=numbers.length-1;i++){
            sum=numbers[left]+numbers[right];
            if(sum==target){
                return new int[]{left+1,right+1};
            }
            else if(sum>target){
                right--;
            }
            else{
                left++;
            }
        }
        return new int[]{};
    }
}
public class TwoSum2{
    public static void main(String args[]){
        Solution s=new Solution();
        int a[]={2,7,11,15};
        int target=9;
        System.out.println(s.twoSum(a,target));
    }
}