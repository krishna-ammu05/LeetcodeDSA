package PlusOne;
class Solution {
    public static int[] plusOne(int[] digits){
        for(int i=digits.length-1;i>=0;i--){
            if(digits[i]<9){
                digits[i]=digits[i]+1;
                return digits;
            }
           digits[i]=0;
        }
        int[] newNumber = new int[digits.length+1];
        newNumber[0]=1;
        return newNumber;
    }
}