#Runtime: 32 ms, faster than 66.71% of Python3 online submissions for Length of Last Word.
#Memory Usage: 14.4 MB, less than 33.86% of Python3 online submissions for Length of Last Word.

class Solution:
    def lengthOfLastWord(self, s: str) -> int:

        letter=False
        count = 0
        
        for i in range (len(s)-1,-1,-1):
            if s[i] != " ":
                count += 1
                letter = True
            
            elif s[i] == " " and letter == True:
                return count
        
        return count
