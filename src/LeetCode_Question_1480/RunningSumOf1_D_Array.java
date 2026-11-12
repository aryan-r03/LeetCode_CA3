package LeetCode_Question_1480;

// LeetCode Question No. 1480 : Running Sum of 1D Array;

import java.util.Scanner;
import java.util.Arrays;

class Solution {
    public int[] runningSum(int[] nums) {
        int[] answer = new int[nums.length];
        int idx = 0;

        for (int i = 0; i < nums.length; i++){
            idx += nums[i];
            answer[i] = idx;
        }

        return answer;
    }
}

public class RunningSumOf1_D_Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter 4-values of the array : ");
        int[] nums = {sc.nextInt(), sc.nextInt(), sc.nextInt(), sc.nextInt()};

        Solution s1 = new Solution();

        int[] res = s1.runningSum(nums);

        System.out.println("-------------------------------------------");
        System.out.println("The Running Sum Array is : \033[33m" + Arrays.toString(res));

        sc.close();
    }
}
