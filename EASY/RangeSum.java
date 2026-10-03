import java.util.*;
class NumArray {
    
    int prefix[];
    int sum;
    int nums[]={2,3,4,2,1,4};
    public NumArray(int[] nums) {
        this.nums=nums;
        prefix=new int[nums.length];
        sum=0;
        prefix[0]=nums[0];
        for(int i=1;i<nums.length;i++){
            prefix[i]=prefix[i-1]+nums[i];
        }
    }
    
    public int sumRange(int left, int right) {
        
        
        if(left==0){
            sum=prefix[right];
        }
        else{
            sum=prefix[right]-prefix[left-1];
        }
        return sum;
    }
}
class RangeSum{
    public static void main(String ARS[]){
        int a[]={1,2,3,2,1,13,1};
        NumArray na=new NumArray(a);
		int result = na.sumRange(2,4);
        System.out.println(result);
    }
}

