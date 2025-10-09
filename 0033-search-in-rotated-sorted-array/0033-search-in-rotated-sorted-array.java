// To get the time complx - logN - we will use binary search approach - so first of all - in the rotated array when we find mid - the array will have two parts and atleast one of the parts from both will be always sorted and then to find which part is sorted we will have this cond - arr[start]<=arr[mid] --> 1st half sorted and if arr[mid]<=arr[end] --> 2nd half sorted. We are finding the sorted path so that if target is present in the sorted half when 1st half is sorted - then we can have end=mid-1; and if target is present in the sorted half when 2nd half is sorted - then we can have start=mid+1 ; Also can use same logic if the target is present in unsorted part. 


class Solution {
    public int search(int[] nums, int target) {
        int start=0;
        int end=nums.length-1;

        while(start<=end){
            int mid=(start+end)/2;

            if(nums[mid]==target){
                return mid;
            }

            else if(nums[start]<=nums[mid]){        // 1st half sorted 
                
                if(target>=nums[start] && target<nums[mid]){
                    end=mid-1;
                }
                else{
                    start=mid+1;
                }
            }

            else{                                   // 2nd half sorted
                
                if(target>=nums[mid] && target<=nums[end]){
                    start=mid+1;
                }
                else{
                    end=mid-1;
                }
            }
        }

        return -1;
    }
}