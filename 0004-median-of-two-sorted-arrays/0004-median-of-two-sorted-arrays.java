// This is one approach and another approach is three pointer approach where one pointer(p1) to nums1 other to nums2 (p2) and third to new array(p3) and
//will compare the p1 and p2 for smaller number and smaller one will be added to p3 i.e new array and then find the median. 

class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n1 = nums1.length;
        int n2 = nums2.length;
        
        int[] merged = new int[n1 + n2];
        
        for(int i=0;i<n1;i++){
            merged[i]=nums1[i];
        }

        for(int j=0;j<n2;j++){
            merged[n1+j]=nums2[j];
        }

        Arrays.sort(merged);
        
        int len=merged.length;

    // Odd length
        if(len%2==1){
            return merged[len/2];
        }
    // Even length array
        else{
            return (merged[len/2-1]+merged[len/2])/2.0;
        }
        
    }
}
