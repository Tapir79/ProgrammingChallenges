import org.junit.Test;
import problem3.Problem3;

import java.util.ArrayList;
import java.util.HashSet;

import static org.junit.Assert.*;

public class Problem3Test {

    @Test
    public void TestRemovingDuplicatesWithHashSet() {

        ArrayList<Integer> original = new ArrayList<>();
        original.add(1);
        original.add(1);
        original.add(2);
        original.add(3);
        original.add(3);
        original.add(4);
        original.add(5);

        HashSet<Integer> expected = new HashSet<>();
        expected.add(1);
        expected.add(2);
        expected.add(3);
        expected.add(4);
        expected.add(5);

        Problem3 tester = new Problem3();
        assertEquals(expected, tester.useHashSet(original));
    }

    @Test
    public void TestRemovingRepeatingValuesWithHashSet() {

        ArrayList<Integer> original = new ArrayList<>();
        original.add(1);
        original.add(1);
        original.add(2);
        original.add(3);
        original.add(1);
        original.add(3);
        original.add(4);
        original.add(5);

        HashSet<Integer> expected = new HashSet<>();
        expected.add(1);
        expected.add(2);
        expected.add(3);
        expected.add(4);
        expected.add(5);

        Problem3 tester = new Problem3();
        assertEquals(expected, tester.useHashSet(original));
    }

    @Test
    public void TestRemovingDuplicateValuesNoAPI() {

        ArrayList<Integer> original = new ArrayList<>();
        original.add(1);
        original.add(1);
        original.add(2);
        original.add(3);
        original.add(3);
        original.add(4);
        original.add(5);

        ArrayList<Integer> expected = new ArrayList<>();
        expected.add(1);
        expected.add(2);
        expected.add(3);
        expected.add(4);
        expected.add(5);

        Problem3 tester = new Problem3();
        assertEquals(expected, tester.removeRepeatingValuesWithoutCollectionAPI(original));
    }

    @Test
    public void TestRemovingRepeatingValuesNoAPI() {

        ArrayList<Integer> original = new ArrayList<>();
        original.add(1);
        original.add(1);
        original.add(2);
        original.add(3);
        original.add(1);
        original.add(3);
        original.add(4);
        original.add(5);

        ArrayList<Integer> expected = new ArrayList<>();
        expected.add(1);
        expected.add(2);
        expected.add(3);
        expected.add(4);
        expected.add(5);

        Problem3 tester = new Problem3();
        assertEquals(expected, tester.removeRepeatingValuesWithoutCollectionAPI(original));
    }

    @Test
    public void TestFindingRepeatingValuesNoAPI() {
        ArrayList<Integer> original = new ArrayList<>();
        original.add(1);
        original.add(1);
        original.add(2);
        original.add(3);
        original.add(1);
        original.add(3);
        original.add(4);
        original.add(5);

        HashSet<Integer> expected = new HashSet<>();
        expected.add(1);
        expected.add(3);

        Problem3 tester = new Problem3();
        assertEquals(expected, tester.findRepeatingValuesWithoutCollectionAPI(original));
    }

    @Test
    public void TestFindingDuplicateValuesNoAPI() {

        ArrayList<Integer> original = new ArrayList<>();
        original.add(1);
        original.add(1);
        original.add(2);
        original.add(3);
        original.add(1);
        original.add(3);
        original.add(4);
        original.add(5);

        HashSet<Integer> expected = new HashSet<>();
        expected.add(1);
        expected.add(3);

        Problem3 tester = new Problem3();
        assertEquals(expected, tester.findRepeatingValuesWithoutCollectionAPI(original));

    }
}
