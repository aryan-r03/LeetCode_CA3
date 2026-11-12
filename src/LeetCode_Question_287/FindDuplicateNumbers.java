package LeetCode_Question_287;

// LeetCode Question No. 287 == Find the Duplicate Number;

import java.util.Scanner;
import java.util.Arrays;

class Solution {
    public int findDuplicate(int[] nums) {

        Arrays.sort(nums);

        for(int i = 0; i < nums.length - 1; i++) {

            if(nums[i] == nums[i + 1]) {
                return nums[i];
            }
        }

        return -1;
    }
}

public class FindDuplicateNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the values of the 'n + 1' : ");
        int n = sc.nextInt();

        System.out.print("Enter the values of the array : ");
        int[] nums = new int[n + 1];

        for(int i = 0; i < n + 1; i++){
            nums[i] = sc.nextInt();
        }

        Solution s1 = new Solution();

        int res = s1.findDuplicate(nums);

        System.out.println("---------------------------------");
        System.out.println("\033[34m" + Arrays.toString(nums) + "\033[0m");
        System.out.println("---------------------------------");
        System.out.println("The duplicate number is : \033[32m" + res);

        sc.close();
    }
}
