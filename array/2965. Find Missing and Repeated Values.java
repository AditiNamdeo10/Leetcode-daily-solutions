//Problem : 2965. Find Missing and Repeated Values
//Topic : HashMap

class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        HashMap<Integer,Integer> hash= new HashMap<>();
        for(int i=0;i<grid.length;i++){
            for(int j=0; j<grid[0].length; j++){
                hash.put(grid[i][j],hash.getOrDefault(grid[i][j],0)+1);
            }
        }
        int max=-1;
        for(int key : hash.keySet()){
            int curr=hash.get(key);
            if(curr==2){
                max=key;
            }
        }
        int missing=-1;
        int n=grid.length;
        for(int i=1;i<=n*n;i++){
            if(!hash.containsKey(i)){
                missing=i;
            }
        }
        return new int[]{max, missing};
    }
}