//Problem : 2574. Left and Right Sum Differences

//OPTIMIZED
class Solution {
    public int[] leftRightDifference(int[] nums) {
        int leftSum=0;
        int rightSum=0;
        int[] answer= new int[nums.length];

        for(int num :nums){
            rightSum+=num;
        }

        for(int i=0; i<nums.length;i++){
            rightSum-=nums[i];
            answer[i]=Math.abs(leftSum-rightSum);

            leftSum+=nums[i];
        }
        return answer;
    }
}


//BRUTE FORCE 
class Solution {
    public int[] leftRightDifference(int[] nums) {
        int n=nums.length;
        int [] leftSum = new int[n];
        int [] rightSum = new int[n];
        int [] answer = new int[n];

        for(int i=0;i <n; i++){
            
            for(int j=0; j<n ;j++){
                if(i>j){
                    leftSum[i]+=nums[j];
                }else if(i<j){
                    rightSum[i]+=nums[j];
                }
            }
            answer[i]=Math.abs(leftSum[i]-rightSum[i]);
        }

        return answer;
    }
}
