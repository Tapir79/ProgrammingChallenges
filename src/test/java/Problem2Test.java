import org.junit.Test;
import problem2.Problem2;
import static org.junit.Assert.*;

public class Problem2Test {

    int[] list = {1, 3, 4, 5, 6, 7, 8, 9, 10, 11};
    int[] list2 = {1, 2, 4, 5, 6, 7, 8, 9, 10, 11};
    int[] list3 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20};

    @Test
    public void TestMissingNumbers(){
        Problem2 tester = new Problem2();

        assertEquals(2,tester.findOne(list));

        assertEquals(3,tester.findOne(list2));

        assertEquals(10,tester.findOne(list3));

    }

}

