//Problem : 3536. Maximum Product of Two Digits

class Solution {
    public int maxProduct(int n) {
        int first=0;
        int second=0;

        while(n>0){
            int temp=n%10;
            n=n/10;
            
            if(temp>=first){
                second=first;
                first=temp;
            }else if(temp>second){
                second=temp;
            }
        }
        return first*second;
    }
}