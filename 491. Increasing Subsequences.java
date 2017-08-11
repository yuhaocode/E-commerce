public class Solution {
    public List<List<Integer>> findSubsequences(int[] nums) {
        Set<List<Integer>> ans = new HashSet<>();
        dfs(ans , nums, 0, Integer.MIN_VALUE, new ArrayList<Integer>());
        List<List<Integer>> res = new ArrayList(ans);
        return res;
    }
    public void dfs(Set<List<Integer>> ans, int[] nums,int start, int num , List<Integer> temp){
        if(temp.size() >= 2){
            ans.add(new ArrayList<Integer>(temp));
        }
        for(int i = start; i < nums.length; i++){
            if(nums[i] >= num){
                temp.add(nums[i]);
                num = nums[i];
                dfs(ans, nums, i+1, num, temp);
                temp.remove(temp.size() - 1);
                num = (temp.size() == 0) ?  Integer.MIN_VALUE : temp.get(temp.size() - 1);
            }
        }
    }
}
