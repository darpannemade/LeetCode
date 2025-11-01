// This can be solved by simply iterating through using loop and counting the no. of pos no and neg no but it will be having time complexity as O(n). But here we are asked if you can solve using O(log N) so do that and since the array is sorted and we need O(log N) we will use Binary search to solve this ques.

class Solution {
    public int maximumCount(int[] nums) {
        int lastnegindx=lastNegative(nums)+1;
        int firstpostindx=nums.length-firstPositive(nums);

        return Math.max(lastnegindx,firstpostindx);
    }

    public int lastNegative(int[] nums){
        int start=0;
        int end=nums.length-1;

        int ans=-1;

        while(start<=end){
            int mid = (start+end)/2;

            if(nums[mid]<0){
                ans=mid;
                start=mid+1;
            }

            else{
                end=mid-1;
            }
        }

        return ans;
    }

    public int firstPositive(int[] nums){
        int start=0;
        int end=nums.length-1;
        int ans=nums.length;

        while(start<=end){
            int mid=(start+end)/2;

            if(nums[mid]>0){
                ans=mid;
                end=mid-1;
            }
            else{
                start=mid+1;
            }
        }

        return ans;
    }
}