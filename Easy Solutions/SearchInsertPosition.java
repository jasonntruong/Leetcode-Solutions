//Runtime: 0 ms
//Memory Usage: 40.5 MB

class Solution {
    public int searchInsert(int[] nums, int target) {
        
        if (nums.length == 0 || target < nums[0]) return 0;
        
        for (int i = 0; i < nums.length; i++) {
            if (target <= nums[i])   return i;
            
        }
        
        return nums.length;
    }
}
