class Solution {
    public boolean PredictTheWinner(int[] nums) {
        int n = nums.length;
        int[] max_diff = new int[n];

        for (int i = n - 1; i >= 0; i--) {
            max_diff[i] = nums[i];
            for (int j = i + 1; j < n; j++) {
                max_diff[j] = Math.max(nums[i] - max_diff[j], nums[j] - max_diff[j - 1]);
            }
        }

        return max_diff[n - 1] >= 0;        
    }
}
