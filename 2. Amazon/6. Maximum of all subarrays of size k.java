//Maximum of all subarrays of size k(SLIDING WINDOW MAXIMUM) : 
//BRUTE FORCE

class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int n = nums.length;
        int[] result = new int[n-k+1];
        for(int i=0;i<=n-k;i++){
            int max=nums[i];
        
            for(int j=i;j<i+k;j++){
            max = Math.max(max,nums[j]);
              }
             result[i] = max;
        } 
        
    
    
         return result;  
        
    }
}
// using deque optimised
class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int n = nums.length;
        int[] r = new int[n-k+1];
        int ri=0;//store index
        Deque<Integer> q = new ArrayDeque<>();
        for(int i =0;i<nums.length;i++){
            //remove numbers out of range k
            if(!q.isEmpty() && q.peek() == i-k){
                q.poll();
            }
            // remove smaller numbers in k range as they are useless 
            while(!q.isEmpty() && nums[q.peekLast()] <=nums[i]){
                q.pollLast();
            }
            q.offer(i);
            if(i>=k-1){
                r[ri++] =nums[q.peek()];
            }
        }
        return r;
        
        
        
    }
}
