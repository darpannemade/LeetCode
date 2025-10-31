// To solve this question first we will convert the num array into string array and then we will sort the string array in lexicographical manner and use it in reverse direct. and also if we have a two digit number in the array then for that we will have to check that the comb of the that number with the other numbers that which will return the max.

class Solution {
    public String largestNumber(int[] nums) {

        String arr[]=new String[nums.length];

        for(int i=0;i<nums.length;i++){
            arr[i]=nums[i]+"";    // This is used to type cast the elements in string format and add the ele.
        }

        Arrays.sort(arr,(s1,s2)->(s1+s2).compareTo(s2+s1));

        StringBuilder sb=new StringBuilder("");

        for(int i=arr.length-1;i>=0;i--){
            sb.append(arr[i]);
        }
        

        if(sb.charAt(0)=='0'){
            return "0";
        }
        else{
            return sb.toString();
        }
        
    }
}