// Problem: 628. Maximum Product of Three Numbers

class Solution {
    public int maximumProduct(int[] nums) {
        int n1= Integer.MIN_VALUE;
        int n2= Integer.MIN_VALUE;
        int n3= Integer.MIN_VALUE;

        int min1=Integer.MAX_VALUE;
        int min2=Integer.MAX_VALUE;

        for(int curr : nums){

            if(curr>n1){
                n3=n2;
                n2=n1; 
                
                n1=curr;
               
            }else if(curr>n2){
                n3=n2;
                n2=curr;
            }else if(curr>n3){
                n3=curr;
            }

            if(curr<min1){
                min2=min1;
                min1=curr;
            }else if(curr<min2){
                min2=curr;
            }
        }
        return Math.max(n1*n2*n3,n1*min1*min2);
        
    }
}