class Solution {
    public boolean isHappy(int n) {
        HashSet<Integer> set= new HashSet<>();
        while(n!=1 && !set.contains(n) ){
            set.add(n);

            int sum=0;
            while(n>0){
                int curr=n%10;
                sum+=(curr*curr);
                n=n/10;
            }
            n=sum;
        }
        return n==1;
    }
}

// Example 1:

// Input: n = 19
// Output: true
// Explanation:
// 12 + 92 = 82
// 82 + 22 = 68
// 62 + 82 = 100
// 12 + 02 + 02 = 1


// Example 2:

// Input: n = 2
// Output: false