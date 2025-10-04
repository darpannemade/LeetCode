// We have two approach one is square all the elements and then sort the array but the complexity will be (nlogn) but we want O(n) so will use three pointer approach - In this at nums start - str pointer and end - end pointer and new array last pos. - ptr pointer so we will square both start and end and compare both the greater one will be in the new array and then move the pointer of which the element in greater - we are doing this so that we can compare both the negative and positive numbers square so that even after squaring the values will be sorted ... and we will do this till the start and end pointer of org array cross each other.

class Solution {
    public int[] sortedSquares(int[] nums) {

        int[] arr=new int[nums.length];
        int str=0;
        int end=nums.length-1;

        int ptr=arr.length-1;

        while(str<=end){
          //Start sqaure (ss)  
          int ss = nums[str] * nums[str];
          // end square(es)
          int es=nums[end] * nums[end];
          if(ss>es){
            arr[ptr]=ss;
            str++;
          }

          else{
            arr[ptr]=es;
            end--;
          }
          ptr--;
        }

        return arr;
    }
}