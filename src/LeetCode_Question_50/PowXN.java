package LeetCode_Question_50;

// LeetCode Question No. 50 == Pow(x,n);

import java.util.Scanner;

class Solution {
    public double myPow(double x, int n) {
        return Math.pow(x, n);
    }
}

public class PowXN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the value of 'x' (double) : ");
        double x = sc.nextDouble();

        System.out.print("Enter the value of raised power 'n' : ");
        int n = sc.nextInt();

        Solution s1 = new Solution();

        double res = s1.myPow(x, n);

        System.out.println("-------------------------------");
        System.out.println("The answer is : \033[32m" + res);

        sc.close();
    }
}
