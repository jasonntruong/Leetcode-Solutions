//Runtime: 3 ms
//Memory Usage: 39.2 MB

class Solution {
    public String longestCommonPrefix(String[] strs) {
        int preLen = 1;
        String prefix = "";
        
        while (true) {
            for (int i = 0; i < strs.length; i++) {
                if (strs[i].length() < preLen || !strs[0].substring(0,preLen).equals(strs[i].substring(0,preLen))) {
                    return prefix;
                }
            }
            
            prefix = strs[0].substring(0,preLen);
            preLen++;
        }
        
    }
}
