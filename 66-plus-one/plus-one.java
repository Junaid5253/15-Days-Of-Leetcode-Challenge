class Solution {
    public int[] plusOne(int[] digits) {
        int l = digits.length;
        for(int i = l - 1; i>=0; i--){
            if(digits[i] + 1 != 10){
                digits[i] += 1;
                return digits;
            }else{
                digits[i] = 0;

            } 

        }
        int[] newDigits = new int[l + 1];
            newDigits[0] = 1;
            return newDigits;
    }
}