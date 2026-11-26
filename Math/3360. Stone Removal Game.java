class Solution {
    public boolean canAliceWin(int n) {

        int curr=10;
        int c=1;
        while(n>=curr){
            n-=curr;
            curr--;
            c++;
        }
        if(c%2==0){
            return true;
        }else{
            return false;
        }
    }
}

// Example 1:
// Input: n = 12

// Output: true

// Explanation:

// Alice removes 10 stones on her first turn, leaving 2 stones for Bob.
// Bob cannot remove 9 stones, so Alice wins.


// Example 2:
// Input: n = 1

// Output: false

// Explanation:

// Alice cannot remove 10 stones, so Alice loses.