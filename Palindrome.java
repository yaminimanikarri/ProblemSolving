package problemSolvingEasy;

public class Palindrome {

    public static boolean isPalindrome(int x) {
        if (x >= 0) {
            int originalNumber = x;
            int reversedNumber = 0;
            // Reverse the number
            while (x != 0) {
                int digit = x % 10; // gives last digit
                reversedNumber = reversedNumber * 10 + digit;
                x /= 10; // removed last digit
            }
            // Check if the original number is equal to the reversed number
            return originalNumber == reversedNumber;

        } else {
            return false;
        }
    }



    public static void main(String[] args) {
        int number = 12321; // Example number
        boolean result = isPalindrome(number);

        if (result) {
            System.out.println(number + " is a palindrome.");
        } else {
            System.out.println(number + " is not a palindrome.");

        }
    }
}
