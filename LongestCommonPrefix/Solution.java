package LongestCommonPrefix;

public class Solution {

    public String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0)
            return "";

        String prefix = strs[0];  // take first word as reference

        for (int i = 1; i < strs.length; i++) {
            // keep reducing prefix until it matches the start of strs[i]
            while (!strs[i].startsWith(prefix)) {
                prefix = prefix.substring(0, prefix.length() - 1);

                if (prefix.isEmpty()) {
                    return "";
                }
            }
        }
        return prefix;
    }
}


