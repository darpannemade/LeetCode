// This is the Dutch National Flag algorithm in which we will have three pointers - l,m,h -> low , medium , high -> in this if m==0 -> then ( swap(l,m) & l++ & m++) | if m==1 -> then (m++) | if m==2 -> (swap(h,m) & h--) and we will do this till mid<=high. 

class Solution {
    public void sortColors(int[] nums) {
        int l=0;
        int m=0;
        int h=nums.length-1;
        
        while(m<=h){
            if(nums[m]==0){
               swap(nums,l,m);
                l++;
                m++;
            }

            else if(nums[m]==1){
                m++;
            }

            else{
                swap(nums,h,m);
                h--;
            }
        }
    }
    
    public void swap(int[] nums,int i, int j){
        int k=nums[i];
        nums[i]=nums[j];
        nums[j]=k;
    }
    
    
    }