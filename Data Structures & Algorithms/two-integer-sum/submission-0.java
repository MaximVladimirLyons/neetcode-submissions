class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> values = new HashMap<>();

        // puts the compliment and the position from nums into the HashMap.
        for (int i = 0; i < nums.length; i++) {
            values.put(target - nums[i], i);
        }

        for (int i = 0; i < nums.length; i++) {
            if (values.containsKey(nums[i]) && values.get(nums[i]) != i) {
                return new int[] {i, values.get(nums[i])};
            }
        }
        return new int[0];
    }
}
