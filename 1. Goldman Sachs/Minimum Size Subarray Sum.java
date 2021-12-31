Leetcode problem 209-
Minimum Size Subarray Sum:


class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int minSize = Integer.MAX_VALUE;
        int left =0;
        int sum =0;
        for(int right =0;right<nums.length;right++){
            sum+= nums[right];
            while(sum>=target){
                minSize =Math.min(minSize,right+1-left);
                sum-= nums[left];
                left++;
                
            }
        }
        return(minSize!=Integer.MAX_VALUE)? minSize:0;
        
    }
}
