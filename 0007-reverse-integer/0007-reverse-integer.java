import java.util.*;
class Solution {
    public int reverse(int x) {
        int revnum = 0;
        while (x != 0) {
            int digit = x % 10;
            x = x / 10;

          
            if (revnum > Integer.MAX_VALUE / 10 || (revnum == Integer.MAX_VALUE / 10 && digit > 7)) 
                return 0; // overflow positive side
            if (revnum < Integer.MIN_VALUE / 10 || (revnum == Integer.MIN_VALUE / 10 && digit < -8)) 
                return 0; // overflow negative side

            revnum = revnum * 10 + digit;
        }
        return revnum;
    }
}
