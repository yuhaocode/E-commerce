public class Solution{
  public static ArrayList<int[]> threeContinue(int[] nums){
        ArrayList<int[]> ans = new ArrayList<int[]>();
        if(nums.length < 3){
            return ans;
        }
        Arrays.sort(nums);
        int index = 0;
        for(int i = 0; i < nums.length - 2; i++){
            if(i < nums.length - 2 && nums[i] == nums[i + 1]){
                i = i + 1;
            }
            if(nums[i] + 1 == nums[i + 1]){
                index = i + 1;
                while(nums[index] < nums.length - 1 && nums[index] == nums[index + 1]){
                    index += 1;
                }
                if(nums[index] + 1 == nums[index + 1]){
                    ans.add(new int[]{nums[i] , nums[index],nums[index + 1]});
                }
                i = index - 1;
            }
        }
        return ans;
    }
}
