import java.util.*;
class Solution {
    public boolean isPalindrome(int x) {
    if (x < 0 || (x % 10 == 0 && x != 0)) return false;

    int result = 0;
    int i = x;

    while (i > 0) {
        result = (result * 10) + i % 10;
        i = i / 10;
    }

    return result == x;
}
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        int  num =  sc.nextInt();
        Solution obj = new Solution();
        boolean ans = obj.isPalindrome(num);
        if( ans == true){
            System.out.println("true");
        }else{
            System.out.println("false");
        }
    }
}
