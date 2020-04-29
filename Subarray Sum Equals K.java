// Time Complexity :
// Space Complexity :
// Did this code successfully run on Leetcode :
// Any problem you faced while coding this :


// Your code here along with comments explaining your approach

public int subarraySum(int[] nums, int k) {
    int count = 0;
    for (int start = 0; start < nums.length; start++) {
        for (int end = start + 1; end <= nums.length; end++) {
            int sum = 0;
            for (int i = start; i < end; i++)
                sum += nums[i];
            if (sum == k)
                count++;
        }
    }
    return count;
}