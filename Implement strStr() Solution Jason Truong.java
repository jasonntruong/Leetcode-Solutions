//Link to problem: https://leetcode.com/problems/implement-strstr/

//My solution in Java:

class Solution{

    public int strStr(String haystack, String needle) {
    
        for (int i = 0; i <= haystack.length() - needle.length(); i++) { 

            if (haystack.substring(i, i + needle.length()).equals(needle)) {
                return i;   //if the needle is the same as this haystack substring, return the index value i
            }
        }
   
    return -1;  //if the needle is not in the substring return -1
    
    }
}
