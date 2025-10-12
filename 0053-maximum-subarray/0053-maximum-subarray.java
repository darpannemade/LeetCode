// We are going to use Kandane's Algorithm in this in this we will have currsum and maxsum , initialising both with nums[0] , now if the element i.e nums[i] > currsum+nums[i] -> then it will start its new subarray and if not i.e the nums[i] is less than the sum of currsum+nums[i] then it will be added in the currsum.

class Solution {
    public int maxSubArray(int[] nums) {
      int maxsum=nums[0];
      int currsum=nums[0];

      for(int i=1;i<nums.length;i++){
        if(currsum+nums[i]>nums[i]){
            currsum+=nums[i];
        }
        else{
            currsum=nums[i];
        }

        maxsum=Math.max(maxsum,currsum);

      }
        return maxsum;
    }
}