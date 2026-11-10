package LeetCode_Question_412;

// LeetCode Question No. 412 == Fizz Buzz;

import java.util.*;

class Solution {
    public ArrayList<String> fizzBuzz(int n) {

        ArrayList<String> answer = new ArrayList<>();

        for(int i = 1; i <= n; i++){
            if(i % 3 == 0 && i % 5 == 0){
                answer.add("FizzBuzz");
            }
            else if (i % 3 == 0){
                answer.add("Fizz");
            }
            else if(i % 5 == 0){
                answer.add("Buzz");
            }
            else{
                answer.add(Integer.toString(i));
            }
        }
        return answer;
    }
}

public class FizzBuzz {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the value of 'n' : ");
        int n = sc.nextInt();

        Solution s1 = new Solution();

        ArrayList<String> res = s1.fizzBuzz(n);

        System.out.println("=======================================");
        System.out.println("The final output is : \033[32m" + res);


    }
}
