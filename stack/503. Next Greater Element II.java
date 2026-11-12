class Solution {
    public int[] nextGreaterElements(int[] nums) {
        Stack <Integer> st= new Stack<>();
        int n=nums.length;
        int[] nge= new int[n];
        for(int i=2*n-1; i>=0; i--){
            while(!st.isEmpty() && st.peek()<=nums[i%n]){
                st.pop();
            }
            if(i<n){
                if(st.isEmpty()){
                    nge[i]=-1;
                }else{
                    nge[i]=st.peek();
                }
            }
            st.push(nums[i%n]);
        }
        return nge;
    }
}

// Example 1:

// Input: nums = [1,2,1]
// Output: [2,-1,2]
// Explanation: The first 1's next greater number is 2; 
// The number 2 can't find next greater number. 
// The second 1's next greater number needs to search circularly, which is also 2.


// Example 2:

// Input: nums = [1,2,3,4,3]
// Output: [2,3,4,-1,4]