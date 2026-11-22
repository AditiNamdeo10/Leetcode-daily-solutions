class Solution {
    public boolean checkString(String s) {

        int amax=Integer.MIN_VALUE;
        int bmax=Integer.MAX_VALUE;
        int i=0;
        while(i<s.length()){
            char curr=s.charAt(i);
            
            if(curr=='a'){
                amax=i;
            }else{
                bmax=i;
            }
            if(amax>bmax){
                return false;
            }

            i++;

        }
        return true;

    }
}

// Example 1:

// Input: s = "aaabbb"
// Output: true
// Explanation:
// The 'a's are at indices 0, 1, and 2, while the 'b's are at indices 3, 4, and 5.
// Hence, every 'a' appears before every 'b' and we return true.


// Example 2:

// Input: s = "abab"
// Output: false
// Explanation:
// There is an 'a' at index 2 and a 'b' at index 1.
// Hence, not every 'a' appears before every 'b' and we return false.


// Example 3:

// Input: s = "bbb"
// Output: true
// Explanation:
// There are no 'a's, hence, every 'a' appears before every 'b' and we return true.