// Answer to this lies in thing that - after binary search ends i.e first at the last iteration start will be equal to end and after that in the next iteration for the cond where target is smaller than mid the end will become mid-1 so now start > end => Binary search stops so at that the answer to this ques of search insert position will always lie at the start pointers index, and same for the cond where target is greater than mid.

class Solution {
    public int searchInsert(int[] nums, int target) {
       int start=0;
       int end=nums.length-1;

       while(start<=end){
        int mid=(start+end)/2;

            if(nums[mid]==target){
                return mid;
            }

            else if(target>nums[mid]){
                start=mid+1;
            }
            else{
                end=mid-1;
            }
       }
    return start; 
}
}