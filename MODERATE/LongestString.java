import java.util.*;
class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> set=new HashSet<>();
        int maxLength=0;
        int left=0;
        for(int right=0;right<s.length();right++){
            while(set.contains(s.charAt(right))){
                set.remove(s.charAt(left));
                left++;
            }
            set.add(s.charAt(right));
            int length=right-left+1;
            if(length>maxLength){
                maxLength=length;
            }
        }
        return maxLength;
    }
}
public class LongestString{
    public static void main(String args[]){
        Solution s=new Solution();
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a string:");
        String str=sc.nextLine();
        System.out.println(s.lengthOfLongestSubstring(str));
    }
}