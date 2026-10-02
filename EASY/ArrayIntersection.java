import java.util.*;
class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        int index=0;
        int result[]=new int[nums1.length];
        for(int i=0;i<nums1.length;i++){
            boolean found=false;
            for(int j=0;j<nums2.length;j++){
                if(nums1[i]==nums2[j]){
                    found=true;
                    break;
                }
            }
            boolean foundin=false;
            if(found){
                
                for(int k=0;k<index;k++){
                    if(result[k]==nums1[i]){
                        foundin=true;
                        break;
                    }
                }
                if(!foundin){
                    result[index]=nums1[i];
                    index++;
                }
            }
        }
        return Arrays.copyOf(result, index);
    }
}
class ArrayIntersection{
    public static void main(String args[]){
        int a[]={1,2,2,1};
        int b[]={2,2};
        Solution s=new Solution();
        System.out.println(Arrays.toString(s.intersection(a,b)));
    }
}