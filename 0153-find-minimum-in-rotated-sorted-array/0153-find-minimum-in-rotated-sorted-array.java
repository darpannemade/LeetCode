// To get the time complx - logN - we will use binary search approach - so first of all - in the rotated array when we find mid - the array will have two parts and atleast one of the parts from both will be always sorted and then to find which part is sorted we will have this cond - arr[start]<=arr[mid] --> 1st half sorted and if arr[mid]<=arr[end] --> 2nd half sorted. So now the minimum element will never be in the sorted part it will always be at the point like a break between sorted and unsorted half i.e it will always have numbers greter than it on the left as well as right.

class Solution {
    public int findMin(int[] nums) {
        if(nums.length==1){
            return nums[0];
        }

        else if(nums[0]<nums[nums.length-1]){       // Already sorted array
            return nums[0];
        }


        int start=0;
        int end=nums.length-1;

        while(start<=end){
            int mid=(start+end)/2;

            if(mid!=0 && nums[mid-1]>nums[mid]){
                return nums[mid];
            }

            else if(mid!=nums.length-1 && nums[mid]>nums[mid+1]){
                return nums[mid+1];
            }

            else if(nums[start]<=nums[mid]){        // Left part is sorted
                start=mid+1;
            }
        
            else{                                  // Right part is sorted
                end=mid-1;      
            }
        }

        return -1;

    }
}