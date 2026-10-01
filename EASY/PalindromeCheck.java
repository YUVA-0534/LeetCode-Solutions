import java.util.*;
class Solution {
    public boolean isPalindrome(int x) {
        int revNum=0;
        int temp=x;
        if(x>=0){
            while(x!=0){
                revNum=(revNum*10)+(x%10);
                x=x/10;
             }
            if(revNum==temp){
                 return true;
            }
            else{
                return false;
            }
        }
        else{
            return false;
        }
    }
}
public class PalindromeCheck{
    public static void main(String args[]){
        Solution s=new Solution();
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a value:");
        int num=sc.nextInt();
        s.isPalindrome(num);
    }
}