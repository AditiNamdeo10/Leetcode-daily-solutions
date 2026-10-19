//2089. Find Target Indices After Sorting Array.java

class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {
        int lessThanTargetCounter=0;
        int targetCounter=0;
        for(int num: nums){
            if(num<target){
                lessThanTargetCounter++;
            }else if(num==target){
                targetCounter++;
            }
        }

        List<Integer> ans= new ArrayList<>();
        for(int i=0; i<targetCounter; i++){
            ans.add(lessThanTargetCounter+i);
        }
        return ans;
    }
}

// class Solution {
//     public List<Integer> targetIndices(int[] nums, int target) {
//         Arrays.sort(nums);
//         List<Integer> ans= new ArrayList<>();
//         for(int i=0;i<nums.length;i++){
//             if(nums[i]==target){
//                 ans.add(i);
//             }
//         }
//         return ans;
//     }
// }


// Example 1:

// Input: nums = [1,2,5,2,3], target = 2
// Output: [1,2]
// Explanation: After sorting, nums is [1,2,2,3,5].
// The indices where nums[i] == 2 are 1 and 2.
// Example 2:

// Input: nums = [1,2,5,2,3], target = 3
// Output: [3]
// Explanation: After sorting, nums is [1,2,2,3,5].
// The index where nums[i] == 3 is 3.