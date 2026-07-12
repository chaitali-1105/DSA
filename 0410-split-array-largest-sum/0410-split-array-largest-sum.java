
class Solution {
    public int splitArray(int[] nums, int k) {

        int low = 0;
        long high = 0;

        for (int num : nums) {
            low = Math.max(low, num);
            high += num;
        }

        int ans = -1;

        while (low <= high) {

            int mid = low + (int)(high - low) / 2;

            if (isPossible(nums, k, mid)) {
                ans = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        return ans;
    }

    private boolean isPossible(int[] nums, int k, int maxSum) {

        int subarrays = 1;
        int sum = 0;

        for (int i = 0; i < nums.length; i++) {

            if (sum + nums[i] <= maxSum) {
                sum += nums[i];
            } else {
                subarrays++;
                sum = nums[i];
            }
        }

        return subarrays <= k;
    }
}