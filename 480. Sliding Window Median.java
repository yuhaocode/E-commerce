public class Solution {
    PriorityQueue<Integer> minQ = new PriorityQueue<Integer>();
    PriorityQueue<Integer> maxQ = new PriorityQueue<Integer>(new Comparator<Integer>(){
       @Override
        public int compare(Integer a, Integer b){
            return b.compareTo(a);
        }
    });
    public double[] medianSlidingWindow(int[] nums, int k) {
        if(nums.length == 0){
            return new double[0];
        }
        double[] ans = new double[nums.length - k + 1];
        for(int i = 0; i < nums.length; i++){
            if(i < nums.length){
                addInt(nums[i]);
            } 
            if(i >= k - 1){
                double median = getMedian();
                ans[i - k + 1] = median;
                
                remove(nums[i - k + 1]);
                
            }
        }
        return ans;
    }
    public void addInt(int num){   
        if(num >= getMedian()){
            minQ.add(num);
        }
        else{
            maxQ.add(num);
        }
        if(minQ.size() < maxQ.size()){
            minQ.add(maxQ.poll());
        }
        if(maxQ.size() + 1< minQ.size()){
            maxQ.add(minQ.poll());
        }
    }
    
    public void remove(int num){
        if(num < getMedian()){
            maxQ.remove(num);
        }
        else{
            minQ.remove(num);
        }
        if(minQ.size() < maxQ.size()){
            minQ.add(maxQ.poll());
        }
        if(maxQ.size() + 1 < minQ.size()){
            maxQ.add(minQ.poll());
        }
    }
    public double getMedian(){
        if(minQ.size() == 0){
            return 0;
        } 
        else if(minQ.size() == maxQ.size()){
            return ((double) minQ.peek() + (double) maxQ.peek()) / 2.0;
        }
        else{
            
            return minQ.peek();
        }
        
    }
    
}

