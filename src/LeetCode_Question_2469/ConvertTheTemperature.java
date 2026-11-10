package LeetCode_Question_2469;

// LeetCode Question No. 2469 == Convert The Temperature;

import java.util.Scanner;

class Solution {
    public double[] convertTemperature(double celsius) {
        double[] answer = new double[2];

        answer[0] = celsius + 273.15;
        answer[1] = celsius * 1.80 + 32.00;

        return answer;
    }
}

public class ConvertTheTemperature {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the temperature in Celsius : ");
        double celsius = sc.nextDouble();

        Solution s1 = new Solution();

        double[] res = s1.convertTemperature(celsius);

        System.out.println("=========================================");
        System.out.println("The Converted temperatures in [Kelvin, Fahrenheit] : \033[33m" + res[0] + "\033[0m | \033[33m" + res[1]);
    }
}
