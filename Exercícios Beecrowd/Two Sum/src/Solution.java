public class Solution {
    public int[] twoSum(int[] nums, int target) {
        for (int reference = 0; reference < nums.length - 1; reference++) {
            int referenceValue = nums[reference];

            for (int add = reference + 1; add < nums.length; add++) {
                int addValue = nums[add];
                int sum = referenceValue + addValue;

                if (sum == target) {
                    return new int[] {reference, add};
                }
            }
        }
        return null;
    }
}
