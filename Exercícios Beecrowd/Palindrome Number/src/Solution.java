public class Solution {
    public boolean isPalindrome(int x) {
        String numberString = String.valueOf(x);

        for (int i = 0; i < numberString.length() / 2; i++) {
            int indexToCompare = numberString.length() - 1 - i;

            if (numberString.charAt(i) != numberString.charAt(indexToCompare)) {
                return false;
            }
        }
        return true;
    }
}
