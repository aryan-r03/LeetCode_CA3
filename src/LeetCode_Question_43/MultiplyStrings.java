package LeetCode_Question_43;

// LeetCode Question No. 43 == Multiply Strings;

import java.util.Scanner;


class Solution {
    public String multiply(String num1, String num2) {

        int[] a = new int[num1.length() + num2.length()];

        for(int i = num1.length()-1; i >= 0; i--) {
            for(int j = num2.length()-1; j >= 0; j--) {

                int n = (num1.charAt(i)-'0') * (num2.charAt(j)-'0') + a[i + j + 1];

                a[i + j + 1] = n % 10;
                a[i + j] += n / 10;
            }
        }

        String s = "";
        for(int n : a) s += n;

        s = s.replaceFirst("^0+", "");
        return s.isEmpty() ? "0" : s;
    }
}


public class MultiplyStrings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the value of 'num1' : ");
        String num1 = sc.next();
        System.out.print("Enter the value of 'num2' : ");
        String num2 = sc.next();

        Solution s1 = new Solution();

        String res = s1.multiply(num1, num2);

        System.out.println("------------------------");
        System.out.println("The product is : \033[32m" + res);
    }

}
