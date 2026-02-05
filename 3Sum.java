import java.util.*;
class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> ans = new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            int left=i+1;
            int right=nums.length-1;
            if(i>0 && nums[i]==nums[i-1]){ // for excluding duplicate for i
                continue;
            }
            while(left<right){
                int sum=nums[left]+nums[i]+nums[right];
                if(sum==0){
                    ans.add(Arrays.asList(nums[left],nums[i],nums[right]));
                    while(left<right && nums[left]==nums[left+1]){ // for excluding duplicate of left
                        left++;
                    }
                    while(left<right && nums[right]==nums[right-1]){// for excluding duplicate of right 
                        right--;
                    }
                    // if no duplicate present we will move the pointer to the next unique number 
                    left++;
                    right--;
                }
                else if(sum<0){
                    left++;
                }
                else{
                    right--;
                }
            }

        }
        return ans;
        
    }
}
