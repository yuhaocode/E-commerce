public class Solution {
    public int[] constructRectangle(int area) {
        int[] ans = new int[2];
        if(area == 0){
            return ans;
        }
        int sq = (int)Math.sqrt(area);
        while(area % sq != 0){
            sq--;
        }
        ans[0] = area / sq;
        ans[1] = sq;
        return ans;
        
    }
}
