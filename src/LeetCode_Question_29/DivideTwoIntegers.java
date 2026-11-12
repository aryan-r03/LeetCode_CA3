package LeetCode_Question_29;

// LeetCode Question No. 29 == Divide Two integers;

import java.util.Scanner;

class Solution {
    public int divide(int dividend, int divisor) {

        if (dividend == Integer.MIN_VALUE && divisor == -1)
            return Integer.MAX_VALUE;

        long a = Math.abs((long) dividend);
        long b = Math.abs((long) divisor);

        int ans = 0;

        while (a >= b) {
            long temp = b;
            int count = 1;

            while (a >= temp + temp) {
                temp += temp;
                count += count;
            }

            a -= temp;
            ans += count;
        }

        if ((dividend < 0) != (divisor < 0))
            ans =- ans;

        return ans;
    }
}

public class DivideTwoIntegers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the value of dividend : ");
        int dividend = sc.nextInt();

        System.out.print("Enter the value of divisor : ");
        int divisor = sc.nextInt();

        Solution s1 = new Solution();

        int res = s1.divide(dividend, divisor);

        System.out.println("-----------------------");
        System.out.println("The Quotient is : \033[32m" + res);

    }
}
