class Solution {
    public int countOdds(int low, int high) {
        // int count =0;
        // for(int i=low; i<=high; i++){
        //     if((i & 1) == 1 )
        //         count++;
        // }   
        // return count;
        
        if(high % 2 != 0  && low % 2 != 0) {
            return (high - low + 1) / 2 + 1;
        }
        return (high - low + 1) / 2;
    }
      
}
