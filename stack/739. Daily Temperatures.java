\\Problem: Daily Temperatures
\\Topic: Monotonic Stack

class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int n=temperatures.length;
        Stack<Integer> st= new Stack<>();
        int ans[]=new int[n];
        for(int i=n-1; i>=0; i--){
            
            while(!st.isEmpty() && temperatures[st.peek()]<=temperatures[i]){
                st.pop();
            }
            if(st.isEmpty()){
                ans[i]=0;
            }else{
                int m = st.peek();
                ans[i]=m-i;
            }
            st.push(i);
        }
        return ans;
    }
}

