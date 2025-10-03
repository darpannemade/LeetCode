// Approach used is - will first initialise max and smax i.e second max int as -1 since in the constraints values can be greater or equal to 1. Then in the array we will check if the i'th elemenent is greter than max or small if greater then will first make smax value as max and then replace max with the arrays i'th value and so on till the end of the array

class Solution {
    public int maxProduct(int[] nums) {
        int max=-1;
        int smax=-1;

        for(int i=0;i<nums.length;i++){
            if(nums[i]>max){
                smax=max;
                max=nums[i];
            }

            else if(smax<nums[i]){
                smax=nums[i];
            }
        }

        return ((max-1)*(smax-1));
    }
}