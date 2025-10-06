// The approach we will be taking is we will have three ints(first , second and third) all initialised to infinity value - then we will check every element in the array such that if it is less than first then make it first value and then if the elements is greater than first then make it second and third will have the value of element greater than second -- so if all this three happens then return true else false. 

class Solution {
    public boolean increasingTriplet(int[] nums) {
        int first=Integer.MAX_VALUE;
        int second=Integer.MAX_VALUE;
        int third=Integer.MAX_VALUE;

        for(int i=0;i<nums.length;i++){

        int element=nums[i];

        if(first>=element){
            first=element;
        }
        else if(second>=element){
            second=element;
        }
        else{
            third=element;
            return true;
        }
           }
        return false;

    }
}