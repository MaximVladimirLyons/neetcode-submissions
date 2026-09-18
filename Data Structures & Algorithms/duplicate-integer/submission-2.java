class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashSet<Integer> newNums = new HashSet<>();
        for (int num : nums) {
            newNums.add(num);
        }
        return !(newNums.size() == nums.length);
    }
}