class Solution {
    public int[] runningSum(int[] nums) {
        int [] sums=new int[nums.length];
        for(int i =0 ; i<nums.length;i++){
            if(i==0){
                sums[i]=nums[i];
            }
            else{
                sums[i]=sums[i-1]+nums[i];
            }
        }
        return sums;
        
    }
}
