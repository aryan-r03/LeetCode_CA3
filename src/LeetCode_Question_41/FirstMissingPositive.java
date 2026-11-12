package LeetCode_Question_41;

// LeetCode Question No. 41 == First Missing Number;

import java.util.Arrays;
import java.util.Scanner;

class Solution {
    public int firstMissingPositive(int[] nums) {
        Arrays.sort(nums);
        int count = 1;
        for (int i = 0; i < nums.length; i++){
            if(count == nums [i]){
                count++;
            }
            else if (nums[i] > count){
                return count;
            }
        }
        return count;
    }
}

public class FirstMissingPositive {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter 4-values for the array : ");
        int[] nums = new int[]{sc.nextInt(), sc.nextInt(), sc.nextInt(), sc.nextInt()};

        Solution s1 = new Solution();

        int res = s1.firstMissingPositive(nums);

        System.out.println("-------------------------------");
        System.out.println("The First Missing Positive is : \033[32m" + res);

        sc.close();
    }
}
