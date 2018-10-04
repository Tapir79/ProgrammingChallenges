import org.junit.Test;
import problem4.Problem4;
import static org.junit.Assert.*;

public class Problem4Test {

    int[] list = {1, 3, 4, 5, 6, 7, 8, 9, 10, 11};
    int[] list2 = {1, 2, 4, 5, 6, 7, 8, 9, 10, 11};
    int[] list3 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20};

    int[] expected1 = {1, 11};
    int[] expected2 = {1, 11};
    int[] expected3 = {1, 20};

    int[] emptyList = {};

    @Test
    public void TestMissingNumbers() {
        Problem4 tester = new Problem4();

        int[] smallestLargest1 = tester.findSmallestAndLargest(list);
        int[] smallestLargest2 = tester.findSmallestAndLargest(list2);
        int[] smallestLargest3 = tester.findSmallestAndLargest(list3);

        assertEquals(expected1[0], smallestLargest1[0]);
        assertEquals(expected1[1], smallestLargest1[1]);

        assertEquals(expected2[0], smallestLargest2[0]);
        assertEquals(expected2[1], smallestLargest2[1]);

        assertEquals(expected3[0], smallestLargest3[0]);
        assertEquals(expected3[1], smallestLargest3[1]);
    }

    @Test
    public void TestEmptyList() {

        Problem4 tester = new Problem4();

        // get the return statement with an empty list
        int[] testerlist = tester.findSmallestAndLargest(emptyList);

        // test if the returned was an empty list
        assertEquals(emptyList.length, testerlist.length);
    }
}