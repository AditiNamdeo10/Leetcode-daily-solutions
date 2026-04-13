// Day 2 : Remove duplicates from sorted array
// Approach : Two pointer

class Solution {
    public int removeDuplicates(int[] nums) {
    int k=1;
    int temp=nums[0];
    for(int i=1;i<nums.length;i++){
        if(nums[i]!=temp){
            nums[k++]=nums[i];
        }
    temp=nums[i];
    }
    return k;
        
    }
}