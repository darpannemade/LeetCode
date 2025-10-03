class Solution {
    public int missingNumber(int[] nums) {
        int currsum=0;
        int actualsum;
        int range=nums.length;  
        actualsum=(range*(range+1))/2;                  // n(n+1)/2 to find the sum of all numbers in range

        for(int i=0;i<nums.length;i++){
            currsum=currsum+nums[i];
        }

        return (actualsum-currsum);          // Returns the number missing 
    }
}