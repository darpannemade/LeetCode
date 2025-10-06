// The approach we will be using is we will have str and end ptr at start and end of array - then for height --  we will check which values of str and end is min cause that is the max height of water we can have so min of str and end value will be the height ; So then for iterating we will iterate such that since we req max area- so we will move the pointer of str and end based on which is smaller - like if str is small than end then str++ else end-- in the hope that the next number is bigger than current and also we will store the maxarea from the first iteration and after every iteration check that and update it whether we got bigger area or not and now about calculating width -- width = difference of  indx values of (end-str)


class Solution {
    public int maxArea(int[] height) {
        int maxarea=0;
        int str=0;
        int end=height.length-1;

        while(str<end){
            int heighth=Math.min(height[str],height[end]);
            int width=end-str;

            int area=width*heighth;

            if(area>maxarea){
                maxarea=area;
            }
            
            if(height[str]<height[end]){
                str++;
            }
            else{
                end--;
            }

        }
        return maxarea;
    }
}