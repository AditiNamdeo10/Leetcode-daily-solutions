class Solution {
    public int longestMonotonicSubarray(int[] nums) {
        int maxSub=1;
        int currSub=1;
        for(int i=1;i<nums.length;i++){
            if(nums[i-1]<nums[i]){
                currSub++;
            }else{
                maxSub=Math.max(currSub,maxSub);
                currSub=1;
            }
        }
        maxSub=Math.max(maxSub,currSub);

        currSub=1;
        for(int i=1;i<nums.length;i++){
            if(nums[i-1]>nums[i]){
                currSub++;
            }else{
                maxSub=Math.max(currSub,maxSub);
                currSub=1;
            }
        }
        maxSub=Math.max(maxSub,currSub);

        return maxSub;
    }
}

// Example 1:

// Input: nums = [1,4,3,3,2]
// Output: 2

// Explanation:

// The strictly increasing subarrays of nums are [1], [2], [3], [3], [4], and [1,4].

// The strictly decreasing subarrays of nums are [1], [2], [3], [3], [4], [3,2], and [4,3].
// Hence, we return 2.

// Example 2:

// Input: nums = [3,2,1]
// Output: 3

// Explanation:

// The strictly increasing subarrays of nums are [3], [2], and [1].

// The strictly decreasing subarrays of nums are [3], [2], [1], [3,2], [2,1], and [3,2,1].

// Hence, we return 3.