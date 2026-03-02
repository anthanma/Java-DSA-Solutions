class Solution {
    public int lastStoneWeight(int[] stones) {
         //by using priority queue or max heap
        PriorityQueue<Integer> max_heap= new PriorityQueue<>(Collections.reverseOrder());
        for(int stone : stones){
            max_heap.offer(stone);
        }
        while(max_heap.size()>1){
            int x=max_heap.poll();
            int y=max_heap.poll();
            if(x>y){
                max_heap.offer(x-y);
            }
        }
        if(max_heap.size()==0){
            return 0;
        }
        return max_heap.poll();
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
