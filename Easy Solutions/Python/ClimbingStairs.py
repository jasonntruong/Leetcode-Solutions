#Runtime: 28 ms, beats 83.29% of Python3 online submissions
#Memory Usage: 14.4 MB beats 72.92% of Python3 online submissions

class Solution:
    #solve using Fibonacci sequence
    def climbStairs(self, n: int) -> int:
        a = 1
        b = 1
        for i in range (n):
            a,b = b, a+b

        return a