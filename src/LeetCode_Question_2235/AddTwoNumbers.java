package LeetCode_Question_2235;

// LeetCode Question No. 2235 == Add Two Numbers;

import java.util.Scanner;

class Solution {
    public int sum(int num1, int num2) {
        int answer = num1 + num2;

        return answer;
    }
}

public class AddTwoNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the value of 'num1' : ");
        int num1 = sc.nextInt();
        System.out.print("Enter the value of 'num2' : ");
        int num2 = sc.nextInt();

        Solution s1 = new Solution();

        int res = s1.sum(num1, num2);

        System.out.println("--------------------------------------------");
        System.out.println("The Sun of the numbers is : \033[32m" + res);
    }
}
