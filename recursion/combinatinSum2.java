import java.util.*;
class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates); //because why not either way we are getting 2^n time complexity

        List<List<Integer>> ans= new ArrayList<>();
        List<Integer> temp= new ArrayList<>();

        fun(candidates ,ans,temp,target,0,0);
        return ans;
    }
    public void fun(int [] arr ,List<List<Integer>> ans ,List<Integer> temp,int target,int i,int currentsum){
        //base case 
        if(currentsum==target){
            ans.add(new ArrayList<>(temp));
            return;
        }
        if(currentsum>target || i>=arr.length){
             return;
        }
        
        
        //recursive step 
        //pick
        temp.add(arr[i]);
        fun(arr,ans,temp,target,i+1,currentsum+arr[i]);

        //not pick
        temp.remove(temp.size()-1);
        while(i<arr.length -1 && arr[i]==arr[i+1]){
            i++;
        }
        fun(arr,ans,temp,target,i+1,currentsum);
    }
}
