package LeetCode_Question_20;

// LeetCode Question No. 20 == Valid Parentheses;

import java.util.Scanner;

class Solution {
    public boolean isValid(String s) {
        while (s.contains("()") || s.contains("{}") || s.contains("[]")) {
            s = s.replace("()", "");
            s = s.replace("{}", "");
            s = s.replace("[]", "");
        }

        return s.isEmpty();
    }
}

public class ValidParentheses {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the parentheses combination to check the validity : ");
        String s = sc.nextLine();

        Solution s1 = new Solution();

        if (s1.isValid(s)) {
            System.out.println("        -- \033[32mtrue\033[0m --");
            System.out.print("The parentheses is valid.");
        } else {
            System.out.println("        -- \033[31mfalse\033[0m --");
            System.out.println("The parentheses is not valid.");
        }

        sc.close();
    }
}
