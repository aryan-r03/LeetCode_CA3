package LeetCode_Question_13;

// LeetCode Question No. 13 == Roman to Integer;

import java.util.Scanner;

class Solution {
    public int romanToInt(String s) {
        int roman = 0;

        for (int i = 0; i < s.length(); i++) {
            int a = 0, b = 0;

            switch (s.charAt(i)) {
                case 'I':
                    a = 1;
                    break;
                case 'V':
                    a = 5;
                    break;
                case 'X':
                    a = 10;
                    break;
                case 'L':
                    a = 50;
                    break;
                case 'C':
                    a = 100;
                    break;
                case 'D':
                    a = 500;
                    break;
                case 'M':
                    a = 1000;
                    break;
            }

            if (i + 1 < s.length()) {
                switch (s.charAt(i + 1)) {
                    case 'I':
                        b = 1;
                        break;
                    case 'V':
                        b = 5;
                        break;
                    case 'X':
                        b = 10;
                        break;
                    case 'L':
                        b = 50;
                        break;
                    case 'C':
                        b = 100;
                        break;
                    case 'D':
                        b = 500;
                        break;
                    case 'M':
                        b = 1000;
                        break;
                }
            }

            if (a < b)
                roman -= a;
            else
                roman += a;
        }

        return roman;
    }
}

public class Roman2Integer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the roman number : ");
        String str = sc.next().toUpperCase();

        Solution s1 = new Solution();

        int res = s1.romanToInt(str);

        System.out.println("===========================================");
        System.out.println("The Roman Number is  : \033[33m" + str + "\033[0m");
        System.out.println("The Integer Value is : \033[32m" + res + "\033[0m");

        sc.close();
    }
}
