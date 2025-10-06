// Approach we will use is we will have a currsum and maxsum where currsum will store the sum of subarray and the maxsum will store the maxsum sum out of all the subarrays.And then to find the currsum we will iterate such that we will if the element at i is greater than prev value(i-1) if yes then add to currsum cause if its greater than prev => that it is ascending order => it can be part of the subarray. And will do this till the current element is bigger than prev as soon as its smaller means a new subarray is starting. And will check the currsum with the maxsum at every end of currsum.

class Solution {
    public int maxAscendingSum(int[] nums) {
        int max=nums[0];
        int currmax=nums[0];

        for(int i=1;i<nums.length;i++){
            if(nums[i-1]<nums[i]){
                currmax=currmax+nums[i];
            }
            else{
                max=Math.max(max,currmax);
                currmax=nums[i];
            }
        }
        max=Math.max(max,currmax);
        return max;
    }
}