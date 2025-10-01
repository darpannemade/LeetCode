class Solution {
    public boolean isPalindrome(int x) {
        if(x<0){                // Negative numbers are not palindrome
            return false;
        }

        int revnum=0;
        int n=x;

        while(n>0){
            int d =n%10;        // Last digit of the number
            revnum=revnum*10+d;     // adding the last digit to to the number
               
            n=n/10;
                    // Number is reversed
        }

        if(revnum==x){
            return true;
        }
        else{
            return false;
        }


    }
}