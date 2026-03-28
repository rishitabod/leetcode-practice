import java.util.*;

class Solution {

    public int removeDuplicates(int[] nums) {
        if (nums.length == 0) return 0;

        int k = 1; 

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i - 1]) {
                nums[k] = nums[i];
                k++;
            }
        }
        return k;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int size = sc.nextInt();
        int[] numbers = new int[size];

        for (int i = 0; i < size; i++) {
            numbers[i] = sc.nextInt();
        }

        Solution obj = new Solution(); 
        int k = obj.removeDuplicates(numbers);

        System.out.println("k = " + k);

        for (int i = 0; i < k; i++) {
            System.out.print(numbers[i] + " ");
        }
    }
}
