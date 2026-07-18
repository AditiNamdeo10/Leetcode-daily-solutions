//Problem : 1979. Find Greatest Common Divisor of Array

class Solution {
    public int findGCD(int[] nums) {  
        int min=nums[0];
        int max=nums[0];

        for(int i=0; i<nums.length;i++){
            if(min>nums[i]){
                min=nums[i];
            }
            if(max<nums[i]){
                max=nums[i];
            }

            
        }
        return gcd(min,max);
    }

    public int gcd(int a,int b){
        while(b!=0){
            int temp=b;
            b=a%b;
            a=temp;
        }
        return a;
    }



        // int n=nums.length;
        // int[] arr=nums.clone();
        

        // Arrays.sort(arr);
        // int small=arr[0];
        // int large=arr[n-1];
        // for(int i=small;i>0;i--){
        //     if(small%i==0 && large%i==0){
        //         return i;
        //     }
        // }
        // return -1;
}