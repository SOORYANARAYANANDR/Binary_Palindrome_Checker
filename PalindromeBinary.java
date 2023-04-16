public class PalindromeBinary {
    public static boolean isPalindromeBinary(int n) {
        String binary = Integer.toBinaryString(n);
        int length = binary.length();
        for (int i = 0; i < length / 2; i++) {
            if (binary.charAt(i) != binary.charAt(length - i - 1)) {
                return false;
            }
        }
        return true;
    }
    
    public static void main(String[] args) {
       
        int n = 10;//give our value here
        boolean isPalindrome = isPalindromeBinary(n);
        System.out.println("Binary representation of " + n + " is " + Integer.toBinaryString(n));
        if (isPalindrome) {
            System.out.println("Binary representation of " + n + " is a palindrome.");
        } else {
            System.out.println("Binary representation of " + n + " is not a palindrome.");
        }
    }
}

