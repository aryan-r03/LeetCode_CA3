package LeetCode_Question_1295;

// LeetCode Question No. 1295 == Find Numbers with Even Number in Digit;

import java.util.Scanner;

class Solution {
    public int findNumbers(int[] nums) {
        int answer = 0;

        for(int i = 0; i < nums.length; i++){
            if((nums[i] > 9 && nums[i] < 100) || (nums[i] > 999 && nums[i] < 10000) || nums[i] == 100000){
                answer ++;
            }
        }
        return answer;
    }
}

public class NumbersWithEvenNumberInDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter 4-values of the array : ");
        int[] nums = {sc.nextInt(), sc.nextInt(), sc.nextInt(), sc.nextInt()};

        Solution s1 = new Solution();

        int res = s1.findNumbers(nums);

        System.out.println("-------------------------------------------");
        System.out.println("Numbers of Even number in the Digit are : \033[32m" + res);

        sc.close();
    }
}
