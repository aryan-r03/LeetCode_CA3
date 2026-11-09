package LeetCode_Question_1;

// LeetCode Question No. 1 == Two Sum;

import java.util.Arrays;

class Solution {
    public int[] twoSum(int[] nums, int target){
        for(int i =0; i < nums.length; i++){
            for(int j = i + 1; j < nums.length; j++){
                if(nums[i] + nums[j] == target){
                    return new int[] {i, j};
                }
            }
        }
        return new int[] {};
    }
}

public class TwoSum {
    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        int target = 9;

        Solution s1 = new Solution();

        int[] res = s1.twoSum(nums, target);

        System.out.println("==============================================================");
        System.out.println("The target could be attained by the sum of Indices : \033[33m" + Arrays.toString(res));
    }
}

