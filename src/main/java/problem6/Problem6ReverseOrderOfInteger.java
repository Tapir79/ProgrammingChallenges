package problem6;

public class Problem6ReverseOrderOfInteger {

        public static void main(String[] args) {

            reverseOrder(123);
            reverseOrder(345);
            reverseOrder(147);

            isPalindrome(454);
            isPalindrome(123321);
            isPalindrome(123);

        }

        public static void isPalindrome(int i){
            int reversed = reverseOrder(i);

            if(i == reversed){
                System.out.println("Is palindrome");
            }
            else{
                System.out.println("Not a palindrome");
            }
        }

        public static int reverseOrder(int i) {

            int original = i;
            int reversed = 0;

            while (i > 0) {
                int remainder = i % 10; //remainder of i divided by ten
                reversed = reversed * 10 + remainder;
                i = i / 10;
            }

            System.out.println("Original:"+original);
            System.out.println("Reversed:"+reversed);

            return reversed;
        }
    }

