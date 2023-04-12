public class Solution {
    public String longestCommonPrefix(String[] strs) {
        final int stringQuantity = strs.length;
        String prefix = strs[0];

        for (int i = 1; i < stringQuantity; i++) {
            String currentString = strs[i];

            while (currentString.indexOf(prefix) != 0) {
                prefix = prefix.substring(0, prefix.length() - 1);

                if (prefix.isEmpty()) {
                    return "";
                }
            }
        }
        return prefix;
    }
}
