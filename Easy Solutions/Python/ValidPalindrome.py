#Runtime: 40 ms, beats 90.77% of Python3 online submissions
#Memory Usage: 14.5 MB beats 93.40% of Python3 online submissions

class Solution:
    def isPalindrome(self, s: str) -> bool:
        head = 0
        tail = len(s)-1
        
        if tail < 1:
            return True
        
        
        while (head < tail):
            wordhead = s[head]
            wordtail = s[tail]
            
            if not wordhead.isalnum():
                head += 1
            elif not wordtail.isalnum():
                tail -= 1
                
            else:
                
                if (wordhead.lower() != wordtail.lower()):
                    print(wordhead,wordtail)
                    return False
                head += 1
                tail -= 1
        return True