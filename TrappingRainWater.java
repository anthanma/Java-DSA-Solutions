class Solution {

    public int trap(int[] height) {
        int left = 0;
        int right = height.length - 1;
        
        int leftMax = 0;
        int rightMax = 0;
        
        int totalWater = 0;
        
        while (left < right) {  
            if (height[left] <= height[right]) {
                // Handle Left Side
                if (height[left] >= leftMax) {
                    leftMax = height[left]; // New highest wall on left
                } else {
                    totalWater += leftMax - height[left]; // Trap water
                }
                left++; 
            } else {
                // Handle Right Side
                if (height[right] >= rightMax) {
                    rightMax = height[right]; // New highest wall on right
                } else {
                    totalWater += rightMax - height[right]; // Trap water
                }
                right--; 
            }
        }
        
        return totalWater;
    }
    //first solution(32/34 test case passed and rest two came witn runtime error because of time complexity was big )
    // public int trap(int[] height) {
    //     //Main Logic- for every index i ther amout of water water it can hold is , 
    //     // min(left max, right max)-height[i]
    //     int total_water=0;


    //     for(int i=0;i<height.length;i++){
    //         // we need to fine the highest bar at left of i and highest bar at right of i
    //         //highest bar at left of i 
    //         int left=0;
    //         int right=height.length-1;
    //         int left_max=0;
    //         int right_max=height.length-1;

            
    //         //highest bar at left of i
    //         while(left<i){
    //             if(height[left]>height[left_max]){
    //                 left_max=left;
    //             }
    //             left++;
    //         }

    //         //heighest bar at right of i
    //         while(right>i){
    //             if(height[right]>height[right_max]){
    //                 right_max=right;
    //             }
    //             right--;
    //         }
    //         if(height[left_max]>height[i] && height[right_max]>height[i]){
    //             total_water=total_water + Math.min(height[left_max],height[right_max])-height[i];
    //         }
        
    //     }
    //     return total_water;
    // }
}
