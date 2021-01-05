//Link to Problem: https://leetcode.com/problems/length-of-last-word/

//Runtime: 0 ms, faster than 100.00% of Java online submissions for Length of Last Word.
//Memory Usage: 36.9 MB, less than 97.79% of Java online submissions for Length of Last Word.

//My Solution

class Solution {
    public int lengthOfLastWord(String s) {
        int counter = 0;
        
        for (int i = s.length()-1; i >= 0; i--) { //index backwards through String s
        
            if (s.charAt(i) != ' ')    counter++;  //if a non-space character is found, counter goes up indicating a word is found
            
            else if (s.charAt(i) == ' ' && counter != 0) break;  //if a space and a word was found, that means the word found was the last word so we break
            
            
            
        }
        
        return counter;
    }
}
