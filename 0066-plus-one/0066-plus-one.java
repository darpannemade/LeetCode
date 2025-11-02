class Solution {
    public int[] plusOne(int[] digits) {
        int n=digits.length;

// IF the last digit is not 9 then simply add 1

        if(digits[n-1]!=9){
                digits[n-1]=digits[n-1]+1;
                return digits;
        }

// IF the last digit is 9

        else{

            // IF last digit is 9 then we will simply make last digit as 0(9+1=10 so 0) and then
            // add the 1 to second last digit.

            digits[n-1]=0;

            for(int i=n-2;i>=0;i--){

            // Now then IF second last digit is not 9 then we will just add the carry 1 to it 
                if(digits[i]!=9){
                    digits[i]=digits[i]+1;
                    return digits;
                }

            // But now if the second last digit is also 9 eg- 1 0 9 9 then again make that second last 0                and  follow the upper loops
               
               else{
                    digits[i]=0;
               }
            }
        
        // Now but for the case like 9 or 9 9 9 9 the above loops will return just making all 9's 0
        // and not getting the carry 1 for which we will make a new array with first ele as 1.

        int[] ans= new int[n+1];
        ans[0]=1;
        return ans;

        }
    }
}