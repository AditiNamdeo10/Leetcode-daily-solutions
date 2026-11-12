class Solution {
    public boolean isMiddleElementUnique(int[] nums) {
        int n=nums.length;
        int mid=n/2;
        if(n==1){
            return true;
        }
        for(int i=0;i<n;i++){
            if(i==mid){
                continue;
            }
            if(nums[i]==nums[mid]){
                return false;
            }
        }
        return true;
    }
}

// Example 1:

// Input: nums = [1,2,3]

// Output: true

// Explanation:

// The middle element of nums is 2, which appears exactly once.

// Thus, the answer is true.


// Example 2:

// Input: nums = [1,2,2]

// Output: false

// Explanation:

// The middle element of nums is 2, which appears twice.

// Thus, the answer is false.

 

// Constraints:

// 1 <= n == nums.length <= 100
// n is odd.
// 1 <= nums[i] <= 100

//Time complexity = O(N)
//Space complexity = O(1)