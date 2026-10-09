class Solution {
    public int reverse(int x) {
        int revnum=0;
        
        while(x!=0){
            int digit=x%10;
            x=x/10;
            if (revnum > Integer.MAX_VALUE / 10 ||
                (revnum == Integer.MAX_VALUE / 10 && digit > 7)) {
                return 0;
            }

            if (revnum < Integer.MIN_VALUE / 10 ||
                (revnum == Integer.MIN_VALUE / 10 && digit < -8)) {
                return 0;
                }
            revnum=(revnum*10)+digit;
        }
        return revnum;
    }
}
class ReverseInteger{
    public static void main(String afrgs[]){
        Solution s=new Solution();
        int x=-121;
        System.out.println(s.reverse(x));
    }
}