// Day 3 : Remove duplicates from sorted array 2
// Approach : Two pointer

class Solution {
    public int removeDuplicates(int[] nums) {
        
      int temp=nums[0];
      int k=0;
      int c=0;

      for(int i=0;i<nums.length;i++){
        if(nums[i]!=temp){
            nums[k++]=nums[i];
            temp=nums[i];
            c=1;
        }else{
            if(c<=1){
                nums[k++]=nums[i];
                c++;
            }
        }
      }
      return k;
    
    }
}
