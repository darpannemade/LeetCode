// For this we will use this approach - so to get the area of water present we will have to find the nearest maximum sized wall on both the left and right of the index and then subtract the height of the wall at that index itself to get the water. So for getting the nearest max walls heights we will use two arrays LeftMax and RightMax - which will store the maximum value of the heights of the indexes and we will initialise this arrays with first height and then progressively compare the values of heights and max value in this arrays.

class Solution {
    public int trap(int[] height) {
        int n= height.length;

        int[] leftmax = new int[n];

        leftmax[0]=height[0];
        for(int i=1;i<n;i++){
            leftmax[i]=Math.max(leftmax[i-1],height[i]);
        }

        int[] rightmax=new int[n];

        rightmax[n-1]=height[n-1];

        for(int i=n-2;i>=0;i--){
            rightmax[i]=Math.max(rightmax[i+1],height[i]);
        }

        int ans=0;
        
        for(int i=0;i<n;i++){
            ans+=Math.min(leftmax[i],rightmax[i])-height[i];

        }
        return ans;
    }
}