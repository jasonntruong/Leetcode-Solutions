#Runtime: 124 ms, beats 92.31% of Python3 online submissions
#Memory Usage: 15.5 MB beats 18.16% of Python3 online submissions

class Solution:
    def missingNumber(self, nums):
        neededSum = len(nums)
        actualSum = 0
        for i in range (len(nums)):
            neededSum += i
            actualSum += nums[i]

        return neededSum - actualSum