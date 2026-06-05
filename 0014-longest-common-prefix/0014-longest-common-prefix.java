class Solution {
    public String longestCommonPrefix(String[] strs) {
        // return "" condition
        if (strs == null || strs.length == 0) {
            return "";
        }

        // first find shortest length of element
        int shortestLength = strs[0].length();

        for (int i = 0; i < strs.length; i++) {
            shortestLength = Math.min(shortestLength, strs[i].length());
        }

        StringBuilder prefix = new StringBuilder();

        // outer loop for position
        for (int i = 0; i < shortestLength; i++) {

            char current = strs[0].charAt(i);

            // Compare with all other strings
            for (int j = 1; j < strs.length; j++) {

                if (strs[j].charAt(i) != current) {
                    return prefix.toString();
                }
            }

            prefix.append(current);
        }

        return prefix.toString();
    }
    
}