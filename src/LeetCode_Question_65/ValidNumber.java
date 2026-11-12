package LeetCode_Question_65;

// LeetCode Question No. 65 == Valid Number;

import java.util.Scanner;

class Solution {
    public boolean isNumber(String s) {
        boolean digit = false;
        boolean dot = false;
        boolean e = false;

        for (int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);

            if(Character.isDigit(ch)){
                digit = true;
            }
            else if(ch == '.'){
                if(dot || e){
                    return false;
                }
                dot = true;
            }
            else if (ch == 'e' || ch == 'E'){
                if(e || !digit){
                    return false;
                }
                e = true;
                digit = false;
            }
            else if (ch == '+' || ch == '-'){
                if ( i != 0 && s.charAt(i - 1) != 'e' && s.charAt(i - 1) != 'E'){
                    return false;
                }
            }
            else{
                return false;
            }
        }

        return digit;
    }
}

public class ValidNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the String value : ");
        String s = sc.next();

        Solution s1 = new Solution();

        boolean res = s1.isNumber(s);

        System.out.println("--------------------------------------------------");
        System.out.println("The entered string is a valid number ? : \033[32m" + false);

        sc.close();
    }
}
