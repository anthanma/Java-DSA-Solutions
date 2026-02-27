class Solution {
    public int lastStoneWeight(int[] stones) {
        
    }
    // public int lastStoneWeight(int[] stones) {
    //     if(stones.length==1){
    //         return stones[0];
    //     }
    //     Arrays.sort(stones);
    //     while(stones[stones.length-2]!=0){
    //         int last=stones.length-1;
    //         int sec_last=stones.length-2;
    //         if(stones[last]==stones[sec_last]){
    //             stones[last]=0;
    //             stones[sec_last]=0;
    //         }
    //         else{
    //             stones[last]-=stones[sec_last];
    //             stones[sec_last]=0;
    //         }
    //          Arrays.sort(stones);
    //     }
    //     return stones[stones.length-1];
    // }
}
