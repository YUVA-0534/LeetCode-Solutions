import java.util.*;
class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int current=nums[i];
            int needed=target-current;
            if(map.containsKey(needed)){
                return new int[]{map.get(needed),i};
            }
            else{
                map.put(current,i);
            }
        }
        return new int[]{};
    }
}
public class TwoSum{
    public static void main(String args[]){
        int arr[]={10,2,23,34,1,2,3};
        int target=13;
        Solution s=new Solution();
        s.twoSum(arr,target);
    }
}