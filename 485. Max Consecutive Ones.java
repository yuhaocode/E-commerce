public class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int ans = 0;
        if(nums.length == 0 || nums == null){
            return 0;
        }
        int temp = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] == 0){ 
                temp = 0;
            }
            if(nums[i] == 1){
                temp += 1;
                ans = Math.max(temp, ans);
            }
        }
        return ans;
    }
}
