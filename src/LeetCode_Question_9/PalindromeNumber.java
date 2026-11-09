package LeetCode_Question_9;

// LeetCode Question No. 9 == Palindrome Number;

import java.util.Scanner;

class Solution {
    public boolean isPalindrome(int x) {
        if(x < 0)
            return false;

        int org = x;
        int rev = 0;

        while (x > 0){
            int digit = x % 10;
            rev = rev * 10 + digit;
            x /= 10;
        }

        return org == rev;
    }
}


public class PalindromeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number to check Palindrome : ");
        int num = sc.nextInt();

        Solution s1 = new Solution();

        boolean res = s1.isPalindrome(num);

        System.out.println("================================");
        System.out.println("Is \033[31m" + num + "\033[0m a Palindrome ? --> \033[33m" + res);
    }
}
