//Comparator
public class Solution {
        class Type{
        int pos;
        int num;
        public Type(int pos, int num){
            this.pos = pos;
            this.num = num;
        }
    }
    public String[] findRelativeRanks(int[] nums) {
        PriorityQueue tPQ = new PriorityQueue(new typePriorityQueue());
        for(int i = 0; i < nums.length; i++){
            tPQ.add(new Type(i, nums[i]));
        }
        String[] ans = new String[nums.length];
        int rank = 1;
        while(!tPQ.isEmpty()){
            Type type = (Type)tPQ.poll();
            if(rank == 1){
                ans[type.pos] = "Gold Medal";
            }
            else if(rank == 2){
                ans[type.pos] = "Silver Medal";
            }
            else if(rank == 3){
                ans[type.pos] = "Bronze Medal";
            }
            else{
                ans[type.pos] = String.valueOf(rank);
            }
            rank++;
        }
        return ans;
    }
    class typePriorityQueue implements Comparator<Type>{
        public int compare(Type a , Type b){
            return b.num - a.num;
        }
    }

}
