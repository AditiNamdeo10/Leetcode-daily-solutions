//Problem : 3498. Reverse Degree of a String
//Daily practice problem

class Solution {
    public int reverseDegree(String s) {
        int sum=0;
        for(int i=0;i<s.length();i++){
            int curr=s.charAt(i);
            int val=('z'-curr)+1;
            sum+=val*(i+1);
        }
        return sum;
    }
}