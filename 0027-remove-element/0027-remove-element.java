// Will use two pointer approach say one ptr and other as i - so we will traverse the array such that we will have ptr=0 and i will traverse then if arr[i] != val then we will put that value at the ptr and then ptr++ and i++ -- this will enable us to use the same array to store the elements that are not equal to the the target value and remove the same elements automatically. Dry run if you want to understand properly;

class Solution {
    public int removeElement(int[] nums, int val) {
        int ptr=0;

        for(int i=0;i<nums.length;i++){
            if(nums[i] != val){
                nums[ptr]=nums[i];
                ptr++;
            }
        }
        return ptr;
    }
}