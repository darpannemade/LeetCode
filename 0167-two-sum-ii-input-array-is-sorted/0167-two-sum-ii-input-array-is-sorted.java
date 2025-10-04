// Approach we will use is will have a start and end pointer - and then check the elements at the pointer whether their sum is equal to target or not. And since the array is sorted means sum will increase from left to right and decrease from right to left -- so if say num[start]+num[end] is smaller than target value then we will move the start++ and recheck cause the sum will increase and say if sum is greater than the target value then we will move the end-- which will make sum smaller and will do till target is reached.

class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int str=0;
        int end=numbers.length-1;
        int[] ans=new int[2];

        while(str<end){
            int sum=numbers[str]+numbers[end];

            if(sum==target){
                ans[0]=str+1;
                ans[1]=end+1;
                return ans;
            }

            else if(sum<target){
                str++;
            }

            else{
                end--;
            }
        }
        return ans;
    }
}