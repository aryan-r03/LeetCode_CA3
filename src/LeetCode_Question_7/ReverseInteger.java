package LeetCode_Question_7;

// LeetCode Question No. 7 == Reverse Integer;

import java.util.Scanner;

class Solution {
    public int reverse(int x) {
        int rev = 0;

        while(x != 0){

            int digit = x % 10;
            x = x / 10;

            if(rev > Integer.MAX_VALUE  / 10 || rev < Integer.MIN_VALUE / 10){
                return 0;
            }

            rev = rev * 10 + digit;
        }
        return rev;
    }
}

public class ReverseInteger {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Integer value : ");
        int x = sc.nextInt();

        Solution s1 = new Solution();

        int res = s1.reverse(x);

        System.out.println("-------------------------------------------");
        System.out.println("The reversed Integer is : \033[32m" + res);

        sc.close();
    }

}
