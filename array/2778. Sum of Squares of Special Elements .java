// Problem : 2778. Sum of Squares of Special Elements 

class Solution {
    public int sumOfSquares(int[] nums) {
        int sumsq=0;
        int n=nums.length;
        for(int i=1; i<=n; i++){
            if(n%i==0){
                sumsq+=(nums[i-1]*nums[i-1]);
            }
        }
        return sumsq;
    }
}