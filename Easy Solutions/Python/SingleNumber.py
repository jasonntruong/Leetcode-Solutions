#Runtime: 132 ms, beats 72.39% of Python3 online submissions
#Memory Usage: 16.7 MB

class Solution:
    def singleNumber(self, nums: List[int]) -> int:
        found = {}
        if len(nums) == 1:
            return nums[0]

        for num in nums:
            if num in found:
                found[num] += 1
            else:
                found[num] = 1

        for keys in found:
            if found[keys] == 1:
                return keys