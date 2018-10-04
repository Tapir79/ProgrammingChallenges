import org.junit.Test;
import problem6.Problem6;

import static org.junit.Assert.*;

public class Problem6Test {

    @Test
    public void TestReverseOrder() {
        Problem6 tester = new Problem6();

        int reversed = tester.reverseOrder(123);
        int reversed2 = tester.reverseOrder(579);

        assertEquals(321, reversed);
        assertEquals(975, reversed2);
    }

    @Test
    public void TestPalindrome() {
        Problem6 tester = new Problem6();

        boolean isPalindrome1 = tester.isPalindrome(123);
        boolean isPalindrome2 = tester.isPalindrome(123321);
        boolean isPalindrome3 = tester.isPalindrome(555);
        boolean isPalindrome4 = tester.isPalindrome(123456789);

        assertEquals(false, isPalindrome1);
        assertEquals(true, isPalindrome2);
        assertEquals(true, isPalindrome3);
        assertEquals(false, isPalindrome4);
    }
}
