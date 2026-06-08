//Problem : 1295. Find Numbers with Even Number of Digits
class Solution {
    public int findNumbers(int[] nums) {
        int count=0;
        int c=0;
        for(int i=0; i<nums.length; i++){
            c=0;
            while(nums[i]>0){
                nums[i]=nums[i]/10;
                c+=1;
            }
            if(c%2==0){
                count+=1;
            }
        }
        return count;
        
    }
}