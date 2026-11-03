class Solution {
    public int minMoves(int[] nums) {
        int inc=0;
        int max=nums[0];
        for(int i=1;i<nums.length;i++){
            if(max<nums[i]){
                max=nums[i];
            }
        }

        for(int i=0;i<nums.length;i++){
            inc+=max-nums[i];
        }
        return inc;
    }
}

// Example 1:

// Input: nums = [2,1,3]

// Output: 3

// Explanation:

// To make all elements equal:

// Increase nums[0] = 2 by 1 to make it 3.
// Increase nums[1] = 1 by 1 to make it 2.
// Increase nums[1] = 2 by 1 to make it 3.
// Now, all elements of nums are equal to 3. The minimum total moves is 3.