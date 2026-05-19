//Problem: Baseball Game
//Topic: Stack

class Solution {
    public int calPoints(String[] operations) {
        Stack <Integer> st= new Stack<>();
        int a,b,c;
        for(String ch : operations){
                if(ch.equals("C")){
                    st.pop();
                    
                }else if(ch.equals("D")){
                    c=st.get(st.size()-1)*2;
                    st.push(c);   
                             
                }else if(ch.equals("+")){
                    a=st.get(st.size()-1);
                    b=st.get(st.size()-2);
                    c=a+b;
                    st.push(c);

                }else{
                st.push(Integer.parseInt(ch));
                }
        }   
        int sum=0;
        for(int x : st){
            sum+=x;
        }     
        return sum;
    }
}