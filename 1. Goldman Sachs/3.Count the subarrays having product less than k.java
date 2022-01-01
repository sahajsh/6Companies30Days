/*Problem 3:
Count the subarrays having product less than k
*/

class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        int res = 0;
        int p=1;
        int n = nums.length;
        int s=0;
        int e=0;
        while(e<n){
            p = p*nums[e];
            if(p>=k){
                while(s<e && p>=k){
                    p =p/nums[s];
                    s++;
                }
            }
            if(p<k){
                int l = e-s+1;
                res = res+l;
            }
            e++;
        }
        return res;
    }
   }

    
