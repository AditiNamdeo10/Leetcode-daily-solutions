//Problem : 1470. Shuffle the Array

class Solution {
    public int[] shuffle(int[] nums, int n) {
        int [] ans= new int[n*2];
        int j=0;
        int k=0;
        for(int i=0;i<n;i++){
            ans[k++]=nums[j++];
            ans[k++]=nums[n+i];
        }
        nums=ans;
        return nums;
        
    }
}