// The logic behind this will be say if we draw and check say till n=15 means if 15 bulbs are there then at the end of the final round the number of bulbs that are on will be equal to number of perfect squares occuring in the range of the number of bulbs - here in range of 15 - [1,4,9] means three bulbs will be on.

class Solution {
    public int bulbSwitch(int n) {
        int count=0;
        int i=1;

        while(i*i<=n){
            count++;
            i++;
        }
        return count;
    }
}