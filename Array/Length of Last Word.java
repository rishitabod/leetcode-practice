import java.util.*;

class Solution {
    public int lengthOfLastWord(String s) {
        int count = 0;                 
        int i = s.length() - 1;      

        
        while (i >= 0 && s.charAt(i) == ' ') {
            i--;
        }

        
        while (i >= 0 && s.charAt(i) != ' ') {
            count++;
            i--;
        }

        return count;                  
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        Solution obj = new Solution();
        System.out.print(obj.lengthOfLastWord(str));
    }
}
