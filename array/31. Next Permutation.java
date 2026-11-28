class Solution {
    public void nextPermutation(int[] nums) {
        int idx=-1;
        int n=nums.length;
        
        for(int i=n-2; i>=0; i--){
            if(nums[i]<nums[i+1]){
                idx=i;
                break;
            }
        }

        if(idx==-1){
            reverse(nums,0,n-1);
            return;
        }

        for(int i=n-1; i>idx ; i--){
            if(nums[i]>nums[idx]){
                int temp=nums[idx];
                nums[idx]=nums[i];
                nums[i]=temp;

                break;
            }
        }

        reverse(nums,idx+1,n-1);
        return;
    }

    public void reverse(int[] arr, int start, int end){
        while(start<end){
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;

            start++;
            end--;
        }
        return;
    }
}

// Time Complexity: O(N)
// Space Complexity: O(1)

// Examples:

// The next permutation of arr = [1, 2, 3] is [1, 3, 2].
// The next permutation of arr = [2, 3, 1] is [3, 1, 2].
// The next permutation of arr = [3, 2, 1] is [1, 2, 3] 
// because [3, 2, 1] does not have a lexicographical larger rearrangement.


// Example 1:

// Input: nums = [1,2,3]
// Output: [1,3,2]

// Example 2:

// Input: nums = [3,2,1]
// Output: [1,2,3]

// Example 3:

// Input: nums = [1,1,5]
// Output: [1,5,1]