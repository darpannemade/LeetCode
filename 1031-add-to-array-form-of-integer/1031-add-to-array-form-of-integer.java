// We cannot use the common approach that converting the given array in integer then adding k and then reconverting it in the array because of the carry -- int can store numbers till 9 digits so for the carry it would be 10th digit which is not possible and if use long it uses 20 to 21 digits .

// So we will use different approach - we will use this - k/10 - removes last digit , k%10 - give last digit

// So we will get the last digit of k and then add that to the last element of array and then move to next element(i.e prev element in arr) and so on keep doing that and also maintain the carry.

// We will run the loop till pointer p >=0 and also till k>0 for cases where say arr=[1,2] but k=455


// class Solution {
//     public List<Integer> addToArrayForm(int[] num, int k) {
//         List<Integer> ans=new ArrayList<>();        // New arraylist to store the added number

//         int p=num.length-1;         // pointer p
//         int carry=0;

//         while(p>=0 || k>0 || carry>0){
//              int numval=0;

//              if(p>=0){
//                 numval=num[p];      // To handle the case where num= [0]
//              }

//              int d=k%10;        // Last digit of k

//              int sum=numval+d+carry;        //Adding the arrayslist last element with k last digit

//              int digit=sum%10;      // Digit that is to be added in the new arraylist of addition
//              carry=sum/10;

//              ans.add(digit);        // Add the final ans to the arraylist ans

//              p--;           // Moving the pointer
//              k=k/10;        // removing the last digit of k for the upcoming iterations


//             // Now the answer i.e the addition is stored in the reverse order and also if the sum of the 
//             // first digit also gives carry that part is to be added--

//             if(carry>0){
//                 ans.add(carry);
//             }
//         }
//         Collections.reverse(ans);
//         return ans;

//     }
// }


class Solution {
    public List<Integer> addToArrayForm(int[] num, int k) {
        List<Integer> ans = new ArrayList<>();
        int p = num.length - 1;

        while(p >= 0 || k > 0){
            if(p >= 0){
                k += num[p];
                p--;
            }
            ans.add(k % 10);
            k /= 10;
        }

        Collections.reverse(ans);
        return ans;
    }
}
