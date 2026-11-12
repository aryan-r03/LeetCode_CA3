package LeetCode_Question_1;

// LeetCode Question No. 1 == Two Sum;

import java.util.Scanner;
import java.util.Arrays;

class Solution {
    public int[] twoSum(int[] nums, int target){
        for(int i =0; i < nums.length; i++){
            for(int j = i + 1; j < nums.length; j++){
                if(nums[i] + nums[j] == target){
                    return new int[] {i, j};
                }
            }
        }
        return new int[] {};
    }
}

public class TwoSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter 4-values for the array : ");
        int[] nums = new int[]{sc.nextInt(), sc.nextInt(), sc.nextInt(), sc.nextInt()};

        System.out.print("Enter the target value : ");
        int target = sc.nextInt();

        Solution s1 = new Solution();

        int[] res = s1.twoSum(nums, target);

        System.out.println("==============================================================");
        System.out.println("The target could be attained by the sum of Indices : \033[33m" + Arrays.toString(res));


    }
}

