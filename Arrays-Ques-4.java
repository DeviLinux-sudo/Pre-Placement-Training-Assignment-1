public class PlusOne {
    public int[] plusOne(int[] digits) {
        int n = digits.length;
        
        // Start from the least significant digit
        for (int i = n - 1; i >= 0; i--) {
            // Increment the digit and check for carry
            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            } else {
                digits[i] = 0;
            }
        }
        
        // If all digits are 9, create a new array with an additional leading 1
        int[] newDigits = new int[n + 1];
        newDigits[0] = 1;
        
        return newDigits;
    }

    public static void main(String[] args) {
        PlusOne plusOne = new PlusOne();
        int[] digits = {1, 2, 3};
        int[] result = plusOne.plusOne(digits);
        for (int digit : result) {
            System.out.print(digit + " ");
        }
        // Output: 1 2 4
    }
}
