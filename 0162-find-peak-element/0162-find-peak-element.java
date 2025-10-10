// Approach is Binary Search for log N - so to check peak element - the elements neighbouring to the number both should be greater than the current element. So first start and end pointers - we will check them if they are peak elements and if not then start with start+1 and end-1, find the mid and check if mid is the peak element i.e neighbouring elements are greater or not and if not then again at that point chances of peak elements is greater for the neighbor who is greater than the other neighbour bcoz obv the smaller element was smaller than the current so no chance it can be peak so we will move to that neighbor which is greater and make end =mid-1 then again find mid and check till we get the element.

class Solution {
    public int findPeakElement(int[] nums) {
        int start=0;
        int end=nums.length-1;

        if(nums.length==1){
            return 0;
        }

    // Checking for first and last element if they are peak elements as element before first is -infinity and after last is infinity

        else if(nums[0]>nums[1]){
            return 0;
        }

        else if(nums[nums.length-1]>nums[nums.length-2]){
            return nums.length-1;
        }

        else{

            start=1;
            end=nums.length-2;

            while(start<=end){

                int mid=(start+end)/2;

                if(nums[mid]>nums[mid-1] && nums[mid]>nums[mid+1]){
                    return mid;
                }
                else if(nums[mid]<nums[mid+1]){
                    start=mid+1;
                }
                else{
                    end=mid-1;
                }
            }
            
            return -1;
        }   
    }
}