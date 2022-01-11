//Link to problem: https://leetcode.com/problems/search-insert-position/
//Runtime: 0 ms, faster than 100.00% of Java online submissions for Search Insert Position.
//Memory Usage: 38.5 MB, less than 85.45% of Java online submissions for Search Insert Position.

//My solution in Java:

class Solution {
    public int searchInsert(int[] nums, int target) {
        int answer = 1;
        
        for (int i = 0; i < nums.length; i++) {
            
            if (target <= nums[i]) {
              return i; //return i as location if target is less than or equal to int nuum[i]
            }
     
            else {
                answer = i+1; //else increment the answer by 1
            }   
        }
        return answer;  //return answer
    }
}
