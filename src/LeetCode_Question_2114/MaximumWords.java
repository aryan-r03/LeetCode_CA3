package LeetCode_Question_2114;

// LeetCode Question No. 2114 == Maximum Number of Words Found in Sentences;

class Solution {
    public int mostWordsFound(String[] sentences) {
        int maxLength = 0;

        for (String sentence : sentences){
            int len = sentence.split(" ").length;
            if (maxLength < len){
                maxLength = len;
            }
        }
        return maxLength;
    }
}

public class MaximumWords {
    public static void main(String[] args) {
        String[] sentences = {
                "alice and bob love leetcode",
                "i think so too",
                "this is great thanks very much"
        };

        Solution obj = new Solution();

        System.out.println("--------------------------------------------------------");
        System.out.println("Maximum number of words in the array sentences are : \033[32m" + obj.mostWordsFound(sentences));
    }
}
