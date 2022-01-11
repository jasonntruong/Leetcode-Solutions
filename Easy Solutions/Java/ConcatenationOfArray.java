//Runtime: 0 ms, beats 100.00% of Java online submissions
//Memory Usage: 39.6 MB beats 52.15% of Java online submissions

class Solution {
    public int[] getConcatenation(int[] nums) {
        int[] ans = new int[2*nums.length];
        for (int i = 0; i < nums.length; i++) {
            ans[i] = nums[i];
            ans[i + nums.length] = nums[i];
        }
    
        return ans;
    }
}