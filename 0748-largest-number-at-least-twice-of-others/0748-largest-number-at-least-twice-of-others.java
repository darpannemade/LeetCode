// Approach except brute force is that we can find max and second max and if max >= 2*secondmax then return index or else return -1.

class Solution {
    public int dominantIndex(int[] nums) {
        int max=-1;
        int smax=-1;     // Second max
        int maxindx=0;

        for(int i=0;i<nums.length;i++){
            
            if(nums[i]>max){
                smax=max;
                max=nums[i];
                maxindx=i;

            }

            else if(nums[i]>smax){
                smax=nums[i];
            }
        }

        if(max>=smax*2){
            return maxindx;
        }
        else{
            return -1;
        }
    }
}